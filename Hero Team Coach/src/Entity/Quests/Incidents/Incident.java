package Entity.Quests.Incidents;

import java.util.ArrayList;
import java.util.Random;

import Entity.Armour;
import Entity.Hero;
import Entity.Mob;
import Entity.Status;
import Entity.Weapon;
import Graphics.GameScreen;
import Graphics.ImageLoader;
import Graphics.Screens.QuestScreen;
import Utility.QuestOrder;

public abstract class Incident {

	public String title;
	public String output;
	public String introduction;

	public QuestOrder questOrder;

	public ArrayList<Mob> enemies;
	public ArrayList<Weapon> weapons;
	public ArrayList<Armour> armour;

	protected ImageLoader imageLoader = new ImageLoader();

	public ArrayList<Hero> totalWounded;
	public ArrayList<Hero> totalSlightlyWounded;

	public Incident() {

	}

	public void outcome() {

	}

	public void initiate() {

		GameScreen.questScreen.textFinished = false;
		GameScreen.runner = 0;

		Random random = new Random();

		for (int i = 0; i < GameScreen.questers.size(); i++) {

			if (GameScreen.questers.get(i).status == Status.LATE) {

				int roll = random.nextInt(10) + 1;
				int result = roll * GameScreen.questSequence;

				if (result > 20) {
					GameScreen.questers.get(i).status = Status.HEALTHY;
					GameScreen.questers.get(i).questCombat = GameScreen.questers.get(i).combat;
					GameScreen.questers.get(i).questSkill = GameScreen.questers.get(i).skill;
					GameScreen.questers.get(i).questIntelligence = GameScreen.questers.get(i).intelligence;
					GameScreen.questers.get(i).questPersonality = GameScreen.questers.get(i).personality;
				}

			}

		}

		QuestScreen.fillQuestersPanel();
		GameScreen.questScreen.textLabel.setText(title);

	}

	public void combat(Incident incident) {

		int heroCombat = calculateHeroTotalCombat();
		int enemyCombat = calculateEnemyTotalCombat(incident.enemies);
		ArrayList<Hero> activeCombatants = calculateActiveCombatants();
		totalWounded = new ArrayList<Hero>();
		totalSlightlyWounded = new ArrayList<Hero>();
		CombatOutcome combatOutcomeCase = decideCombatOutcome(heroCombat, enemyCombat);

		switch (combatOutcomeCase) {

		case MAJOR_LOSS:
			calculateCombatResult(activeCombatants, 0);
			break;
		case MINOR_LOSS:
			calculateCombatResult(activeCombatants, 10);
			break;
		case DRAW:
			calculateCombatResult(activeCombatants, 15);
			break;
		case MINOR_VICTORY:
			calculateCombatResult(activeCombatants, 20);
			break;
		case MAJOR_VICTORY:
			calculateCombatResult(activeCombatants, 55);
			break;

		}

		createOutputString(incident);

	}

	private int calculateHeroTotalCombat() {

		Random random = new Random();

		int heroCombat = 0;

		for (Hero quester : GameScreen.questers) {
			heroCombat = heroCombat + quester.questCombat;
		}

		return heroCombat + random.nextInt(250);

	}

	private int calculateEnemyTotalCombat(ArrayList<Mob> opponents) {

		Random random = new Random();

		int enemyCombat = 0;

		for (Mob opponent : opponents) {
			enemyCombat = enemyCombat + opponent.combat;
		}

		return enemyCombat + random.nextInt(200);

	}

	private CombatOutcome decideCombatOutcome(int heroCombat, int enemyCombat) {

		if (heroCombat < enemyCombat - 50)
			return CombatOutcome.MAJOR_LOSS;
		else if (heroCombat < enemyCombat)
			return CombatOutcome.MINOR_LOSS;
		else if (heroCombat < enemyCombat + 50)
			return CombatOutcome.DRAW;
		else if (heroCombat < enemyCombat * 2)
			return CombatOutcome.MINOR_VICTORY;
		else
			return CombatOutcome.MAJOR_VICTORY;

	}

	private ArrayList<Hero> calculateActiveCombatants() {

		ArrayList<Hero> activeCombatants = new ArrayList<Hero>();

		for (Hero quester : GameScreen.questers) {

			if (quester.status == Status.HEALTHY)
				activeCombatants.add(quester);

		}

		return activeCombatants;

	}

	private void calculateCombatResult(ArrayList<Hero> activeCombatants, int modifier) {

		Random random = new Random();

		for (Hero quester : activeCombatants) {

			int roll = random.nextInt(100) + modifier;

			if (roll < 26) {
				quester.status = Status.WOUNDED;
				quester.questCombat = 0;
				quester.questSkill = 0;
				quester.questIntelligence = 0;
				quester.questPersonality = 0;
				totalWounded.add(quester);
			} else if (roll < 76) {
				quester.questCombat -= random.nextInt(15);
				totalSlightlyWounded.add(quester);
			} else
				;

		}

	}

	private void createOutputString(Incident incident) {

		if (totalWounded.size() == 0 && totalSlightlyWounded.size() == 0) {
			incident.output = "Luckily, through skill, blind stupid luck or the elsehow machinations of fate, none of the heroes was even scratched, let alone severely wounded!";
		}
		
		if (totalWounded.size() == 1) {
			incident.output = "Unfortunately, a " + incident.enemies.get(0).name + " landed a lucky blow which nearly took off " + totalWounded.get(0).name + "'s head, an injury they will recover from only in due time";
		}
		
		else if (totalWounded.size() > 1) {
			incident.output = "While the enemy lays defeated or fled in disarray and courage wanting, the battle was a disaster nonetheless, testified by the fistful of severely wounded heroes";
						
		}
		
		if (totalSlightlyWounded.size() == 1) {
			incident.output = incident.output + "Almost as an afterthought, it should be added that " + totalSlightlyWounded.get(0).name + " was slightly wounded in the skirmish and will suffer discomfort in fighting for the remainder of the quest";
		}
		
		else if (totalSlightlyWounded.size() > 1) {
			incident.output = incident.output + "A few heroes were also wounded. Nothing debilitating, but a hindrance for their combat prowess for the remainder of the quest even so";
		}
		


	}

}
