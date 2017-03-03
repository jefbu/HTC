package Utility;

import java.util.ArrayList;
import java.util.Random;

import Entity.Hero;
import Entity.Role;
import Entity.Trait;
import Entity.Quests.Quest;

public class AvailableQuests {

	public ArrayList<Quest> availableQuests;
	Random random = new Random();
	QuestFactory questFactory = new QuestFactory();
	
	public AvailableQuests() {
		
		availableQuests = new ArrayList<Quest>();
		
		int questNumber = rollAmountOfQuests();
		for (int i = 0; i < questNumber; i++) {
		
			availableQuests.add(questFactory.generateQuest());
		
		}
		
	}
	
	
	public int rollAmountOfQuests() {
		
		Hero accountManager = null;
		int amount = 0;
		
		for (int i = 0; i < TeamRoster.teamRosterList.size(); i++) {
			if (TeamRoster.teamRosterList.get(i).role == Role.accountManager) {
				accountManager = TeamRoster.teamRosterList.get(i);
			}
			
		}
		
		int percentage = (accountManager.personality * 3 + accountManager.intelligence) / 4;
		if (accountManager.heroTraits.contains(Trait.hero_illiterate)) {
			percentage *=0.95;
		}
				
		boolean goOn = true;
		Random random = new Random();
		
		while(goOn) {
			amount++;
			if (random.nextInt(100) > percentage) goOn = false;
		}
		
		return amount;

		
		
	}
	
}
