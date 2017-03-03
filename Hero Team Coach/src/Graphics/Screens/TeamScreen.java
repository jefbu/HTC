package Graphics.Screens;

import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import Graphics.GameScreen;
import Graphics.ImageLoader;
import Utility.MessageFactory;
import Utility.TeamRoster;

public abstract class TeamScreen extends JPanel {

	private static final long serialVersionUID = 1L;

	GridBagConstraints c;
	protected JPanel centrePanel;
	Dimension upperButtonDimension = new Dimension(100, 50);
	ImageLoader imageLoader = new ImageLoader();
	JDialog advancePopup;
	JButton messages;
	MessageFactory messageFactory = new MessageFactory();
	Random random = new Random();

	public TeamScreen() {

		super();
		setPreferredSize(new Dimension(GameScreen.WIDTH, GameScreen.HEIGHT));
		setBackground(GameScreen.backgroundColor);
		setLayout(new GridBagLayout());

		c = new GridBagConstraints();
		c.anchor = GridBagConstraints.BASELINE;
		c.fill = GridBagConstraints.BOTH;
		c.insets = new Insets(0, 5, 10, 5);

		c.gridx = 0;
		c.gridy = 0;
		c.gridheight = 2;
		JPanel upperLeftPanel = new JPanel();
		upperLeftPanel.setBorder(new LineBorder(GameScreen.borderColor, 5, true));
		upperLeftPanel.setPreferredSize(new Dimension(200, 200));
		upperLeftPanel.setBackground(GameScreen.mediumColor);

		JLabel logo = new JLabel(imageLoader.loadImageIcon("/Images/logo.png"), JLabel.CENTER);
		upperLeftPanel.add(logo);

		add(upperLeftPanel, c);

		c.gridx = 0;
		c.gridy = 2;
		c.gridheight = 2;
		JPanel lowerLeftPanel = new JPanel();
		lowerLeftPanel.setBorder(new LineBorder(GameScreen.borderColor, 5, true));
		lowerLeftPanel.setPreferredSize(new Dimension(200, 650));
		lowerLeftPanel.setBackground(GameScreen.mediumColor);
		add(lowerLeftPanel, c);		

		c.gridx = 1;
		c.gridy = 0;
		c.gridheight = 1;
		JPanel upperCentrePanel = new JPanel();
		upperCentrePanel.setBorder(new LineBorder(GameScreen.borderColor, 5, true));
		upperCentrePanel.setPreferredSize(new Dimension(1100, 70));
		upperCentrePanel.setBackground(GameScreen.mediumColor);
		upperCentrePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));

		JButton overview = new JButton("Overview");
		overview.setPreferredSize(upperButtonDimension);
		upperCentrePanel.add(overview);

		overview.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				GameScreen.teamOverviewScreen.fillHeroTeamOverviewPanelAggregated();
				GameScreen.teamOverviewScreen.setVisible(true);
			}
		});
		
		JButton humanResources = new JButton("HR");
		humanResources.setPreferredSize(upperButtonDimension);
		upperCentrePanel.add(humanResources);

		humanResources.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				GameScreen.teamHRScreen.fillHRScreen();
				GameScreen.teamHRScreen.setVisible(true);
			}
		});

		JButton blacksmith = new JButton("BS");
		blacksmith.setPreferredSize(upperButtonDimension);
		upperCentrePanel.add(blacksmith);

		blacksmith.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				GameScreen.teamBlacksmithScreen.fillBlacksmithScreen();
				GameScreen.teamBlacksmithScreen.setVisible(true);
			}
		});
		
		JButton accountManager = new JButton("AM");
		accountManager.setPreferredSize(upperButtonDimension);
		upperCentrePanel.add(accountManager);
		
		accountManager.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				setVisible(false);
				GameScreen.teamAccountManagerScreen.fillAccountManagerScreen();
				GameScreen.teamAccountManagerScreen.setVisible(true);
			}
		});

		JButton conversations = new JButton(Integer.toString(GameScreen.conversationsAmount));
		conversations.setPreferredSize(upperButtonDimension);
		upperCentrePanel.add(conversations);

		conversations.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				GameScreen.teamBlacksmithScreen.setVisible(true);

			}
		});

		messages = new JButton(Integer.toString(GameScreen.newMessages.size()));
		messages.setPreferredSize(upperButtonDimension);
		upperCentrePanel.add(messages);

		messages.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				GameScreen.messagesScreen.messagesScreenFill();
				GameScreen.messagesScreen.setVisible(true);
			}
		});

		add(upperCentrePanel, c);

		c.gridx = 1;
		c.gridy = 1;
		c.gridheight = 3;
		centrePanel = new JPanel();
		centrePanel.setBorder(new LineBorder(GameScreen.borderColor, 5, true));
		centrePanel.setPreferredSize(new Dimension(1100, 780));
		centrePanel.setBackground(GameScreen.mediumColor);
		add(centrePanel, c);

		c.gridx = 2;
		c.gridy = 0;
		c.gridheight = 2;
		JPanel upperRightPanel = new JPanel();
		upperRightPanel.setBorder(new LineBorder(GameScreen.borderColor, 5, true));
		upperRightPanel.setPreferredSize(new Dimension(200, 200));
		upperRightPanel.setBackground(GameScreen.mediumColor);

		JLabel logo2 = new JLabel(imageLoader.loadImageIcon("/Images/logo.png"), JLabel.CENTER);
		upperRightPanel.add(logo2);

		add(upperRightPanel, c);

		c.gridx = 2;
		c.gridy = 2;
		c.gridheight = 1;
		JPanel middleRightPanel = new JPanel();
		middleRightPanel.setBorder(new LineBorder(GameScreen.borderColor, 5, true));
		middleRightPanel.setPreferredSize(new Dimension(200, 500));
		middleRightPanel.setBackground(GameScreen.mediumColor);
		middleRightPanel.setLayout(new GridBagLayout());

		GridBagConstraints middleRightC = new GridBagConstraints();
		middleRightC.anchor = GridBagConstraints.CENTER;
		middleRightC.insets = new Insets(0, 0, 5, 0);

		CustomerSatisfactionGraph customerSatisfactionGraph = new CustomerSatisfactionGraph();
		middleRightPanel.add(customerSatisfactionGraph, middleRightC);

		middleRightC.gridy = 1;
		ManagementSatisfactionGraph managementSatisfactionGraph = new ManagementSatisfactionGraph();
		middleRightPanel.add(managementSatisfactionGraph, middleRightC);

		middleRightC.gridy = 2;
		TeamMoraleGraph teamMoraleGraph = new TeamMoraleGraph();
		middleRightPanel.add(teamMoraleGraph, middleRightC);

		add(middleRightPanel, c);

		c.gridx = 2;
		c.gridy = 3;
		c.gridheight = 1;
		JPanel lowerRightPanel = new JPanel();
		lowerRightPanel.setBorder(new LineBorder(GameScreen.borderColor, 5, true));
		lowerRightPanel.setPreferredSize(new Dimension(200, 150));
		lowerRightPanel.setBackground(GameScreen.mediumColor);

		JButton advance = new JButton("Advance");
		advance.setPreferredSize(new Dimension(180, 130));
		lowerRightPanel.add(advance);

		advance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				advancePopup = new JDialog(null, Dialog.ModalityType.APPLICATION_MODAL);
				advancePopup.setUndecorated(true);
				advancePopup.setSize(new Dimension(300, 300));
				advancePopup.setLocationRelativeTo(null);

				JPanel popupPanel = new JPanel();
				popupPanel.setPreferredSize(new Dimension(300, 300));
				popupPanel.setBackground(GameScreen.lessImportantColor);
				popupPanel.setBorder(new LineBorder(GameScreen.borderColor, 10, true));
				advancePopup.add(popupPanel);
				advancePopup.setContentPane(popupPanel);

				JLabel warningText = new JLabel();
				String extra1;
				if (GameScreen.newMessages.size() > 0) {
					extra1 = "You have " + Integer.toString(GameScreen.newMessages.size()) + " unread messages";
				} else
					extra1 = "arr";
				warningText.setFont(new Font("Serif", Font.BOLD, 18));
				warningText.setText(
						"<html>Are you sure you want to <br>advance to the next Adventure?<br><br> </html>" + extra1);
				popupPanel.add(warningText);
				
				JButton yesButton = new JButton("Yes");
				yesButton.setPreferredSize(new Dimension (100, 45));
				
					yesButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							if (GameScreen.currentQuest != null) {
							
							GameScreen.setScreensInvisible();
							GameScreen.questScreen.initiate();
							
							
							for (int i = 0; i < TeamRoster.teamRosterList.size(); i++) {
								
								int willWriteMessage = random.nextInt(100);
								if (willWriteMessage < TeamRoster.teamRosterList.get(i).garrulity) {
									GameScreen.newMessages.add(messageFactory.generateMessage(TeamRoster.teamRosterList.get(i)));
								}
								
							}
							
							messages.setText(Integer.toString(GameScreen.newMessages.size()));
							
							GameScreen.teamOverviewScreen.fillHeroTeamOverviewPanelAggregated();
							advancePopup.dispose();
							
							}
						}
					});
					
					
				
				popupPanel.add(yesButton);
				
				JButton noButton = new JButton("No");
				noButton.setPreferredSize(new Dimension (100, 45));
				
					noButton.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
					
								advancePopup.dispose();
							}
							
					});
				popupPanel.add(noButton);

				advancePopup.setVisible(true);



			}
		});

		add(lowerRightPanel, c);

		setVisible(false);

	}

}