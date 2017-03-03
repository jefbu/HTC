package Entity.Quests.Incidents;

import java.util.Random;

import javax.swing.Timer;

import Entity.Status;
import Entity.Trait;
import Graphics.GameScreen;
import Utility.QuestOrder;

public class HeroIsLate extends Incident {

	Timer timer;

	public HeroIsLate() {
	
		title = "A Timely Departure? \n \n";
		introduction = "Dawn breaks. A ragtag collection of heroes meanders towards an agreed upon departure spot. Their quest before them young and unknown, like the first chapter in a book. \n";
		questOrder = QuestOrder.BEGINNING;

	}

	public void outcome() {

		output = "Luckily, everyone arrived on time";
		Random random = new Random();
		int alreadyHasLateHero = 0;

		initiate();


		for (int i = 0; i < GameScreen.questers.size(); i++) {

			int tooLate = 0;
			
			if (GameScreen.questers.get(i).heroTraits.contains(Trait.hero_lazy)) {
				tooLate += 75;
			}
			
			if (random.nextInt(100) > (95 - tooLate + (alreadyHasLateHero * 100))) {
				output = "Hero " + GameScreen.questers.get(i).name + " arrived too late";
				GameScreen.questers.get(i).status = Status.LATE;
				GameScreen.questers.get(i).questCombat = 0;
				GameScreen.questers.get(i).questSkill = 0;
				GameScreen.questers.get(i).questIntelligence = 0;
				GameScreen.questers.get(i).questPersonality = 0;
				alreadyHasLateHero++;
			}

		}
		
		GameScreen.questScreen.textLabel.rollText(introduction + output);

		GameScreen.questScreen.imageLabel.setIcon(imageLoader.loadImageIcon("/Images/Incidents/HeroIsLate.png"));
		GameScreen.questSequence++;

	}

}
