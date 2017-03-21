package Utility;

import java.util.Random;

import Entity.Job;
import Entity.Race;

public class JobFactory {
	
	public JobFactory() {
		
	}
	
	
	
	public static Job generateJob(Race race) {
		
		Random random = new Random();
		int roll = random.nextInt(100) + 1;
		int jobtier;
		if (roll < 65) jobtier = 1;
		else if (roll < 90) jobtier = 2;
		else if (roll < 99) jobtier = 3;
		else jobtier = 4;
		
		if(jobtier == 1) {
		
			if (race == Race.human) {
				
				roll = random.nextInt(4) + 1;
				switch(roll) {
				case 1: return Job.brute;
				case 2: return Job.artisan;
				case 3: return Job.engineer;
				case 4: return Job.bully;
				}

				
			}
			
			else if (race == Race.dog) {
				return Job.guardDog;
				}
			
			else if (race == Race.cat) {
				return Job.houseCat;				
			}
			
			else {
				return Job.insectEater;
				//ToDo: implement gender
			}
		
		}
		
		else if (jobtier == 2) {
			
			if (race == Race.human) {
				
				roll = random.nextInt(4) + 1;
				switch(roll) {
				case 1: return Job.commander;
				case 2: return Job.strategist;
				case 3: return Job.peddler;
				case 4: return Job.writer;
				}
				
			}
			
			else if (race == Race.dog) {
				return Job.lapDog;
			}
			
			else if (race == Race.cat) {
				return Job.mouseHunter;
			}
			
			else {
				return Job.eggLayer;
				//ToDo: implement gender
			}
			
		}
		
		else if (jobtier == 3) {
			
			if (race == Race.human) {
				
				roll = random.nextInt(4) + 1;
				switch(roll) {
				case 1: return Job.gendarme;
				case 2: return Job.lawyer;
				case 3: return Job.dancer;
				case 4: return Job.conArtist;
				}
				
			}
			
			else if (race == Race.dog) {
				return Job.packLeader;
			}
			
			else {
				return Job.feralCat;
			}
			
		}
		
		else {
			
			if (race == Race.human) {
				
				roll = random.nextInt(4) + 1;
				switch(roll) {
				case 1: return Job.fencer;
				case 2: return Job.savant;
				case 3: return Job.surgeon;
				case 4: return Job.celebrity;
				}
				
			}
			
			else if (race == Race.dog) {
				return Job.alphaDog;
			}
			
			else {
				return Job.cheshireCat;
			}
			
		}
		
		return Job.singer;
		
	}
	
	public static Job generateHRJob(Race race, int specialisation) {
		
		switch(specialisation) {

		}
		
		return Job.singer;
	}
	
	
	
	
	

}
