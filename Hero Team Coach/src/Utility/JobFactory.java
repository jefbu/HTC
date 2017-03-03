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
		else jobtier = 3;
		
		if(jobtier == 1) {
		
			if (race == Race.human) {
				
				roll = random.nextInt(100) + 1;
				if (roll < 16) return Job.soldier;
				else if (roll < 31) return Job.knight;
				else if (roll < 41) return Job.brigand;
				else if (roll < 51) return Job.captain;
				else if (roll < 61) return Job.berserker;
				else if (roll < 71) return Job.monk;
				else if (roll < 76) return Job.gladiator;
				else if (roll < 81) return Job.duelist;
				else if (roll < 86) return Job.anchorite;
				else if (roll < 91) return Job.highwayman;
				else if (roll < 96) return Job.fencer;
				else return Job.marauder;
				
			}
			
			else if (race == Race.dog) {
				
				roll = random.nextInt(100) + 1;
				if (roll < 51) return Job.guardDog;
				else return Job.lapDog;
				
			}
			
			else if (race == Race.cat) {
				
				roll = random.nextInt(100) + 1;
				if (roll < 51) return Job.mouseHunter;
				else return Job.houseCat;
				
			}
			
			else return Job.oriflamme;
		
		}
		
		else if (jobtier == 2) {
			
			if (race == Race.human) {
				
				return Job.pugilist;
				
			}
			
			else if (race == Race.dog) {
				
				return Job.packLeader;
				
			}
			
			else if (race == Race.cat) {
				
				return Job.feralCat;
				
			}
					
			
		else return Job.zodiac;
			
		}
		
		else if (jobtier == 3) {
			
			if (race == Race.human) {
				
				return Job.avatarOfDeath;
				
			}
			
			else if (race == Race.dog) {
				
				return Job.alphaDog;
				
			}
			
			else if (race == Race.cat) {
				
				return Job.cheshireCat;
				
			}
			
			else return Job.berserker;
			
		}
		
		else return Job.harbinger;
		
	}

}
