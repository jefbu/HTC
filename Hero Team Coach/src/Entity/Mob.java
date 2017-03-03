package Entity;

import java.util.Random;

public class Mob {
	
	Random random = new Random();
	
	public Race race;
	public String name;
	public Job job;
	public int combat;

	public int compareTo(Hero comparedNumber) {
		return 0;
	}
	
	
	public Mob(Race race, String name, Job job, int combat) {
		
		this.race = race;
		this.name = name;
		this.job = job;
		this.combat = combat;
		
	}
	
	
	public Mob() {
		
	}
	
public static Mob Goblin = new Mob(Race.human, "Skree", Job.soldier, 20);
	
	
	
}
