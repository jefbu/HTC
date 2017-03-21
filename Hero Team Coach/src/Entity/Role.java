package Entity;

import javax.swing.ImageIcon;

import Graphics.ImageLoader;

public class Role {
	
	public ImageIcon icon;
	public String name;
	ImageLoader imageLoader = new ImageLoader();
	

	public static Role idle = new Role("/Images/Portraits/human_fighter_male.png", "Idle");
	public static Role quest = new Role("/Images/Portraits/quest.png", "On Quest");
	public static Role blacksmith = new Role("/Images/Portraits/blacksmith.png", "Blacksmith");
	public static Role accountManager = new Role("/Images/Portraits/account_manager.png", "Account Manager");
	public static Role hrOfficer = new Role("/Images/Portraits/hr.png", "HR Officer");
	
	
	public Role(String path, String name) {
		
		icon = imageLoader.loadImageIcon(path);
		this.name = name;
		
	}
	

	
	

}
