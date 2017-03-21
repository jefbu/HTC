package Graphics.Screens.Utility;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import Entity.Hero;
import Entity.Role;
import Graphics.GameScreen;
import Utility.TeamRoster;

public class ChooseRolePanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	JPanel titlePanel;
		JLabel title;
	JPanel firstRole;
		JButton iconButton1;
		JLabel nameLabel1;
	JPanel secondRole;
		JButton iconButton2;
		JLabel nameLabel2;
	JPanel thirdRole;
		JButton iconButton3;
		JLabel nameLabel3;
	JPanel fourthRole;
		JButton iconButton4;
		JLabel nameLabel4;
	JPanel fifthRole;
		JButton iconButton5;
		JLabel nameLabel5;
		
	boolean hasBlacksmith = false;

	public ChooseRolePanel(int index, JDialog dialog) {
		
		super();
		setPreferredSize (new Dimension (200, 100));
		setBackground (GameScreen.lessImportantColor);
		setLayout (new FlowLayout(FlowLayout.CENTER, 2, 2));
		
		titlePanel = new JPanel();
		titlePanel.setPreferredSize(new Dimension(175, 30));
		titlePanel.setBackground(GameScreen.smallPanel);
		titlePanel.setBorder(new LineBorder(GameScreen.borderColor, 1, true));
		
			title = new JLabel();
			title.setText("Choose a new Role");
			titlePanel.add(title);
		
		add(titlePanel);
		
		firstRole = new JPanel();
		firstRole.setPreferredSize(new Dimension (194, 50));
		firstRole.setBackground(GameScreen.mediumColor);
		firstRole.setBorder(new LineBorder(GameScreen.borderColor, 2, true));
		firstRole.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 2));
		
			iconButton1 = new JButton();
			iconButton1.setPreferredSize(new Dimension(40, 40));
			iconButton1.setIcon(Role.blacksmith.icon);
			firstRole.add(iconButton1);
			
				iconButton1.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						
						for (int i = 0; i < TeamRoster.teamRosterList.size(); i++)
							
							if (TeamRoster.teamRosterList.get(i).role == Role.blacksmith) {
								
								hasBlacksmith = true;
								
							}
						
						if (hasBlacksmith == false) {
						TeamRoster.teamRosterList.get(index).role = Role.blacksmith;
						
						}

						dialog.dispose();
						GameScreen.teamOverviewScreen.fillHeroTeamOverviewPanelAggregated();
						
						}
					
					
				});
			
			
			nameLabel1 = new JLabel();
			nameLabel1.setText("    " + Role.blacksmith.name);
			nameLabel1.setPreferredSize(new Dimension(140, 40));
			firstRole.add(nameLabel1);
			
		add(firstRole);
		
		
		secondRole = new JPanel();
		secondRole.setPreferredSize(new Dimension (194, 50));
		secondRole.setBackground(GameScreen.mediumColor);
		secondRole.setBorder(new LineBorder(GameScreen.borderColor, 2, true));
		secondRole.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 2));
		
			iconButton2 = new JButton();
			iconButton2.setPreferredSize(new Dimension(40, 40));
			iconButton2.setIcon(Role.idle.icon);
			secondRole.add(iconButton2);
			
				iconButton2.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						
						TeamRoster.teamRosterList.get(index).role = Role.idle;
						dialog.dispose();
						GameScreen.teamOverviewScreen.fillHeroTeamOverviewPanelAggregated();
						
					}
					
				});
			
			
			
			nameLabel2 = new JLabel();
			nameLabel2.setText("    " + Role.idle.name);
			nameLabel2.setPreferredSize(new Dimension(140, 40));
			secondRole.add(nameLabel2);
			
		add(secondRole);
		
		thirdRole = new JPanel();
		thirdRole.setPreferredSize(new Dimension (194, 50));
		thirdRole.setBackground(GameScreen.mediumColor);
		thirdRole.setBorder(new LineBorder(GameScreen.borderColor, 2, true));
		thirdRole.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 2));
		
			iconButton3 = new JButton();
			iconButton3.setPreferredSize(new Dimension(40, 40));
			iconButton3.setIcon(Role.accountManager.icon);
			thirdRole.add(iconButton3);
			
				iconButton3.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						
						TeamRoster.teamRosterList.get(index).role = Role.accountManager;
						dialog.dispose();
						//dialog.setVisible(false);
						GameScreen.teamOverviewScreen.fillHeroTeamOverviewPanelAggregated();
					}
					
				});
			
			
			
			nameLabel3 = new JLabel();
			nameLabel3.setText("    " + Role.accountManager.name);
			nameLabel3.setPreferredSize(new Dimension(140, 40));
			thirdRole.add(nameLabel3);
			
		add(thirdRole);
		
		fourthRole = new JPanel();
		fourthRole.setPreferredSize(new Dimension (194, 50));
		fourthRole.setBackground(GameScreen.mediumColor);
		fourthRole.setBorder(new LineBorder(GameScreen.borderColor, 2, true));
		fourthRole.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 2));
		
			iconButton4 = new JButton();
			iconButton4.setPreferredSize(new Dimension(40, 40));
			iconButton4.setIcon(Role.quest.icon);
			fourthRole.add(iconButton4);
			
				iconButton4.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						
						int questers = 0;
						for (int i = 0; i < TeamRoster.teamRosterList.size(); i++) {
							if (TeamRoster.teamRosterList.get(i).role == Role.quest) questers++;
						}
						
						if (questers < 6) {
						
						TeamRoster.teamRosterList.get(index).role = Role.quest;
						dialog.dispose();
						GameScreen.teamOverviewScreen.fillHeroTeamOverviewPanelAggregated();
						
						}
					}
					
				});
			
			
			
			nameLabel4 = new JLabel();
			nameLabel4.setText("    " + Role.quest.name);
			nameLabel4.setPreferredSize(new Dimension(140, 40));
			fourthRole.add(nameLabel4);
			
		add(fourthRole);
		
		
		fifthRole = new JPanel();
		fifthRole.setPreferredSize(new Dimension (194, 50));
		fifthRole.setBackground(GameScreen.mediumColor);
		fifthRole.setBorder(new LineBorder(GameScreen.borderColor, 2, true));
		fifthRole.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 2));
		
			iconButton5 = new JButton();
			iconButton5.setPreferredSize(new Dimension(40, 40));
			iconButton5.setIcon(Role.hrOfficer.icon);
			fifthRole.add(iconButton5);
			
				iconButton5.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						
						boolean clickAllowed = true;
						for (Hero hero: TeamRoster.teamRosterList) {
							if (hero.role == Role.hrOfficer) {
								clickAllowed = false;
							}
						}
						
						if (clickAllowed == true) { 
							TeamRoster.teamRosterList.get(index).role = Role.hrOfficer;
							dialog.dispose();
							GameScreen.teamOverviewScreen.fillHeroTeamOverviewPanelAggregated();
						}
						
					}
					
				});
			
			
			
			nameLabel5 = new JLabel();
			nameLabel5.setText("    " + Role.hrOfficer.name);
			nameLabel5.setPreferredSize(new Dimension(140, 40));
			fifthRole.add(nameLabel5);
			
		add(fifthRole);
		
		
		
		
		
		setVisible(true);
		
				
		
	}
	
}
