package Utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

import Entity.Hero;
import Entity.Job;
import Entity.Race;
import Graphics.GameScreen;

public class HeroFactory {

	public HeroFactory() {

	}

	public static Hero generateRandomHero() {

		Random random = new Random();
		Race race = RaceFactory.generateRace();
		String name = NameFactory.generateName(race);
		Job job = JobFactory.generateJob(race);

		int maturityRolls1 = random.nextInt(100 - (GameScreen.difficulty / 5));
		int maturityRolls2 = random.nextInt(100 - (GameScreen.difficulty / 5));
		int maturityRolls3 = random.nextInt(100 - (GameScreen.difficulty / 5));
		int maturity = (maturityRolls1 + maturityRolls2 + maturityRolls3) / 3;

		int baseCombat = 0;
		for (int i = 0; i < maturity; i++) {
			int roll = random.nextInt(100);
			if (roll < job.combatLevelUp)
				baseCombat++;
		}

		int baseSkill = 0;
		for (int i = 0; i < maturity; i++) {
			int roll = random.nextInt(100);
			if (roll < job.skillLevelUp)
				baseSkill++;
		}

		int baseIntelligence = 0;
		for (int i = 0; i < maturity; i++) {
			int roll = random.nextInt(100);
			if (roll < job.intelligenceLevelUp)
				baseIntelligence++;
		}

		int basePersonality = 0;
		for (int i = 0; i < maturity; i++) {
			int roll = random.nextInt(100);
			if (roll < job.personalityLevelUp)
				basePersonality++;
		}

		return new Hero(race, name, job, maturity, baseCombat, baseSkill, baseIntelligence, basePersonality);

	}

	public static Hero generateHRHero(int hrMaturity, int hrPersonality, int specialisation, int seniority, int strategy,
			int trial) {
		
		Random random = new Random();
		Race race = RaceFactory.generateRace();
		String name = NameFactory.generateName(race);
		Job job = JobFactory.generateHRJob(race, specialisation);
		
		int heroQuality = getHeroQuality(hrMaturity, hrPersonality, strategy);
		
		int maturity = 0;
		ArrayList<Hero> tempHeroes = new ArrayList<Hero>();
		
		for (int i = 0; i < heroQuality; i++) {
		
		switch (seniority) {
		case 1: maturity = random.nextInt(25) + 1; break;
		case 2: maturity = random.nextInt(40) + 11; break;
		case 3: maturity = random.nextInt(50) + 26; break;
		case 4: maturity = random.nextInt(50) + 41; break;
		}
		
		int baseCombat = 0;
		for (int ii = 0; ii < maturity; ii++) {
			int roll = random.nextInt(100);
			if (roll < job.combatLevelUp)
				baseCombat++;
		}

		int baseSkill = 0;
		for (int ii = 0; ii < maturity; ii++) {
			int roll = random.nextInt(100);
			if (roll < job.skillLevelUp)
				baseSkill++;
		}

		int baseIntelligence = 0;
		for (int ii = 0; ii < maturity; ii++) {
			int roll = random.nextInt(100);
			if (roll < job.intelligenceLevelUp)
				baseIntelligence++;
		}

		int basePersonality = 0;
		for (int ii = 0; ii < maturity; ii++) {
			int roll = random.nextInt(100);
			if (roll < job.personalityLevelUp)
				basePersonality++;
		}
		
		Hero hero = new Hero(race, name, job, maturity, baseCombat, baseSkill, baseIntelligence, basePersonality);
		tempHeroes.add(hero);
		
		}
		
	    Collections.sort(tempHeroes, new Comparator<Hero>() {
	        @Override public int compare(Hero p1, Hero p2) {
	            return p1.value - p2.value;
	        }

	    });

	    for (int x = 0; x < tempHeroes.size(); x++) {
	    System.out.println(tempHeroes.get(x).value);
	    }
	    return tempHeroes.get(0);
			
	}
	
	private static int getHeroQuality(int hrMaturity, int hrPersonality, int strategy) {
		
		Random random = new Random();
		int heroQuality = random.nextInt(10) + 1; // 1 - 10
		heroQuality += hrMaturity / 10; // 1 - 10 + 0 - 10
		heroQuality += hrPersonality / 20; // 1 - 10 + 0 - 10 + 0 - 5
		heroQuality += strategy * 2; // 1 - 10 + 0 - 10 + 0 - 5 + 2 - 8 = 3 - 33
		heroQuality = heroQuality / 10; // = 0 - 3
		return heroQuality;
		
	}
	

}
