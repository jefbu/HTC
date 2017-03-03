package Entity;

public class Race {
	
	public String name;
	public int combatBonus;
	public int skillBonus;
	public int intelligenceBonus;
	public int personalityBonus;
	
	public int raceTier;
		
	public static Race human = new Race("Human", 0, 0, 0, 0, 1);
	public static Race dog = new Race("Dog", 0, 0, 0, 0, 3);
	public static Race cat = new Race("Cat", 0, 0, 0, 0, 3);
	public static Race chicken = new Race("Chicken", 0, 0, 0, 0, 5);
	
	
	
	
	public Race(String name, int combatBonus, int skillBonus, int intelligenceBonus, int personalityBonus, int raceTier) {
		
		this.name = name;
		this.combatBonus = combatBonus;
		this.skillBonus = skillBonus;
		this.intelligenceBonus = intelligenceBonus;
		this.personalityBonus = personalityBonus;
		this.raceTier = raceTier;
		
		
	}

}
