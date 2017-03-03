package Entity;

import javax.swing.ImageIcon;

import Graphics.ImageLoader;

public class Trait {

	ImageLoader imageLoader = new ImageLoader();

	public ImageIcon icon;
	public String name;
	int valueModifier;

	public static Trait hero_illiterate = new Trait("/Images/Icons/hero_illiterate.png", "Illiterate", 90);
	public static Trait hero_lazy = new Trait("/Images/Icons/hero_lazy.png", "Lazy", 90);
	public static Trait hero_ice_damage = new Trait("/Images/Icons/hero_ice.png", "Ice Damage", 105);
	public static Trait hero_fire_damage = new Trait("/Images/Icons/hero_fire.png", "Fire Damage",
			105);
	public static Trait weapon_lightning_damage = new Trait("/Images/Icons/weapon_lightning.png",
			"Lightning Damage", 105);
	public static Trait armour_water_protection = new Trait("/Images/Icons/armour_water.png",
			"Water Resistance", 105);

	public Trait(String path, String name, int valueModifier) {

		icon = imageLoader.loadImageIcon(path);
		this.name = name;
		this.valueModifier = valueModifier;

	}

}
