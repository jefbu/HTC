package Entity.Quests;

import java.util.Random;

import Entity.Quests.Incidents.DrunkInATavern;
import Entity.Quests.Incidents.FairyIsland;
import Entity.Quests.Incidents.HeroIsLate;
import Entity.Quests.Incidents.HiddenTreasure;
import Entity.Quests.Incidents.MobOfGoblins;
import Entity.Quests.Incidents.TrollUnderTheBridgeConclusion;

public class TrollUnderTheBridge extends Quest {

	Random random = new Random();

	public TrollUnderTheBridge() {

		potentialBeginningIncidents.add(new HeroIsLate());
		potentialEnrouteIncidents.add(new DrunkInATavern());
		potentialEnrouteIncidents.add(new MobOfGoblins());
		potentialAtLocationIncidents.add(new HiddenTreasure());
		potentialConclusionIncidents.add(new TrollUnderTheBridgeConclusion());
		potentialHomewardIncidents.add(new FairyIsland());

		fillQuest(potentialBeginningIncidents, 1, potentialEnrouteIncidents, 2, potentialAtLocationIncidents, 1,
				potentialConclusionIncidents, 1, potentialHomewardIncidents, 1);

		this.title = "Troll Under the Bridge";
		this.focus = "Combat";

		this.risk = 20 + random.nextInt(21);
		this.cash = 25 + random.nextInt(21);
		this.loot = 25 + random.nextInt(21);
		this.fame = 15 + random.nextInt(16);

		this.contractFee = 20000 + random.nextInt(31) * 1000;

	}

}
