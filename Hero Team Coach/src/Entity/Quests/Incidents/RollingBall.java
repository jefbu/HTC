package Entity.Quests.Incidents;

import Graphics.GameScreen;
import Utility.QuestOrder;

public class RollingBall extends Incident {
	
	public RollingBall() {
		
		title = "A Giant Rolling Boulder! \n \n";
		introduction = "introduction \n";
		output = "output ";
		questOrder = QuestOrder.ATLOCATION;
	
}

public void outcome() {
	
	initiate();
	
	GameScreen.questScreen.textLabel.rollText(introduction + output);
	GameScreen.questSequence++;
	
}

}
