package Entity.Quests.Incidents;

import Graphics.GameScreen;

public class HiddenTreasure extends Incident {
	
	public HiddenTreasure() {
		
		title = "A Hidden Treasure found";
		introduction = "intro";
		output = "output";
		
	}
	
	public void outcome() {
		
		initiate();
		
		GameScreen.questScreen.textLabel.rollText(introduction + output);
		GameScreen.questSequence++;
		
	}

}
