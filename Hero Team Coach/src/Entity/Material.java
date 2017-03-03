package Entity;

import java.util.Random;

public class Material {
	
	public String name;
	int combatBonus;
	int skillBonus;
	int intelligenceBonus;
	int personalityBonus;


	public static Material iron = new Material("Iron", -3, -3, -3, -3);
	public static Material steel = new Material("Steel", 0, 0, 0, 0);
	public static Material silver = new Material("Silver", 5, 0, 0, 2);
	public static Material gold = new Material("Gold", 6, 0, 2, 5);
	public static Material opal = new Material("Opal", 2, 2, 5, 3);
	

	public Material (String name, int combatBonus, int skillBonus, int intelligenceBonus, int personalityBonus) {
		
		this.name = name;
		this.combatBonus = combatBonus;
		this.skillBonus = skillBonus;
		this.intelligenceBonus = intelligenceBonus;
		this.personalityBonus = personalityBonus;		
		
	}


	public static Material generateRandomMaterial() {

		Random random = new Random();
		
		int roll = random.nextInt(100) + 1;

		if (roll < 41) return Material.iron;
		else if (roll < 71) return Material.steel;
		else if (roll < 86) return Material.silver;
		else if (roll < 96) return Material.gold;
		else return Material.opal;
		
		
	}
	
}
