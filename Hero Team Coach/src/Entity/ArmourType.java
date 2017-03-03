package Entity;

import java.util.Random;

public class ArmourType {
	
	public String name;
	int combatBonus;
	int skillBonus;
	int intelligenceBonus;
	int personalityBonus;
	
	public String weight;
	
	
	public static ArmourType leatherArmour = new ArmourType("Leather Armour", 0, 1, 0, 0, "Light");
	public static ArmourType chainArmour = new ArmourType("Chain Mail", 3, 0, 0, 0, "Medium");
	
	
	
	public ArmourType(String name, int combatBonus, int skillBonus, int intelligenceBonus, int personalityBonus, String weight) {
		
		this.name = name;
		this.combatBonus = combatBonus;
		this.skillBonus = skillBonus;
		this.intelligenceBonus = intelligenceBonus;
		this.personalityBonus = personalityBonus;	
		
		this.weight = weight;
		
	}
	
	public static ArmourType generateRandomItemType() {

		Random random = new Random();
		
		int roll = random.nextInt(2);
		if (roll == 0) return ArmourType.leatherArmour;
		else return ArmourType.chainArmour;
		
	}
	
	
	

}
