package Utility;

import java.util.ArrayList;
import java.util.Random;

import Entity.Weapon;
import Graphics.GameScreen;

public class WeaponInventory {
	
	public static ArrayList<Weapon> weaponInventoryList = new ArrayList<Weapon>();
	
	public WeaponInventory() {
		
		Random random = new Random();
		int inventorySize = (random.nextInt(100) - GameScreen.difficulty) / 10;
		
		if (inventorySize < 1) inventorySize = 1;
		
		for (int i = 0; i < inventorySize; i++) {
			
			WeaponInventory.weaponInventoryList.add(ItemFactory.generateRandomWeapon());

		
		}
		
		
	}

}
