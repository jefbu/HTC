package Entity.Quests.Incidents;

import java.util.ArrayList;
import java.util.Random;

import Entity.Armour;
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


}




