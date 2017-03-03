package Entity;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;

public class Armour extends Item {
	
	ImageIcon icon;
	public ArmourType armourType;
	public ArrayList<Trait> armourTraits;
	
	public Armour(Quality quality, Material material, ArmourType armourType) {
		
		armourTraits = new ArrayList<Trait>();
		
		Random random = new Random();
		int roll = random.nextInt(10) + 1;
		if(roll > 6) {
			armourTraits.add(Trait.armour_water_protection);
		}
		
		this.name = armourType.name;
		this.armourType = armourType;
		this.material = material;
		this.quality = quality;
		this.combatBonus = armourType.combatBonus + material.combatBonus + quality.combatBonus;
		this.skillBonus = armourType.skillBonus + material.skillBonus + quality.skillBonus;
		this.intelligenceBonus = armourType.intelligenceBonus + material.intelligenceBonus + quality.intelligenceBonus;
		this.personalityBonus = armourType.personalityBonus + material.personalityBonus + quality.personalityBonus;
		
	}
	
	

}
