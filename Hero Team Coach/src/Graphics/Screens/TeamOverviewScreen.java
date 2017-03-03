package Graphics.Screens;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import Entity.Hero;
import Graphics.GameScreen;
import Graphics.Screens.Utility.HeroOverviewPanel;
import Utility.TeamRoster;

public class TeamOverviewScreen extends TeamScreen {

	private static final long serialVersionUID = 1L;

	JPanel sortButtonsPanel;
		JButton roleSortButton;
			boolean roleTopDown = true;
		JButton nameSortButton;
			boolean nameTopDown = true;
		JButton genderSortButton;
			boolean genderTopDown = true;
		JButton raceSortButton;
			boolean raceTopDown = true;
		JButton jobSortButton;
			boolean jobTopDown = true;
		JButton maturitySortButton;
			boolean maturityTopDown = true;
		JButton combatSortButton;
			boolean combatTopDown = true;
		JButton skillSortButton;
			boolean skillTopDown = true;
		JButton intelligenceSortButton;
			boolean intelligenceTopDown = true;
		JButton personalitySortButton;
			boolean personalityTopDown = true;
		JButton traitsSortButton;
		JButton valueSortButton;
			boolean valueTopDown = true;
	
		JPanel teamStatPanel;
		
		HeroOverviewPanel hero1Panel;
		HeroOverviewPanel hero2Panel;
		HeroOverviewPanel hero3Panel;
		HeroOverviewPanel hero4Panel;
		HeroOverviewPanel hero5Panel;
		HeroOverviewPanel hero6Panel;
		HeroOverviewPanel hero7Panel;
		HeroOverviewPanel hero8Panel;
		HeroOverviewPanel hero9Panel;
		HeroOverviewPanel hero10Panel;
		HeroOverviewPanel hero11Panel;
		HeroOverviewPanel hero12Panel;
		HeroOverviewPanel hero13Panel;
		HeroOverviewPanel hero14Panel;
		HeroOverviewPanel hero15Panel;
		HeroOverviewPanel hero16Panel;
		HeroOverviewPanel hero17Panel;

	public TeamOverviewScreen() {

		super();

		centrePanel.setLayout(new FlowLayout());
		
		sortButtonsPanel = new JPanel();
		sortButtonsPanel.setPreferredSize(new Dimension(1000, 50));
		sortButtonsPanel.setBackground(GameScreen.backgroundColor);
		sortButtonsPanel.setBorder(new LineBorder(GameScreen.borderColor, 2, true));
		sortButtonsPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 8));


		roleSortButton = new JButton("Role");
		roleSortButton.setPreferredSize(new Dimension(60, 32));
		sortButtonsPanel.add(roleSortButton);

		nameSortButton = new JButton("Name");
		nameSortButton.setPreferredSize(new Dimension(150, 32));
		sortButtonsPanel.add(nameSortButton);

		genderSortButton = new JButton("M/F");
		genderSortButton.setPreferredSize(new Dimension(60, 32));
		sortButtonsPanel.add(genderSortButton);

		raceSortButton = new JButton("Race");
		raceSortButton.setPreferredSize(new Dimension(100, 32));
		sortButtonsPanel.add(raceSortButton);

		jobSortButton = new JButton("Job");
		jobSortButton.setPreferredSize(new Dimension(100, 32));
		sortButtonsPanel.add(jobSortButton);

		maturitySortButton = new JButton("MAT");
		maturitySortButton.setPreferredSize(new Dimension(60, 32));
		sortButtonsPanel.add(maturitySortButton);

		combatSortButton = new JButton("COM");
		combatSortButton.setPreferredSize(new Dimension(60, 32));
		sortButtonsPanel.add(combatSortButton);

		skillSortButton = new JButton("SKL");
		skillSortButton.setPreferredSize(new Dimension(60, 32));
		sortButtonsPanel.add(skillSortButton);

		intelligenceSortButton = new JButton("INT");
		intelligenceSortButton.setPreferredSize(new Dimension(60, 32));
		sortButtonsPanel.add(intelligenceSortButton);

		personalitySortButton = new JButton("PER");
		personalitySortButton.setPreferredSize(new Dimension(60, 32));
		sortButtonsPanel.add(personalitySortButton);

		traitsSortButton = new JButton("Traits");
		traitsSortButton.setPreferredSize(new Dimension(80, 32));
		sortButtonsPanel.add(traitsSortButton);
		
		valueSortButton = new JButton("Value");
		valueSortButton.setPreferredSize(new Dimension (80, 32));
		sortButtonsPanel.add(valueSortButton);

		centrePanel.add(sortButtonsPanel);
		
		teamStatPanel = new JPanel();
		teamStatPanel.setBorder(new LineBorder(GameScreen.borderColor, 2, true));
		teamStatPanel.setBackground(GameScreen.mediumColor);
		teamStatPanel.setPreferredSize(new Dimension(1000, 700));
		teamStatPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		
		hero1Panel = new HeroOverviewPanel(0);
		teamStatPanel.add(hero1Panel);
		
		hero2Panel = new HeroOverviewPanel(1);
		teamStatPanel.add(hero2Panel);
		
		hero3Panel = new HeroOverviewPanel(2);
		teamStatPanel.add(hero3Panel);
		
		hero4Panel = new HeroOverviewPanel(3);
		teamStatPanel.add(hero4Panel);
		
		hero5Panel = new HeroOverviewPanel(4);
		teamStatPanel.add(hero5Panel);
		
		hero6Panel = new HeroOverviewPanel(5);
		teamStatPanel.add(hero6Panel);
		
		hero7Panel = new HeroOverviewPanel(6);
		teamStatPanel.add(hero7Panel);

		hero8Panel = new HeroOverviewPanel(7);
		teamStatPanel.add(hero8Panel);
		
		hero9Panel = new HeroOverviewPanel(8);
		teamStatPanel.add(hero9Panel);
		
		hero10Panel = new HeroOverviewPanel(9);
		teamStatPanel.add(hero10Panel);
		
		hero11Panel = new HeroOverviewPanel(10);
		teamStatPanel.add(hero11Panel);
		
		hero12Panel = new HeroOverviewPanel(11);
		teamStatPanel.add(hero12Panel);
		
		hero13Panel = new HeroOverviewPanel(12);
		teamStatPanel.add(hero13Panel);
		
		hero14Panel = new HeroOverviewPanel(13);
		teamStatPanel.add(hero14Panel);
		
		hero15Panel = new HeroOverviewPanel(14);
		teamStatPanel.add(hero15Panel);
		
		hero16Panel = new HeroOverviewPanel(15);
		teamStatPanel.add(hero16Panel);
		
		hero17Panel = new HeroOverviewPanel(16);
		teamStatPanel.add(hero17Panel);
		
		centrePanel.add(teamStatPanel);

		
		
		roleSortButton.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  
			  if (roleTopDown == true) {
			  
			    Collections.sort(TeamRoster.teamRosterList, new Comparator<Hero>() {
			        @Override public int compare(Hero p1, Hero p2) {
			        	 return p1.role.name.compareToIgnoreCase(p2.role.name);
			        }

			    });
			   
			    	roleTopDown = false;
			  }
			  
			  else {
				  
				    Collections.sort(TeamRoster.teamRosterList, new Comparator<Hero>() {
				        @Override public int compare(Hero p1, Hero p2) {
				        	return p2.role.name.compareToIgnoreCase(p1.role.name);
				        }

				    });
				   
				    roleTopDown = true;
				  
			  }
			    
				fillHeroTeamOverviewPanelAggregated();	
			  
		  }
		 });
		
		
		
		
		
		nameSortButton.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  
			  if (nameTopDown == true) {
			  
			    Collections.sort(TeamRoster.teamRosterList, new Comparator<Hero>() {
			        @Override public int compare(Hero p1, Hero p2) {
			        	 return p1.name.compareToIgnoreCase(p2.name);
			        }

			    });
			   
			    	nameTopDown = false;
			  }
			  
			  else {
				  
				    Collections.sort(TeamRoster.teamRosterList, new Comparator<Hero>() {
				        @Override public int compare(Hero p1, Hero p2) {
				        	return p2.name.compareToIgnoreCase(p1.name);
				        }

				    });
				   
				    nameTopDown = true;
				  
			  }
			    
				fillHeroTeamOverviewPanelAggregated();	
			  
		  }
		 });	
	
		raceSortButton.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  
			  if (raceTopDown == true) {
			  
			    Collections.sort(TeamRoster.teamRosterList, new Comparator<Hero>() {
			        @Override public int compare(Hero p1, Hero p2) {
			        	 return p1.race.name.compareToIgnoreCase(p2.race.name);
			        }

			    });
			   
			    	raceTopDown = false;
			  }
			  
			  else {
				  
				    Collections.sort(TeamRoster.teamRosterList, new Comparator<Hero>() {
				        @Override public int compare(Hero p1, Hero p2) {
				        	return p2.race.name.compareToIgnoreCase(p1.race.name);
				        }

				    });
				   
				    raceTopDown = true;
				  
			  }
			    
				fillHeroTeamOverviewPanelAggregated();	
			  
		  }
		 });
		
		
		
		
		jobSortButton.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  
			  if (jobTopDown == true) {
			  
			    Collections.sort(TeamRoster.teamRosterList, new Comparator<Hero>() {
			        @Override public int compare(Hero p1, Hero p2) {
			        	 return p1.job.name.compareToIgnoreCase(p2.job.name);
			        }

			    });
			   
			    	jobTopDown = false;
			  }
			  
			  else {
				  
				    Collections.sort(TeamRoster.teamRosterList, new Comparator<Hero>() {
				        @Override public int compare(Hero p1, Hero p2) {
				        	return p2.job.name.compareToIgnoreCase(p1.job.name);
				        }

				    });
				   
				    jobTopDown = true;
				  
			  }
			    
				fillHeroTeamOverviewPanelAggregated();	
			  
		  }
		 });
		
		maturitySortButton.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  
			  if (maturityTopDown == true) {
			  
			    Collections.sort(TeamRoster.teamRosterList, new Comparator<Hero>() {
			        @Override public int compare(Hero p1, Hero p2) {
			            return p1.maturity- p2.maturity;
			        }

			    });
			   
			    	maturityTopDown = false;
			  }
			  
			  else {
				  
				    Collections.sort(TeamRoster.teamRosterList, new Comparator<Hero>() {
				        @Override public int compare(Hero p1, Hero p2) {
				            return p2.maturity- p1.maturity;
				        }

				    });
				   
				    maturityTopDown = true;
				  
			  }
			    
				fillHeroTeamOverviewPanelAggregated();	
			  
		  }
		 });
		
		combatSortButton.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  
			  if (combatTopDown == true) {
			  
			    Collections.sort(TeamRoster.teamRosterList, new Comparator<Hero>() {
			        @Override public int compare(Hero p1, Hero p2) {
			            return p1.combat- p2.combat;
			        }

			    });
			   
			    combatTopDown = false;
			  }
			  
			  else {
				  
				    Collections.sort(TeamRoster.teamRosterList, new Comparator<Hero>() {
				        @Override public int compare(Hero p1, Hero p2) {
				            return p2.combat- p1.combat;
				        }

				    });
				   
				    combatTopDown = true;
				  
			  }
			    
				fillHeroTeamOverviewPanelAggregated();	
			  
		  }
		 });
		
		skillSortButton.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  
			  if (skillTopDown == true) {
			  
			    Collections.sort(TeamRoster.teamRosterList, new Comparator<Hero>() {
			        @Override public int compare(Hero p1, Hero p2) {
			            return p1.skill- p2.skill;
			        }

			    });
			   
			    skillTopDown = false;
			  }
			  
			  else {
				  
				    Collections.sort(TeamRoster.teamRosterList, new Comparator<Hero>() {
				        @Override public int compare(Hero p1, Hero p2) {
				            return p2.skill- p1.skill;
				        }

				    });
				   
				    skillTopDown = true;
				  
			  }
			    
				fillHeroTeamOverviewPanelAggregated();	
			  
		  }
		 });
		
		intelligenceSortButton.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  
			  if (intelligenceTopDown == true) {
			  
			    Collections.sort(TeamRoster.teamRosterList, new Comparator<Hero>() {
			        @Override public int compare(Hero p1, Hero p2) {
			            return p1.intelligence- p2.intelligence;
			        }

			    });
			   
			    intelligenceTopDown = false;
			  }
			  
			  else {
				  
				    Collections.sort(TeamRoster.teamRosterList, new Comparator<Hero>() {
				        @Override public int compare(Hero p1, Hero p2) {
				            return p2.intelligence- p1.intelligence;
				        }

				    });
				   
				    intelligenceTopDown = true;
				  
			  }
			    
				fillHeroTeamOverviewPanelAggregated();	
			  
		  }
		 });
		
		personalitySortButton.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  
			  if (personalityTopDown == true) {
			  
			    Collections.sort(TeamRoster.teamRosterList, new Comparator<Hero>() {
			        @Override public int compare(Hero p1, Hero p2) {
			            return p1.personality- p2.personality;
			        }

			    });
			   
			    personalityTopDown = false;
			  }
			  
			  else {
				  
				    Collections.sort(TeamRoster.teamRosterList, new Comparator<Hero>() {
				        @Override public int compare(Hero p1, Hero p2) {
				            return p2.personality- p1.personality;
				        }

				    });
				   
				    personalityTopDown = true;
				  
			  }
			    
				fillHeroTeamOverviewPanelAggregated();	
			  
		  }
		 });
		
		valueSortButton.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  
			  if (valueTopDown == true) {
			  
			    Collections.sort(TeamRoster.teamRosterList, new Comparator<Hero>() {
			        @Override public int compare(Hero p1, Hero p2) {
			            return p1.value- p2.value;
			        }

			    });
			   
			    valueTopDown = false;
			  }
			  
			  else {
				  
				    Collections.sort(TeamRoster.teamRosterList, new Comparator<Hero>() {
				        @Override public int compare(Hero p1, Hero p2) {
				            return p2.value- p1.value;
				        }

				    });
				   
				    valueTopDown = true;
				  
			  }
			    
				fillHeroTeamOverviewPanelAggregated();	
			  
		  }
		 });
		

			
	}

	
	
	
	
	
	
	public void fillHeroTeamOverviewPanelAggregated() {
		
		for (int i = 0; i < TeamRoster.teamRosterList.size(); i++) {
		TeamRoster.teamRosterList.get(i).value = TeamRoster.teamRosterList.get(i).calculateValue();
		}
		
	    hero1Panel.fillHeroTeamOverviewPanel(0);
	    hero2Panel.fillHeroTeamOverviewPanel(1);
	    hero3Panel.fillHeroTeamOverviewPanel(2);
	    hero4Panel.fillHeroTeamOverviewPanel(3);
	    hero5Panel.fillHeroTeamOverviewPanel(4);
	    hero6Panel.fillHeroTeamOverviewPanel(5);
	    hero7Panel.fillHeroTeamOverviewPanel(6);
	    hero8Panel.fillHeroTeamOverviewPanel(7);
	    hero9Panel.fillHeroTeamOverviewPanel(8);
	    hero10Panel.fillHeroTeamOverviewPanel(9);
	    hero11Panel.fillHeroTeamOverviewPanel(10);
	    hero12Panel.fillHeroTeamOverviewPanel(11);
	    hero13Panel.fillHeroTeamOverviewPanel(12);
	    hero14Panel.fillHeroTeamOverviewPanel(13);
	    hero15Panel.fillHeroTeamOverviewPanel(14);
	    hero16Panel.fillHeroTeamOverviewPanel(15);	
	    hero17Panel.fillHeroTeamOverviewPanel(16);	
		
	    messages.setText(Integer.toString(GameScreen.newMessages.size()));
	    
	}
	
	

}		
		
