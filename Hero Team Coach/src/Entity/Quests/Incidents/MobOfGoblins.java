package Entity.Quests.Incidents;

import java.util.ArrayList;
import java.util.Random;

import Entity.Hero;
import Entity.Mob;
import Entity.Status;
import Graphics.GameScreen;
import Utility.QuestOrder;

public class MobOfGoblins extends Incident {
	
	Random random = new Random();
	
	public MobOfGoblins() {
		
		title = "Mob of Goblins \n \n";
		introduction = "three \n";
		output = "nine";
		
		enemies = new ArrayList<Mob>();
		
		questOrder = QuestOrder.ENROUTE;
		int enemies = random.nextInt(3) + 3;
		
		for (int i = 0; i < enemies; i++) {
			
		this.enemies.add(Mob.Goblin);
		
		}
	}
	
	public void outcome() {
		
		initiate();
		
		GameScreen.questScreen.textLabel.rollText(introduction + output);
		
		GameScreen.questScreen.imageLabel.setIcon(imageLoader.loadImageIcon("/Images/Incidents/MobOfGoblins.png"));
		GameScreen.questSequence++;
		
	}
	

}
