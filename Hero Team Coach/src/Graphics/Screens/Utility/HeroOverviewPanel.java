package Graphics.Screens.Utility;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import Graphics.GameScreen;
import Utility.TeamRoster;

public class HeroOverviewPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	

		JPanel heroRolePanel;
			JButton heroRolePanelButton = new JButton();
		JPanel heroNamePanel;
			JButton heroNamePanelButton = new JButton();
		JPanel heroGenderPanel;
			JLabel heroGenderPanelLabel = new JLabel();
		JPanel heroRacePanel;
			JLabel heroRacePanelLabel = new JLabel();
		JPanel heroJobPanel;
			JLabel heroJobPanelLabel = new JLabel();
		JPanel heroMaturityPanel;
			JLabel heroMaturityPanelLabel = new JLabel();
		JPanel heroCombatPanel;
			JLabel heroCombatPanelLabel = new JLabel();
		JPanel heroSkillPanel;
			JLabel heroSkillPanelLabel = new JLabel();
		JPanel heroIntelligencePanel;
			JLabel heroIntelligencePanelLabel = new JLabel();
		JPanel heroPersonalityPanel;
			JLabel heroPersonalityPanelLabel = new JLabel();
		JPanel heroTraitsPanel;
			JLabel heroTraitsPanelLabel1 = new JLabel();
			JLabel heroTraitsPanelLabel2 = new JLabel();
			JLabel heroTraitsPanelLabel3 = new JLabel();
			JLabel heroTraitsPanelLabel4 = new JLabel();
			JLabel heroTraitsPanelLabel5 = new JLabel();
			JLabel heroTraitsPanelLabel6 = new JLabel();
			JLabel heroTraitsPanelLabel7 = new JLabel();
			JLabel heroTraitsPanelLabel8 = new JLabel();
		JPanel heroValuePanel;
			JLabel heroValuePanelLabel = new JLabel();
			
		JDialog chooseRole; 
		ChooseRolePanel chooseRolePanel;  
			
	
	public HeroOverviewPanel(int index) {
		
		super();
		
		setPreferredSize(new Dimension (996, 40));
		setBackground(GameScreen.tableRow2);
		setLayout(new FlowLayout(FlowLayout.LEFT, 2, 2));
		
		heroRolePanel = new JPanel();
		heroRolePanel.setPreferredSize(new Dimension (65, 36));
		heroRolePanel.setBackground(GameScreen.smallPanel);
		heroRolePanel.setBorder(new LineBorder(Color.GRAY, 1, true));
		heroRolePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 1));
		add(heroRolePanel);
		heroRolePanelButton.setVisible(false);
		heroRolePanel.add(heroRolePanelButton);
		
			heroRolePanelButton.addActionListener(new ActionListener() {
				  public void actionPerformed(ActionEvent e)
				  {
				   
				    chooseRole.setVisible(true);
				    
				    		}
				});
		
		heroNamePanel = new JPanel();
		heroNamePanel.setPreferredSize(new Dimension (155, 36));
		heroNamePanel.setBackground(GameScreen.smallPanel);
		heroNamePanel.setBorder(new LineBorder(Color.GRAY, 1, true));
		heroNamePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 1));
		add(heroNamePanel);
		heroNamePanelButton.setOpaque(false);
		heroNamePanelButton.setContentAreaFilled(false);
		heroNamePanelButton.setBorderPainted(false);
		heroNamePanel.add(heroNamePanelButton);
		
		heroGenderPanel = new JPanel();
		heroGenderPanel.setPreferredSize(new Dimension (60, 36));
		heroGenderPanel.setBackground(GameScreen.smallPanel);
		heroGenderPanel.setBorder(new LineBorder(Color.GRAY, 1, true));
		heroGenderPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 8));
		add(heroGenderPanel);
		heroGenderPanel.add(heroGenderPanelLabel);
		
		heroRacePanel = new JPanel();
		heroRacePanel.setPreferredSize(new Dimension (105, 36));
		heroRacePanel.setBackground(GameScreen.smallPanel);
		heroRacePanel.setBorder(new LineBorder(Color.GRAY, 1, true));
		heroRacePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 8));
		add(heroRacePanel);
		heroRacePanel.add(heroRacePanelLabel);
		
		heroJobPanel = new JPanel();
		heroJobPanel.setPreferredSize(new Dimension (105, 36));
		heroJobPanel.setBackground(GameScreen.smallPanel);
		heroJobPanel.setBorder(new LineBorder(Color.GRAY, 1, true));
		heroJobPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 8));
		add(heroJobPanel);
		heroJobPanel.add(heroJobPanelLabel);
		
		heroMaturityPanel = new JPanel();
		heroMaturityPanel.setPreferredSize(new Dimension (62, 36));
		heroMaturityPanel.setBackground(GameScreen.smallPanel);
		heroMaturityPanel.setBorder(new LineBorder(Color.GRAY, 1, true));
		heroMaturityPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 8));
		add(heroMaturityPanel);
		heroMaturityPanel.add(heroMaturityPanelLabel);
	
		heroCombatPanel = new JPanel();
		heroCombatPanel.setPreferredSize(new Dimension (62, 36));
		heroCombatPanel.setBackground(GameScreen.smallPanel);
		heroCombatPanel.setBorder(new LineBorder(Color.GRAY, 1, true));
		heroCombatPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 8));
		add(heroCombatPanel);
		heroCombatPanel.add(heroCombatPanelLabel);
	
		heroSkillPanel = new JPanel();
		heroSkillPanel.setPreferredSize(new Dimension (62, 36));
		heroSkillPanel.setBackground(GameScreen.smallPanel);
		heroSkillPanel.setBorder(new LineBorder(Color.GRAY, 1, true));
		heroSkillPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 8));
		add(heroSkillPanel);
		heroSkillPanel.add(heroSkillPanelLabel);
		
		heroIntelligencePanel = new JPanel();
		heroIntelligencePanel.setPreferredSize(new Dimension (62, 36));
		heroIntelligencePanel.setBackground(GameScreen.smallPanel);
		heroIntelligencePanel.setBorder(new LineBorder(Color.GRAY, 1, true));
		heroIntelligencePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 8));
		add(heroIntelligencePanel);
		heroIntelligencePanel.add(heroIntelligencePanelLabel);
		
		heroPersonalityPanel = new JPanel();
		heroPersonalityPanel.setPreferredSize(new Dimension (62, 36));
		heroPersonalityPanel.setBackground(GameScreen.smallPanel);
		heroPersonalityPanel.setBorder(new LineBorder(Color.GRAY, 1, true));
		heroPersonalityPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 8));
		add(heroPersonalityPanel);
		heroPersonalityPanel.add(heroPersonalityPanelLabel);
		
		heroTraitsPanel = new JPanel();
		heroTraitsPanel.setPreferredSize(new Dimension (85, 36));
		heroTraitsPanel.setBackground(GameScreen.smallPanel);
		heroTraitsPanel.setBorder(new LineBorder(Color.GRAY, 1, true));
		heroTraitsPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 1));
		add(heroTraitsPanel);
		heroTraitsPanel.add(heroTraitsPanelLabel1);
		heroTraitsPanel.add(heroTraitsPanelLabel2);
		heroTraitsPanel.add(heroTraitsPanelLabel3);
		heroTraitsPanel.add(heroTraitsPanelLabel4);
		heroTraitsPanel.add(heroTraitsPanelLabel5);
		heroTraitsPanel.add(heroTraitsPanelLabel6);
	
		heroValuePanel = new JPanel();
		heroValuePanel.setPreferredSize(new Dimension (85, 36));
		heroValuePanel.setBackground(GameScreen.smallPanel);
		heroValuePanel.setBorder(new LineBorder(Color.GRAY, 1, true));
		heroValuePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 8));
		add(heroValuePanel);
		heroValuePanel.add(heroValuePanelLabel);
		
		chooseRole = new JDialog(null, Dialog.ModalityType.APPLICATION_MODAL);
		chooseRole.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		chooseRole.setLocationRelativeTo(heroRolePanelButton);
		chooseRole.setLocation(460, 280 + (index * 40));
		chooseRole.setSize(new Dimension(200, 410));
		chooseRole.setUndecorated(true);
		chooseRole.setBackground(GameScreen.borderColor);

	    chooseRolePanel = new ChooseRolePanel(index, chooseRole);
	    chooseRole.getContentPane().add(chooseRolePanel);
		
			
			
			fillHeroTeamOverviewPanel(index);
			
	}
	
	
	public void fillHeroTeamOverviewPanel(int index) {
		
		
		if (TeamRoster.teamRosterList.size() > index) {
		heroRolePanelButton.setIcon(TeamRoster.teamRosterList.get(index).role.icon);
		heroRolePanelButton.setPreferredSize(new Dimension(32, 32));
		heroRolePanelButton.setVisible(true);
			
		
		}
		
		if (TeamRoster.teamRosterList.size() > index) {
		heroNamePanelButton.setText(TeamRoster.teamRosterList.get(index).name);
		heroNamePanelButton.setPreferredSize(new Dimension(150,32));
		heroNamePanelButton.setBorderPainted(true);
		}
		
		
			heroNamePanelButton.addActionListener(new ActionListener() {
				  public void actionPerformed(ActionEvent e)
				  {
				    GameScreen.teamOverviewScreen.setVisible(false);
				    GameScreen.currentHero = TeamRoster.teamRosterList.get(index);
				    GameScreen.currentHeroIndex = index;
				    GameScreen.heroDetailScreen.fillScreen();
					GameScreen.heroDetailScreen.setVisible(true);
				    		}
				});
		
		
		//if (TeamRoster.teamRosterList.size() > index) {
		//heroGenderPanelLabel = new JLabel();
		//heroGenderPanel.add(heroGenderPanelLabel);
		//}
		
		if (TeamRoster.teamRosterList.size() > index) {
		heroRacePanelLabel.setText(TeamRoster.teamRosterList.get(index).race.name);
		}
		
		if (TeamRoster.teamRosterList.size() > index) {
		heroJobPanelLabel.setText(TeamRoster.teamRosterList.get(index).job.name);
		}
		
		if (TeamRoster.teamRosterList.size() > index) {
		heroMaturityPanelLabel.setText(Integer.toString(TeamRoster.teamRosterList.get(index).maturity));
		}
		
			if (TeamRoster.teamRosterList.size() > index) {
			heroMaturityPanel.setBackground(new Color(240 - TeamRoster.teamRosterList.get(index).maturity / 5,
					235 + TeamRoster.teamRosterList.get(index).maturity / 5, 210));
			}
		
		if (TeamRoster.teamRosterList.size() > index) {
		heroCombatPanelLabel.setText(Integer.toString(TeamRoster.teamRosterList.get(index).combat));
		}
			
			if (TeamRoster.teamRosterList.size() > index) {
			heroCombatPanel.setBackground(new Color(245 - TeamRoster.teamRosterList.get(index).combat / 5,
					230 + TeamRoster.teamRosterList.get(index).combat / 5, 225));
			}
			
		if (TeamRoster.teamRosterList.size() > index) {
		heroSkillPanelLabel.setText(Integer.toString(TeamRoster.teamRosterList.get(index).skill));
		}
		
			if (TeamRoster.teamRosterList.size() > index) {
			heroSkillPanel.setBackground(new Color(245 - TeamRoster.teamRosterList.get(index).skill / 5,
					230 + TeamRoster.teamRosterList.get(index).skill / 5, 225));
			}
		
		if (TeamRoster.teamRosterList.size() > index) {
		heroIntelligencePanelLabel.setText(Integer.toString(TeamRoster.teamRosterList.get(index).intelligence));
		}
		
			if (TeamRoster.teamRosterList.size() > index) {
			heroIntelligencePanel.setBackground(new Color(245 - TeamRoster.teamRosterList.get(index).intelligence / 5,
					230 + TeamRoster.teamRosterList.get(index).intelligence / 5, 225));
			}
				
		if (TeamRoster.teamRosterList.size() > index) {
		heroPersonalityPanelLabel.setText(Integer.toString(TeamRoster.teamRosterList.get(index).personality));
		}
		
			if (TeamRoster.teamRosterList.size() > index) {
			heroPersonalityPanel.setBackground(new Color(245 - TeamRoster.teamRosterList.get(index).personality / 5,
					230 + TeamRoster.teamRosterList.get(index).personality / 5, 225));
			}
		
		if (TeamRoster.teamRosterList.size() > index) {
		heroTraitsPanelLabel1.setPreferredSize(new Dimension (16, 16));
		heroTraitsPanelLabel1.setIcon(null);
		heroTraitsPanelLabel1.setIcon(TeamRoster.teamRosterList.get(index).heroTraits.get(0).icon);
		}
		
		if (TeamRoster.teamRosterList.size() > index) {
		heroTraitsPanelLabel2.setPreferredSize(new Dimension (16, 16));
		heroTraitsPanelLabel2.setIcon(null);
		heroTraitsPanelLabel2.setIcon(TeamRoster.teamRosterList.get(index).heroTraits.get(1).icon);
		}
		
		if (TeamRoster.teamRosterList.size() > index) {
		heroTraitsPanelLabel3.setPreferredSize(new Dimension (16, 16));
		heroTraitsPanelLabel3.setIcon(null);
		if (TeamRoster.teamRosterList.get(index).weapon.weaponTraits.size() > 0) {
		heroTraitsPanelLabel3.setIcon(TeamRoster.teamRosterList.get(index).weapon.weaponTraits.get(0).icon);
			}
		}
		
		if (TeamRoster.teamRosterList.size() > index) {
		heroTraitsPanelLabel4.setPreferredSize(new Dimension (16, 16));
		heroTraitsPanelLabel4.setIcon(null);
		if (TeamRoster.teamRosterList.get(index).armour.armourTraits.size() > 0) {
		heroTraitsPanelLabel4.setIcon(TeamRoster.teamRosterList.get(index).armour.armourTraits.get(0).icon);
			}
		}
		
		if (TeamRoster.teamRosterList.size() > index) {
		heroTraitsPanelLabel5.setPreferredSize(new Dimension (16, 16));
		heroTraitsPanelLabel5.setBackground(Color.MAGENTA);
		}
		
		if (TeamRoster.teamRosterList.size() > index) {
		heroTraitsPanelLabel6.setPreferredSize(new Dimension (16, 16));
		heroTraitsPanelLabel6.setBackground(Color.BLUE);
		}
		
		if (TeamRoster.teamRosterList.size() > index) {
		int no = TeamRoster.teamRosterList.get(index).value;
		String number = String.format("%,d", no);
		heroValuePanelLabel.setText(number);
		}
			
	}	
			
}
