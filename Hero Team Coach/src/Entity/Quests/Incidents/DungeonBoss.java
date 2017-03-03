package Entity.Quests.Incidents;

import Graphics.GameScreen;
import Utility.QuestOrder;

public class DungeonBoss extends Incident {
	
	public DungeonBoss() {
		
		title = "The Obligatory Bossfight... \n \n";
		introduction = "introduction \n";
		output = "output ";
		questOrder = QuestOrder.CONCLUSION;
	
}

public void outcome() {
	
	initiate();
	
	GameScreen.questScreen.textLabel.rollText(introduction + output);
	GameScreen.questSequence++;
	
}

}
