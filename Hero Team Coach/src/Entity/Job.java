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

	public static Job soldier = new Job("Soldier", 25, 20, 15, 20, 10, 15, 15, 15, 1);
	public static Job gladiator = new Job("Gladiator", 30, 15, 15, 20, 10, 15, 15, 15, 1);
	public static Job duelist = new Job("Duelist", 25, 25, 15, 20, 10, 10, 10, 15, 1);
	public static Job fencer = new Job("Fencer", 20, 25, 20, 20, 10, 15, 15, 15, 1);
	public static Job captain = new Job("Captain", 20, 20, 15, 20, 15, 15, 15, 20, 1);
	public static Job berserker = new Job("Berserker", 30, 25, 10, 15, 10, 10, 10, 10, 1);
	public static Job marauder = new Job("Marauder", 25, 30, 15, 15, 10, 10, 10, 10, 1);
	public static Job brigand = new Job("Brigand", 20, 20, 20, 20, 15, 15, 15, 15, 1);
	public static Job highwayman = new Job("Highwayman", 20, 20, 15, 20, 15, 20, 15, 20, 1);
	public static Job anchorite = new Job("Anchorite", 20, 25, 15, 15, 20, 20, 10, 10, 1);
	public static Job knight = new Job("Knight", 20, 20, 15, 15, 20, 15, 20, 15, 1);
	public static Job monk = new Job("Monk", 20, 20, 15, 20, 20, 15, 15, 15, 1);

	public static Job pugilist = new Job("Pugilist", 10, 45, 15, 20, 10, 20, 10, 20, 2);
	public static Job oriflamme = new Job("Oriflamme", 10, 40, 10, 20, 10, 20, 10, 35, 2);
	public static Job lionheart = new Job("Lionheart", 5, 50, 10, 25, 10, 20, 10, 25, 2);
	public static Job zealot = new Job("Zealot", 10, 40, 10, 25, 10, 30, 10, 20, 2);
	public static Job Ascetic = new Job("Ascetic", 10, 40, 10, 25, 10, 35, 10, 20, 2);
	public static Job zodiac = new Job("Zodiac Knight", 10, 40, 10, 35, 10, 20, 10, 25, 2);

	public static Job avatarOfDeath = new Job("Avatar of Death", 0, 60, 0, 40, 0, 40, 0, 40, 3);
	public static Job harbinger = new Job("Harbinger", 0, 55, 0, 45, 0, 45, 0, 45, 3);

	public static Job guardDog = new Job("Guard Dog", 30, -10, -10, -10, 60, 25, 20, 20, 1);
	public static Job lapDog = new Job("Lap Dog", -15, 10, 10, 25, 20, 30, 30, 55, 1);
	public static Job packLeader = new Job("Pack Leader", 20, 0, 0, 10, 55, 30, 30, 45, 2);
	public static Job alphaDog = new Job("Alpha Dog", 25, 5, 10, 15, 55, 30, 35, 50, 3);

	public static Job houseCat = new Job("House Cat", 5, 10, 5, 5, 45, 50, 40, 40, 1);
	public static Job mouseHunter = new Job("Mouse Hunter", 15, 10, 0, 0, 50, 50, 35, 30, 1);
	public static Job feralCat = new Job("Feral Cat", 20, 10, 5, 0, 55, 45, 20, 20, 2);
	public static Job cheshireCat = new Job("Cheshire Cat", 10, 20, 15, 20, 40, 45, 45, 50, 3);

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
