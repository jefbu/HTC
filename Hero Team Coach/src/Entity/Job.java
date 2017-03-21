package Entity;

public class Job {

	public String name;
	public int combatBonus;
	public int skillBonus;
	public int intelligenceBonus;
	public int personalityBonus;

	public int combatLevelUp;
	public int skillLevelUp;
	public int intelligenceLevelUp;
	public int personalityLevelUp;

	public int jobTier;

	public static Job brute = new Job("Brute", 30, 20, 20, 15, 15, 10, 15, 10, 1); //50, 35, 25, 25 = 135
	public static Job commander = new Job("Commander", 20, 25, 20, 15, 20, 20, 20, 15, 2); // 45, 35, 40, 35 = 155
	public static Job gendarme = new Job("Gendarme", 15, 35, 15, 25, 15, 25, 15, 30, 3); // 50, 40, 40, 45 = 175
	public static Job fencer = new Job("Fencer", 10, 45, 10, 40, 10, 35, 10, 35, 4); // 55, 50, 45, 45 = 195
	
	public static Job engineer = new Job("Engineer", 15, 10, 25, 15, 30, 15, 15, 10, 1); //25, 40, 45, 25 = 135
	public static Job strategist = new Job("Strategist", 20, 20, 20, 15, 20, 25, 20, 15, 2); // 40, 35, 45, 35 = 155
	public static Job lawyer = new Job("Lawyer", 15, 25, 15, 25, 15, 35, 15, 30, 3); // 40, 40, 50, 45 = 175
	public static Job savant = new Job("Savant", 10, 35, 10, 35, 10, 50, 10, 35, 4); // 45, 45, 60, 45 = 195
	
	public static Job artisan = new Job("Artisan", 15, 10, 30, 20, 20, 15, 15, 10, 1); //25, 50, 35, 25 = 135
	public static Job peddler = new Job("Peddler", 20, 15, 20, 25, 20, 15, 20, 20, 2); // 35, 45, 35, 40 = 155
	public static Job dancer = new Job("Dancer", 15, 30, 15, 35, 15, 25, 15, 25, 3); // 45, 50, 40, 40 = 175
	public static Job surgeon = new Job("Surgeon", 10, 35, 10, 45, 10, 40, 10, 35, 4); // 45, 55, 50, 45 = 195
	
	public static Job bully = new Job("Bully", 25, 15, 15, 10, 15, 10, 30, 15, 1); //40, 25, 25, 45 = 135
	public static Job writer = new Job("Writer", 20, 15, 20, 15, 20, 20, 20, 25, 2); // 35, 35, 40, 45 = 155
	public static Job conArtist = new Job("Con Artist", 15, 25, 15, 30, 15, 25, 15, 35, 3); // 40, 45, 40, 50 = 175
	public static Job celebrity = new Job("Celebrity", 10, 35, 10, 35, 10, 35, 10, 50, 4); // 45, 45, 45, 60 = 195

	public static Job guardDog = new Job("Guard Dog", 40, 10, 10, 10, 10, 10, 10, 10, 1); //50, 20, 20, 20 = 110
	public static Job lapDog = new Job("Lap Dog", 30, 10, 10, 15, 10, 15, 30, 15, 2); // 40, 25, 25, 45 = 135
	public static Job packLeader = new Job("Pack Leader", 40, 15, 20, 10, 20, 10, 30, 15, 3); // 55, 30, 30, 45 = 160 
	public static Job alphaDog = new Job("Alpha Dog", 50, 5, 30, 15, 30, 15, 35, 15, 4); // 55, 45, 45, 50 = 195

	public static Job houseCat = new Job("House Cat", 15, 10, 20, 10, 15, 10, 20, 10, 1); // 25, 30, 25, 30 = 110
	public static Job mouseHunter = new Job("Mouse Hunter", 25, 15, 25, 15, 15, 15, 10, 15, 2); // 40, 40, 30, 25 = 135
	public static Job feralCat = new Job("Feral Cat", 25, 25, 25, 20, 20, 15, 15, 15, 3); // 50, 45, 35, 30 = 160
	public static Job cheshireCat = new Job("Cheshire Cat", 20, 20, 20, 20, 40, 20, 40, 15, 4); // 40, 40, 60, 55 = 195
	
	public static Job insectEater = new Job("Insect Eater", 10, 10, 10, 10, 10, 10, 15, 15, 1); // 20, 20, 20, 30 = 90
	public static Job eggLayer = new Job("Egg Layer", 10, 10, 10, 10, 15, 15, 20, 15, 2); // 20, 20, 30, 35 = 105
	public static Job singer = new Job("Singer", 20, 10, 10, 10, 10, 10, 25, 15, 1); // 30, 20, 20, 40 = 110
	public static Job fighter = new Job("Fighter", 10, 45, 10, 10, 10, 10, 15, 15, 2); // 55, 20, 20, 30 = 125

	public Job(String name, int combatBonus, int combatLevelUp, int skillBonus, int skillLevelUp, int intelligenceBonus,
			int intelligenceLevelUp, int personalityBonus, int personalityLevelUp, int jobTier) {

		this.name = name;
		this.combatBonus = combatBonus;
		this.skillBonus = skillBonus;
		this.intelligenceBonus = intelligenceBonus;
		this.personalityBonus = personalityBonus;
		this.combatLevelUp = combatLevelUp;
		this.skillLevelUp = skillLevelUp;
		this.intelligenceLevelUp = intelligenceLevelUp;
		this.personalityLevelUp = personalityLevelUp;
		this.jobTier = jobTier;

	}

}
