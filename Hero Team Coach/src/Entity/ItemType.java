package Entity;

import java.util.Random;

public class ItemType {
	
	public String name;
	int combatBonus;
	int skillBonus;
	int intelligenceBonus;
	int personalityBonus;


	public static ItemType shortsword = new ItemType("Short Sword", 0, 0, 0, 0);
	public static ItemType broadsword = new ItemType("Broad Sword", 2, -1, 0, 0);
	public static ItemType longsword = new ItemType("Long Sword", 2, 0, 0, 0);
	public static ItemType vorpal = new ItemType("Vorpal Blade", 20, 10, 5, 10);
	public static ItemType handaxe = new ItemType("Hand Axe", 1, 1, 0, 0);
	

	public ItemType (String name, int combatBonus, int skillBonus, int intelligenceBonus, int personalityBonus) {
		
		this.name = name;
		this.combatBonus = combatBonus;
		this.skillBonus = skillBonus;
		this.intelligenceBonus = intelligenceBonus;
		this.personalityBonus = personalityBonus;		
		
	}


	public static ItemType generateRandomItemType() {

		Random random = new Random();
		
		int roll = random.nextInt(2);
		if (roll == 0) return ItemType.handaxe;
		else return ItemType.longsword;
		
	}

}
