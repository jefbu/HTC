package Entity.Quests.Incidents;

import Graphics.GameScreen;
import Utility.QuestOrder;

public class FairyIsland extends Incident {
	
	public FairyIsland() {
		
		title = "Dancing with the Faeries";
		introduction = "intro";
		output = "output";
		questOrder = QuestOrder.HOMEWARD;
		
	}
	
	public void outcome() {
		
		initiate();
		
		GameScreen.questScreen.textLabel.rollText(introduction + output);
		GameScreen.questSequence++;
		
	}

}
