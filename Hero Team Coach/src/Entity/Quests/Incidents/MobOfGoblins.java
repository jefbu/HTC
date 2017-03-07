package Entity.Quests.Incidents;

import java.util.ArrayList;
import java.util.Random;

import Entity.Mob;
import Graphics.GameScreen;
import Utility.QuestOrder;

public class MobOfGoblins extends Incident {

	Random random = new Random();

	public MobOfGoblins() {

		title = "Mob of Goblins \n \n";
		introduction = "Your heroes had been walking for a long day, their destination still awhiles ahead."
				     + " Could they then be blamed and damned for slacking attention - just for a little blink of the eye?"
				     + " \n Regardless, lulled into pacified slumber by the monotony of the landscape, "
				     + "they found themselves suddenly ambushed by a pack of roving goblins. "
				     + "Large-nosed and vicious, cat-eyed and cruel, "
				     + "these creatures possessed a primitive sort of intelligence. "
				     + "It was quite impossible to negotiate with them, for they understood no language, "
				     + "but they did form social packs amongst themselves, somewhat like wolves.";
		output = "";

		enemies = new ArrayList<Mob>();

		questOrder = QuestOrder.ENROUTE;
		int enemyAmount = random.nextInt(3) + 3;

		for (int i = 0; i < enemyAmount; i++) {

			this.enemies.add(Mob.Goblin);

		}
	}

	@Override
	public void outcome() {

		initiate();

		combat(this);

		GameScreen.questScreen.textLabel.rollText(introduction + output);

		GameScreen.questScreen.imageLabel.setIcon(imageLoader.loadImageIcon("/Images/Incidents/MobOfGoblins.png"));
		GameScreen.questSequence++;

	}

}
