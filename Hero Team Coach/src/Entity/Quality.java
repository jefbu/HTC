package Entity;

import java.util.Random;

public class Quality {

	public String name;
	int combatBonus;
	int skillBonus;
	int intelligenceBonus;
	int personalityBonus;


	public static Quality poor = new Quality("Poor", -5, -5, -5, -5);
	public static Quality average = new Quality("Average", -3, -3, -3, -3);
	public static Quality decent = new Quality("Decent", -1, -1, -1, -1);
	public static Quality fine = new Quality("Fine", 1, 1, 1, 1);
	public static Quality great = new Quality ("Great", 3, 3, 3,3 );
	public static Quality excellent = new Quality ("Excellent", 5, 5, 5, 5);
	public static Quality perfect = new Quality ("Perfect", 8, 8, 8, 8);
	
	public static Quality decorative = new Quality ("Decorative", -3, -3, -3, 6);
	public static Quality enigmatic = new Quality ("Enigmatic", -3, -3, 6, -3);
	public static Quality serrated = new Quality ("Serrated", 6, -3, -3, -3);
	public static Quality light = new Quality ("Light", -3, 6, -3, -3);
	

	public Quality (String name, int combatBonus, int skillBonus, int intelligenceBonus, int personalityBonus) {
		
		this.name = name;
		this.combatBonus = combatBonus;
		this.skillBonus = skillBonus;
		this.intelligenceBonus = intelligenceBonus;
		this.personalityBonus = personalityBonus;		
		
	}


	public static Quality generateRandomQuality() {

		Random random = new Random();
		
		int roll = random.nextInt(100) + 1;
		
		if (roll < 16) return Quality.poor;
		else if (roll < 36) return Quality.average;
		else if (roll < 56) return Quality.decent;
		else if (roll < 66) return Quality.fine;
		else if (roll < 76) return Quality.great;
		else if (roll < 81) return Quality.serrated;
		else if (roll < 86) return Quality.light;
		else if (roll < 91) return Quality.enigmatic;
		else if (roll < 96) return Quality.decorative;
		else if (roll < 99) return Quality.excellent;
		else return Quality.perfect;
		
	}
	
}
