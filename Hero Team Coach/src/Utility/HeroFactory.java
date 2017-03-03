package Utility;

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
				if (roll < job.combatLevelUp) baseCombat ++;
			}
			
		int baseSkill = 0;
			for (int i = 0; i < maturity; i++) {
				int roll = random.nextInt(100);
				if (roll < job.skillLevelUp) baseSkill ++;
			}
			
		int baseIntelligence = 0;
			for (int i = 0; i < maturity; i++) {
				int roll = random.nextInt(100);
				if (roll < job.intelligenceLevelUp) baseIntelligence ++;
			}
			
		int basePersonality = 0;
			for (int i = 0; i < maturity; i++) {
				int roll = random.nextInt(100);
				if (roll < job.personalityLevelUp) basePersonality ++;
			}
			
		
		
		return new Hero(race, name, job, maturity, baseCombat, baseSkill, baseIntelligence, basePersonality);
		
		
		
		
		
	}

}
