package Utility;

import java.util.Random;

import Entity.Race;
import Entity.Weapon;

public class NameFactory {
	
	public NameFactory() {
		
	}
	
	
	public static String generateName(Race race) {
		
		Random random = new Random();
		int roll = random.nextInt(100) + 1;
		int nametier;
		if (roll < 65) nametier = 1;
		else if (roll < 90) nametier = 2;
		else nametier = 3;
		String firstName = "";
		String lastName = "";
		
		if (nametier == 1) {
		
			if (race == Race.human) {
				
				roll = random.nextInt(7);
				
					switch (roll) {
				
					case 0: firstName = "Martin"; break;
					case 1: firstName = "John"; break;
					case 2: firstName = "Gabriel"; break;
					case 3: firstName = "Bill"; break;
					case 4: firstName = "Thomas"; break;
					case 5: firstName = "George"; break;
					case 6: firstName = "Chris"; break;
					
					}
				
				roll = random.nextInt(7);
				
					switch (roll) {
				
					case 0: lastName = "Smith"; break;
					case 1: lastName = "Thompson"; break;
					case 2: lastName = "Gomez"; break;
					case 3: lastName = "Clayton"; break;
					case 4: lastName = "Clide"; break;
					case 5: lastName = "Marlow"; break;
					case 6: lastName = "King"; break;
					
					}
			
				return firstName + " " + lastName;
			}
			
			else if (race == Race.dog) {
				
				return "Fido";
				
			}
			
			else if (race == Race.cat) {
				
				return "Felix";
				
			}
			
			else if (nametier == 2) {
				
				return "Baby";
				
			}
			
			else return "Leidilaineson";
		
		}

			
			else return "Papapopoulos";
		

		
		
		
		
		
	}
	
	public static String generateName(Weapon weapon) {
		
		Random random = new Random();
		String firstPart = "";
		String secondPart = "";
		
		int roll = random.nextInt(5);
		
		switch (roll) {
		
		case 0: firstPart = "Dragon"; break;
		case 1: firstPart = "Evil"; break;
		case 2: firstPart = "Dark"; break;
		case 3: firstPart = "Heart"; break;
		case 4: firstPart = "Yarrow"; break;
		
		}
		
		roll = random.nextInt(5);
		
		switch (roll) {
		
		case 0: secondPart = "slayer"; break;
		case 1: secondPart = "pierce"; break;
		case 2: secondPart = "bane"; break;
		case 3: secondPart = "downfall"; break;
		case 4: secondPart = "";
		
		
		}
		
		return firstPart + secondPart;
		
	}


	
	

}
