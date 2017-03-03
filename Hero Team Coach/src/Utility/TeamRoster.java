package Utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

import Entity.Hero;
import Entity.Relation;
import Entity.Role;
import Graphics.GameScreen;

public class TeamRoster {

	public static ArrayList<Hero> teamRosterList = new ArrayList<Hero>();

	public TeamRoster() {

		int listmax;
		listmax = 6;
		boolean goOn = true;

		while (goOn) {
			Random random = new Random();
			int roll = random.nextInt(100);
			if (roll > GameScreen.difficulty)
				listmax++;
			else
				goOn = false;
		}

		for (int i = 0; i < listmax; i++) {

			TeamRoster.teamRosterList.add(HeroFactory.generateRandomHero());
			
			if (i == 0)
				teamRosterList.get(i).role = Role.blacksmith;
			
			else if (i == 1)
				teamRosterList.get(i).role = Role.accountManager;
			

			else if (i < 8)
				teamRosterList.get(i).role = Role.quest;
			
			

			Random random2 = new Random();
			int roll = random2.nextInt(10) + 1;
			if (roll > 8) {
				if (i > 0) {

					TeamRoster.teamRosterList.get(i).heroRelations
							.add(new Relation(TeamRoster.teamRosterList.get(i - 1), 50, "Friend"));

				}
			}
			
			if(TeamRoster.teamRosterList.get(i).heroRelations.size() > 0) {
			}
			Collections.sort(teamRosterList, new Comparator<Hero>() {
				@Override
				public int compare(Hero p1, Hero p2) {
					return p2.maturity - p1.maturity;
				}

			});
		}
		
	}

}
