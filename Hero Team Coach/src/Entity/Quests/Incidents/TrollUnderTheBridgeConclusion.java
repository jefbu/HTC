package Entity.Quests.Incidents;

import Graphics.GameScreen;

public class TrollUnderTheBridgeConclusion extends Incident {
	
	public TrollUnderTheBridgeConclusion() {
		
		title = "The Troll Under the Bridge";
		introduction = "intro";
		output = "output";
		
	}
	
	public void outcome() {
		
		initiate();
		
		GameScreen.questScreen.textLabel.rollText(introduction + output);
		GameScreen.questSequence++;
		
	}

}
