package Entity.Quests;

import java.util.ArrayList;
import java.util.Random;

import Entity.Quests.Incidents.Incident;

public abstract class Quest {

	public String title;
	public String focus;
	public int risk;
	public int cash;
	public int loot;
	public int fame;
	
	private Random random = new Random();

	public int contractFee;

	public ArrayList<Incident> incidentList = new ArrayList<Incident>();
	public ArrayList<Incident> potentialBeginningIncidents = new ArrayList<Incident>();
	public ArrayList<Incident> potentialEnrouteIncidents = new ArrayList<Incident>();
	public ArrayList<Incident> potentialAtLocationIncidents = new ArrayList<Incident>();
	public ArrayList<Incident> potentialConclusionIncidents = new ArrayList<Incident>();
	public ArrayList<Incident> potentialHomewardIncidents = new ArrayList<Incident>();
	//public int incidentSize;

	public void fillQuest(ArrayList<Incident> potentialBeginningIncidents, int beginningIncidents,
			ArrayList<Incident> potentialEnrouteIncidents, int enrouteIncidents,
			ArrayList<Incident> potentialAtLocationIncidents, int atLocationIncidents,
			ArrayList<Incident> potentialConclusionIncidents, int conclusionIncidents,
			ArrayList<Incident> potentialHomewardIncidents, int homewardIncidents) {
		
		for (int i = 0; i < random.nextInt(beginningIncidents) + 1; i++) {
			incidentList.add(potentialBeginningIncidents.get(random.nextInt(potentialBeginningIncidents.size())));
		}
		
		for (int i = 0; i < random.nextInt(enrouteIncidents) + 1; i++) {
			incidentList.add(potentialEnrouteIncidents.get(random.nextInt(potentialEnrouteIncidents.size())));
		}
		
		for (int i = 0; i < random.nextInt(atLocationIncidents) + 1; i++) {
			incidentList.add(potentialAtLocationIncidents.get(random.nextInt(potentialAtLocationIncidents.size())));
		}
		
		for (int i = 0; i < random.nextInt(conclusionIncidents) + 1; i++) {
			incidentList.add(potentialConclusionIncidents.get(random.nextInt(potentialConclusionIncidents.size())));
		}
		
		for (int i = 0; i < random.nextInt(homewardIncidents) + 1; i++) {
			incidentList.add(potentialHomewardIncidents.get(random.nextInt(potentialHomewardIncidents.size())));
		}
		
		
		
		

	}

}
