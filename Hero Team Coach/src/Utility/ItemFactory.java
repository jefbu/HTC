package Utility;

import Entity.Armour;
import Entity.ArmourType;
import Entity.Material;
import Entity.Quality;
import Entity.Weapon;
import Entity.WeaponType;

public class ItemFactory {


	
	public ItemFactory(){
		
	}
	
	public static Weapon generateRandomWeapon() {
		
		Quality quality = Quality.generateRandomQuality();
		Material material = Material.generateRandomMaterial();
		WeaponType weaponType = WeaponType.generateRandomItemType();
		
		return new Weapon(quality, material, weaponType);
		
	}

	public static Armour generateRandomArmour() {

		Quality quality = Quality.generateRandomQuality();
		Material material = Material.generateRandomMaterial();
		ArmourType armourType = ArmourType.generateRandomItemType();
		
		return new Armour(quality, material, armourType);
	}

}
