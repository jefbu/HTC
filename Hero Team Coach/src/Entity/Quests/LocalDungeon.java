package Entity.Quests;

import java.util.Random;

import Entity.Quests.Incidents.Collapse;
import Entity.Quests.Incidents.DungeonBoss;
import Entity.Quests.Incidents.HeroIsLate;
import Entity.Quests.Incidents.HiddenTreasure;
import Entity.Quests.Incidents.MobOfGoblins;
import Entity.Quests.Incidents.RollingBall;

public class LocalDungeon extends Quest {
	
	Random random = new Random();
	
	public LocalDungeon() {
		
		potentialBeginningIncidents.add(new HeroIsLate());
		potentialEnrouteIncidents.add(new MobOfGoblins());
		potentialAtLocationIncidents.add(new RollingBall());
		potentialAtLocationIncidents.add(new HiddenTreasure());
		potentialConclusionIncidents.add(new DungeonBoss());
		potentialHomewardIncidents.add(new Collapse());

		fillQuest(potentialBeginningIncidents, 1, potentialEnrouteIncidents, 1, potentialAtLocationIncidents, 2,
				potentialConclusionIncidents, 1, potentialHomewardIncidents, 1);
		
		this.title = "Explore Local Dungeon";
		this.focus = "Combat";
		introduction = "Hello Team! \n \n"
				+ "The local government has offered a bid for a license to clean out a dungeon in the vicinity. \n"
				+ "Statistically, it likely has got at least one magical artifact, a few chests of gold; "
				+ "and some magic scrolls and potions. \n"
				+ "And well, lots of traps and zombies and possibly a boss fight at the end. \n"
				+ "But you know, that's the type of challenge you all enjoy, right? \n"
				+ "Why don't we go and check it out? \n \n"
				+ "Regards, your account manager, \n";
				
		
		this.risk = 30 + random.nextInt(21);
		this.cash = 15 + random.nextInt(21);
		this.loot = 30 + random.nextInt(21);
		this.fame = 20 + random.nextInt(16);
		
		this.contractFee = 30000 + random.nextInt(21) * 1000;
		
		
	}
	
}


