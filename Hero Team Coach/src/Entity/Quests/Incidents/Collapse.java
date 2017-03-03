package Entity.Quests.Incidents;

import Graphics.GameScreen;
import Utility.QuestOrder;

public class Collapse extends Incident {
	
	public Collapse() {
			
			title = "The Dungeon Collapses! \n \n";
			introduction = "introduction \n";
			output = "output ";
			questOrder = QuestOrder.HOMEWARD;
		
	}
	
	public void outcome() {
		
		initiate();
		
		GameScreen.questScreen.textLabel.rollText(introduction + output);
		GameScreen.questSequence++;
		
	}

}
