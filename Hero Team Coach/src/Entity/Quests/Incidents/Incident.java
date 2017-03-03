package Entity.Quests.Incidents;

import java.util.ArrayList;
import java.util.Random;

import Entity.Armour;
import Entity.Hero;
import Entity.Mob;
import Entity.Status;
import Entity.Weapon;
import Graphics.GameScreen;
import Graphics.ImageLoader;
import Graphics.Screens.QuestScreen;
import Utility.QuestOrder;

public abstract class Incident {
	
	public String title;
	public String output;
	public String introduction;

	
	public QuestOrder questOrder;
	
	public ArrayList<Mob> enemies;
	public ArrayList<Weapon> weapons;
	public ArrayList<Armour> armour;
	
	protected ImageLoader imageLoader = new ImageLoader();


public Incident() {

}

public void outcome() {
	
}

public void initiate() {
	
	GameScreen.questScreen.textFinished = false;
	
	Random random = new Random();
	
	for (int i = 0; i < GameScreen.questers.size(); i++) {
		
		if (GameScreen.questers.get(i).status == Status.LATE) {
			
			int roll = random.nextInt(10) + 1;
			int result = roll * GameScreen.questSequence;
			
			if (result > 20) {
				GameScreen.questers.get(i).status = Status.HEALTHY;
				GameScreen.questers.get(i).questCombat = GameScreen.questers.get(i).combat;
				GameScreen.questers.get(i).questSkill = GameScreen.questers.get(i).skill;
				GameScreen.questers.get(i).questIntelligence = GameScreen.questers.get(i).intelligence;
				GameScreen.questers.get(i).questPersonality = GameScreen.questers.get(i).personality;
			}
			
		}
		
	}
		
	QuestScreen.fillQuestersPanel();
	GameScreen.questScreen.textLabel.setText(title);
	
	}

public String combat() {
	
	Random random = new Random();
	
	int heroCombat = 0;
	int enemyCombat = 0;
	
	for (Hero quester: GameScreen.questers) {
		heroCombat = heroCombat + quester.questCombat;			
	}
	
	heroCombat = heroCombat + random.nextInt(250);
	
	for (Mob goblin: enemies) {
		enemyCombat = enemyCombat + goblin.combat;			
	}
	
	enemyCombat = enemyCombat + random.nextInt(200);

	
	if (heroCombat < enemyCombat) {
					
		int activeCombatants = 0;
		for (Hero quester: GameScreen.questers) {
			if (quester.status == Status.HEALTHY) activeCombatants ++;
		}
		
		for (int i = 0; i < activeCombatants; i++) {
			
			int roll = random.nextInt(10);
			if (roll < 2) {
				
				int proposedHero = random.nextInt(GameScreen.questers.size());
				while (GameScreen.questers.get(proposedHero).status != Status.HEALTHY) {
					proposedHero = random.nextInt(GameScreen.questers.size());
				}

				
				GameScreen.questers.get(proposedHero).status = Status.WOUNDED;
				output = output +  "Hero " + GameScreen.questers.get(proposedHero).name + " was wounded \n";
			}
			else if (roll < 5) {
				
				int proposedHero = random.nextInt(GameScreen.questers.size());
				while (GameScreen.questers.get(proposedHero).status != Status.HEALTHY) {
					proposedHero = random.nextInt(GameScreen.questers.size());
				}
				
				GameScreen.questers.get(proposedHero).questCombat -= random.nextInt(10);
				output = output + "Hero " + GameScreen.questers.get(proposedHero).name + " was slightly wounded \n";

			}
			
		}

	}
	
	else if (heroCombat  < enemyCombat * 2) {
		
		int activeCombatants = 0;
		for (Hero quester: GameScreen.questers) {
			if (quester.status == Status.HEALTHY) activeCombatants ++;
		}
		
		for (int i = 0; i < activeCombatants; i++) {
			
			int proposedHero = random.nextInt(GameScreen.questers.size());
			while (GameScreen.questers.get(proposedHero).status != Status.HEALTHY) {
				proposedHero = random.nextInt(GameScreen.questers.size());
			}
				GameScreen.questers.get(proposedHero).questCombat -= random.nextInt(5) + 1;
				output = output + "Hero " + GameScreen.questers.get(proposedHero).name + " was slightly wounded \n";
		}
		
	}
	
	return "hello world";
	
}


}




