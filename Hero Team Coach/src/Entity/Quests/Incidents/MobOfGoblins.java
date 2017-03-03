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
		
		GameScreen.questScreen.textLabel.rollText(introduction + output);
		
		GameScreen.questScreen.imageLabel.setIcon(imageLoader.loadImageIcon("/Images/Incidents/MobOfGoblins.png"));
		GameScreen.questSequence++;
		
	}
	

}
