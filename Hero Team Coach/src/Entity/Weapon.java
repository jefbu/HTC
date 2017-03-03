package Entity;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;

import Utility.NameFactory;

public class Weapon extends Item {

	ImageIcon icon;
	public WeaponType weaponType;
	public ArrayList<Trait> weaponTraits;

	public Weapon(Quality quality, Material material, WeaponType weaponType) {

		weaponTraits = new ArrayList<Trait>();
		
		Random random = new Random();
		int roll = random.nextInt(10) + 1;
		if (roll > 6) {
			weaponTraits.add(Trait.weapon_lightning_damage);
		}
		
		this.name = NameFactory.generateName(this);
		this.weaponType = weaponType;
		this.material = material;
		this.quality = quality;
		this.combatBonus = weaponType.combatBonus + material.combatBonus + quality.combatBonus;
		this.skillBonus = weaponType.skillBonus + material.skillBonus + quality.skillBonus;
		this.intelligenceBonus = weaponType.intelligenceBonus + material.intelligenceBonus + quality.intelligenceBonus;
		this.personalityBonus = weaponType.personalityBonus + material.personalityBonus + quality.personalityBonus;

	}

}
