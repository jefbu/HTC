package Entity;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;

import Graphics.ImageLoader;
import Utility.ItemFactory;

public class Hero extends Mob {

	public int baseCombat;
	public int baseSkill;
	public int baseIntelligence;
	public int basePersonality;

	public int skill;
	public int intelligence;
	public int personality;
	
	public int questCombat;
	public int questSkill;
	public int questIntelligence;
	public int questPersonality;

	public int maturity;

	public int value;

	public int morale;
	
	public int garrulity;

	public ArrayList<Trait> heroTraits;
	public ArrayList<Relation> heroRelations;

	public Role role;

	public Weapon weapon;
	public Armour armour;
	
	public ImageIcon portrait;
	ImageLoader imageLoader;
	
	public Status status;

	public Hero(Race race, String name, Job job, int maturity, int baseCombat, int baseSkill, int baseIntelligence,
			int basePersonality) {
		
		imageLoader = new ImageLoader();
		this.portrait = imageLoader.loadImageIcon("/Images/Portraits/hero_portrait.png");

		this.race = race;
		this.name = name;
		this.job = job;
		this.maturity = maturity;
		this.baseCombat = baseCombat + race.combatBonus + job.combatBonus;
		this.baseSkill = baseSkill + race.skillBonus + job.skillBonus;
		this.baseIntelligence = baseIntelligence + race.intelligenceBonus + job.intelligenceBonus;
		this.basePersonality = basePersonality + race.personalityBonus + job.personalityBonus;
		
		this.status = Status.HEALTHY;

		Random random = new Random();
		this.morale = random.nextInt(41) + 60;

		this.role = Role.idle;

		int roll = random.nextInt(100) + 1;
		if (roll > 0) {
			weapon = ItemFactory.generateRandomWeapon();
		}

		int roll2 = random.nextInt(100) + 1;
		if (roll2 > 0) {
			armour = ItemFactory.generateRandomArmour();
		}

		this.combat = this.baseCombat + weapon.combatBonus + armour.combatBonus;
		this.skill = this.baseSkill + weapon.skillBonus + armour.skillBonus;
		this.intelligence = this.baseIntelligence + weapon.intelligenceBonus + armour.intelligenceBonus;
		this.personality = this.basePersonality + weapon.personalityBonus + armour.personalityBonus;
		
		this.questCombat = this.combat;
		this.questSkill = this.skill;
		this.questIntelligence = this.intelligence;
		this.questPersonality = this.personality;

		heroTraits = new ArrayList<Trait>();
		int roll3 = random.nextInt(100) + 1;
		if (roll3 > this.baseIntelligence) heroTraits.add(Trait.hero_illiterate);

		int roll4 = random.nextInt(100) + 1;
		if (roll4 > 70) heroTraits.add(Trait.hero_lazy);
		
		heroTraits.add(Trait.hero_fire_damage);
		heroTraits.add(Trait.hero_ice_damage);
		
		heroRelations = new ArrayList<Relation>();
		
		this.garrulity = random.nextInt(30) + 1;
		
		this.value = calculateValue();

	}

	public int calculateValue() {

		int baseValue = 100000;
		int combatValue = baseValue * (100 + combat * 2) / 100;
		int skillValue = combatValue * (100 + skill * 2) / 100;
		int intelligenceValue = skillValue * (100 + intelligence * 2) / 100;
		int personalityValue = intelligenceValue * (100 + personality * 2) / 100;
		int maturityValue = personalityValue * (100 + maturity * 2) / 100;
		int potentialValue = maturityValue + (2 * ((100 - maturity) * 1000));
		int raceValue = potentialValue * (1 + race.raceTier / 10);
		int jobValue = raceValue * (1 + job.jobTier / 10);
		int moraleValue = jobValue * (1 + morale / 1000);
		int heroTraitValue = moraleValue;
			for (int i = 0; i < heroTraits.size(); i++) {
				heroTraitValue = heroTraitValue * heroTraits.get(i).valueModifier / 100;				
			}
		int weaponTraitValue = heroTraitValue;
			for (int ii = 0; ii < weapon.weaponTraits.size(); ii++) {
				weaponTraitValue = weaponTraitValue * weapon.weaponTraits.get(ii).valueModifier / 100;
			}		
		int roundedValue = weaponTraitValue / 10000;
		int finalValue = roundedValue * 10000;
		return finalValue;

	}

	public void levelUp() {

		Random random = new Random();

		int matRoll = random.nextInt(100) + 1;
		if (matRoll > maturity) {

			int combatRoll = random.nextInt(100) + 1;
			if (combatRoll < job.combatLevelUp)
				baseCombat++;
			int skillRoll = random.nextInt(100) + 1;
			if (skillRoll < job.skillLevelUp)
				baseSkill++;
			int intelligenceRoll = random.nextInt(100) + 1;
			if (intelligenceRoll < job.intelligenceLevelUp)
				baseIntelligence++;
			int personalityRoll = random.nextInt(100) + 1;
			if (personalityRoll < job.personalityLevelUp)
				basePersonality++;

		}

		int maturityRoll = random.nextInt(100) + 1;
		if (maturityRoll > maturity)
			maturity++;
		
		refreshStats();

	}
	
	public void refreshStats() {
		
		combat = baseCombat + weapon.combatBonus + armour.combatBonus;
		skill = baseSkill + weapon.skillBonus + armour.skillBonus;
		intelligence = baseIntelligence + weapon.intelligenceBonus + armour.intelligenceBonus;
		personality = basePersonality + weapon.personalityBonus + armour.personalityBonus;
		
	}

}
