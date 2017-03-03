package Entity.Quests.Incidents;

import Graphics.GameScreen;
import Utility.QuestOrder;

public class DrunkInATavern extends Incident {
	
	public DrunkInATavern() {
		
		title = "Drunk in a Tavern \n \n";
		introduction = "one \n";
		output = "six";
		questOrder = QuestOrder.ENROUTE;
		
	}
	
	public void outcome() {
		
		initiate();
		
		GameScreen.questScreen.textLabel.rollText(introduction + output);
		GameScreen.questSequence++;
		
	}

}
