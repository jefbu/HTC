package Utility;

import java.util.ArrayList;
import java.util.Random;

import Entity.Armour;
import Graphics.GameScreen;

public class ArmourInventory {
			
		public static ArrayList<Armour> armourInventoryList = new ArrayList<Armour>();
		
		public ArmourInventory() {
			
			Random random = new Random();
			int inventorySize = (random.nextInt(100) - GameScreen.difficulty) / 10;
			
			if (inventorySize < 1) inventorySize = 1;
			
			for (int i = 0; i < inventorySize; i++) {
				
				ArmourInventory.armourInventoryList.add(ItemFactory.generateRandomArmour());

			
			}
			
		}

}
