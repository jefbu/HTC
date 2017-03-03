package Entity;

import java.util.Random;

public class WeaponType {
	
	public String name;
	int combatBonus;
	int skillBonus;
	int intelligenceBonus;
	int personalityBonus;


	public static WeaponType shortsword = new WeaponType("Short Sword", 0, 0, 0, 0);
	public static WeaponType broadsword = new WeaponType("Broad Sword", 2, -1, 0, 0);
	public static WeaponType longsword = new WeaponType("Long Sword", 2, 0, 0, 0);
	public static WeaponType vorpal = new WeaponType("Vorpal Blade", 20, 10, 5, 10);
	public static WeaponType handaxe = new WeaponType("Hand Axe", 1, 1, 0, 0);
	

	public WeaponType (String name, int combatBonus, int skillBonus, int intelligenceBonus, int personalityBonus) {
		
		this.name = name;
		this.combatBonus = combatBonus;
		this.skillBonus = skillBonus;
		this.intelligenceBonus = intelligenceBonus;
		this.personalityBonus = personalityBonus;		
		
	}


	public static WeaponType generateRandomItemType() {

		Random random = new Random();
		
		int roll = random.nextInt(100) + 1;
		
		if (roll < 25) return WeaponType.handaxe;
		else if (roll < 50) return WeaponType.shortsword;
		else if (roll < 75) return WeaponType.broadsword;
		else if (roll < 100) return WeaponType.longsword;
		else return vorpal;
		
	}

}
