package Utility;

import java.util.Random;

import Entity.Race;

public class RaceFactory {
	
	public RaceFactory() {
		
	}
	
	public static Race generateRace() {
		
		Random random = new Random();
		
		int roll = random.nextInt(100) + 1;
		int racetier;
		if (roll < 75) racetier = 1;
		else if (roll < 99) racetier = 3;
		else racetier = 5;
		
		if (racetier == 1) {
			
			return Race.human;

				}
		
		else if (racetier == 3) {
			roll = random.nextInt(2);
			if (roll == 0) return Race.dog;
			else return Race.cat;			
				}
		
		else if (racetier == 5) {

			return Race.chicken;
			
		}


		else return Race.human;
		
		
		
		
	}
	

}
