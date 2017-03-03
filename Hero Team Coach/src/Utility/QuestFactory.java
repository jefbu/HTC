package Utility;

import java.util.Random;

import Entity.Quests.LocalDungeon;
import Entity.Quests.Quest;
import Entity.Quests.TrollUnderTheBridge;

public class QuestFactory {
	
	Random random = new Random();
	
	
	
	
	
	
	public Quest generateQuest() {
		
		int typeQuest = random.nextInt(2);
		
		switch (typeQuest) {
		
		case 0: return new LocalDungeon();
		case 1: return new TrollUnderTheBridge();
		
		}
		
		return new LocalDungeon();
		
	}

}
