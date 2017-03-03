package Graphics.Screens;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import Entity.Hero;
import Entity.Role;
import Graphics.GameScreen;
import Utility.TeamRoster;

public class AccountManagerScreen extends TeamScreen {

	private static final long serialVersionUID = 1L;

	public Hero accountManager;
	public JLabel nameLabel = new JLabel();
	public JLabel skillNumberLabel = new JLabel();
	public JLabel combatNumberLabel = new JLabel();
	public JPanel questList;
	public JPanel quests;

	public AccountManagerScreen() {

		super();

		centrePanel.setLayout(new FlowLayout());

		JPanel upperPanel = new JPanel();
		upperPanel.setPreferredSize(new Dimension(1050, 50));
		upperPanel.setBackground(GameScreen.smallPanel);
		upperPanel.setBorder(new LineBorder(GameScreen.borderColor, 3, true));
		upperPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));

		JPanel upperStringPanel = new JPanel();
		upperStringPanel.setPreferredSize(new Dimension(200, 35));
		upperStringPanel.setBackground(GameScreen.mediumColor);
		upperStringPanel.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		upperStringPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 7));

		JLabel textLabel = new JLabel(" Your Account Manager is");
		upperStringPanel.add(textLabel);

		upperPanel.add(upperStringPanel);

		JPanel upperAMPanel = new JPanel();
		upperAMPanel.setPreferredSize(new Dimension(350, 35));
		upperAMPanel.setBackground(GameScreen.backgroundColor);
		upperAMPanel.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		upperAMPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 7));

		upperAMPanel.add(nameLabel);

		upperPanel.add(upperAMPanel);

		JPanel personalityPanel = new JPanel();
		personalityPanel.setPreferredSize(new Dimension(50, 35));
		personalityPanel.setBackground(GameScreen.smallPanel);
		personalityPanel.setBorder(new LineBorder(GameScreen.importantColor, 2, true));
		personalityPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 7));

		JLabel personalityLabel = new JLabel("PER");
		personalityPanel.add(personalityLabel);

		upperPanel.add(personalityPanel);

		JPanel personalityNumberPanel = new JPanel();
		personalityNumberPanel.setPreferredSize(new Dimension(50, 35));
		personalityNumberPanel.setBackground(GameScreen.smallPanel);
		personalityNumberPanel.setBorder(new LineBorder(GameScreen.importantColor, 2, true));
		personalityNumberPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 7));

		JLabel personalityNumberLabel = new JLabel();
		personalityNumberPanel.add(personalityNumberLabel);

		upperPanel.add(personalityNumberPanel);

		JPanel intelligencePanel = new JPanel();
		intelligencePanel.setPreferredSize(new Dimension(50, 35));
		intelligencePanel.setBackground(GameScreen.smallPanel);
		intelligencePanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 2, true));
		intelligencePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 7));

		JLabel intelligenceLabel = new JLabel("INT");
		intelligencePanel.add(intelligenceLabel);

		upperPanel.add(intelligencePanel);

		JPanel intelligenceNumberPanel = new JPanel();
		intelligenceNumberPanel.setPreferredSize(new Dimension(50, 35));
		intelligenceNumberPanel.setBackground(GameScreen.smallPanel);
		intelligenceNumberPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 2, true));
		intelligenceNumberPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 7));

		JLabel intelligenceNumberLabel = new JLabel();
		intelligenceNumberPanel.add(intelligenceNumberLabel);

		upperPanel.add(intelligenceNumberPanel);

		JPanel traitsPanel = new JPanel();
		traitsPanel.setPreferredSize(new Dimension(50, 35));
		traitsPanel.setBackground(GameScreen.smallPanel);
		traitsPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 2, true));
		traitsPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 7));

		JLabel traitsLabel = new JLabel("Traits");
		traitsPanel.add(traitsLabel);

		upperPanel.add(traitsPanel);

		JPanel traitsNumberPanel = new JPanel();
		traitsNumberPanel.setPreferredSize(new Dimension(200, 35));
		traitsNumberPanel.setBackground(GameScreen.smallPanel);
		traitsNumberPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 2, true));
		traitsNumberPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 7));

		upperPanel.add(traitsNumberPanel);

		centrePanel.add(upperPanel);

		JPanel middlePanel = new JPanel();
		middlePanel.setPreferredSize(new Dimension(750, 155));
		middlePanel.setBackground(GameScreen.smallPanel);
		middlePanel.setBorder(new LineBorder(GameScreen.borderColor, 3, true));
		middlePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 5));

		JLabel workingOnLabel = new JLabel("<html>and is looking for <br>quests that are: </html>");
		middlePanel.add(workingOnLabel);

		JPanel riskType = new JPanel();
		riskType.setPreferredSize(new Dimension(140, 140));
		riskType.setBackground(GameScreen.mediumColor);
		middlePanel.add(riskType);

		JLabel riskTypeLabel = new JLabel(imageLoader.loadImageIcon("/Images/Icons/armour.png"));
		riskTypeLabel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 110));
		riskType.add(riskTypeLabel);

		JLabel riskName = new JLabel("Low Loot/Low Payout");
		riskTypeLabel.add(riskName);

		JPanel nature = new JPanel();
		nature.setPreferredSize(new Dimension(140, 140));
		nature.setBackground(GameScreen.mediumColor);
		middlePanel.add(nature);

		JLabel natureLabel = new JLabel(imageLoader.loadImageIcon("/Images/Icons/gold.png"));
		natureLabel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 110));
		nature.add(natureLabel);

		JLabel natureName = new JLabel("Combat Focused");
		natureLabel.add(natureName);

		JPanel reward = new JPanel();
		reward.setPreferredSize(new Dimension(140, 140));
		reward.setBackground(GameScreen.mediumColor);
		middlePanel.add(reward);

		JLabel rewardLabel = new JLabel(imageLoader.loadImageIcon("/Images/Icons/4stars.png"));
		rewardLabel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 110));
		reward.add(rewardLabel);

		JLabel rewardName = new JLabel("<html>that reward <b>loot</b></html>");
		rewardLabel.add(rewardName);

		centrePanel.add(middlePanel);

		questList = new JPanel();
		questList.setPreferredSize(new Dimension(1050, 550));
		questList.setBorder(new LineBorder(GameScreen.borderColor, 3, true));
		questList.setBackground(GameScreen.mediumColor);
		questList.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));

		JButton titleButton = new JButton("Quest Title");
		titleButton.setPreferredSize(new Dimension(350, 50));
		questList.add(titleButton);

		JButton focusButton = new JButton("Quest Focus");
		focusButton.setPreferredSize(new Dimension(150, 50));
		questList.add(focusButton);

		JButton riskButton = new JButton("Risk");
		riskButton.setPreferredSize(new Dimension(75, 50));
		questList.add(riskButton);

		JButton moneyButton = new JButton("Cash");
		moneyButton.setPreferredSize(new Dimension(75, 50));
		questList.add(moneyButton);

		JButton lootButton = new JButton("Loot");
		lootButton.setPreferredSize(new Dimension(75, 50));
		questList.add(lootButton);

		JButton fameButton = new JButton("Fame");
		fameButton.setPreferredSize(new Dimension(75, 50));
		questList.add(fameButton);

		JButton contractButton = new JButton("Contract Fee");
		contractButton.setPreferredSize(new Dimension(140, 50));
		questList.add(contractButton);

		JButton selectButton = new JButton("Select");
		selectButton.setPreferredSize(new Dimension(50, 50));
		questList.add(selectButton);

		centrePanel.add(questList);

		quests = new JPanel();
		quests.setPreferredSize(new Dimension(1035, 475));
		quests.setBackground(GameScreen.mediumColor);
		questList.add(quests);

		fillAccountManagerScreen();

	}

	public void fillAccountManagerScreen() {

		for (int i = 0; i < TeamRoster.teamRosterList.size(); i++) {
			if (TeamRoster.teamRosterList.get(i).role == Role.accountManager) {
				accountManager = TeamRoster.teamRosterList.get(i);
			}
		}

		quests.removeAll();
		quests.repaint();
		quests.revalidate();

		for (int ii = 0; ii < GameScreen.availableQuest.availableQuests.size(); ii++) {
				
			int index = ii;
			
			JPanel horizontal = new JPanel();
			horizontal.setPreferredSize(new Dimension(1030, 40));
			if (GameScreen.currentQuest == GameScreen.availableQuest.availableQuests.get(index)) {
				
				horizontal.setBackground(GameScreen.importantColor);
				
			} else {
				horizontal.setBackground(GameScreen.lessImportantColor);
			}
			quests.add(horizontal);

			JPanel questTitlePanel = new JPanel();
			questTitlePanel.setPreferredSize(new Dimension(340, 30));
			questTitlePanel.setBackground(GameScreen.smallPanel);

			horizontal.add(questTitlePanel);

			JLabel questTitleLabel = new JLabel();
			questTitleLabel.setText(GameScreen.availableQuest.availableQuests.get(ii).title);
			questTitlePanel.add(questTitleLabel);

			JPanel questFocusPanel = new JPanel();
			questFocusPanel.setPreferredSize(new Dimension(150, 30));
			questFocusPanel.setBackground(GameScreen.smallPanel);

			horizontal.add(questFocusPanel);

			JLabel questFocusLabel = new JLabel();
			questFocusLabel.setText(GameScreen.availableQuest.availableQuests.get(ii).focus);
			questFocusPanel.add(questFocusLabel);

			JPanel questRiskPanel = new JPanel();
			questRiskPanel.setPreferredSize(new Dimension(75, 30));
			questRiskPanel.setBackground(GameScreen.smallPanel);

			horizontal.add(questRiskPanel);

			JLabel questRiskLabel = new JLabel();
			questRiskLabel.setText(Integer.toString(GameScreen.availableQuest.availableQuests.get(ii).risk));
			questRiskPanel.add(questRiskLabel);

			JPanel questCashPanel = new JPanel();
			questCashPanel.setPreferredSize(new Dimension(75, 30));
			questCashPanel.setBackground(GameScreen.smallPanel);

			horizontal.add(questCashPanel);

			JLabel questCashLabel = new JLabel();
			questCashLabel.setText(Integer.toString(GameScreen.availableQuest.availableQuests.get(ii).cash));
			questCashPanel.add(questCashLabel);

			JPanel questLootPanel = new JPanel();
			questLootPanel.setPreferredSize(new Dimension(75, 30));
			questLootPanel.setBackground(GameScreen.smallPanel);

			horizontal.add(questLootPanel);

			JLabel questLootLabel = new JLabel();
			questLootLabel.setText(Integer.toString(GameScreen.availableQuest.availableQuests.get(ii).loot));
			questLootPanel.add(questLootLabel);

			JPanel questFamePanel = new JPanel();
			questFamePanel.setPreferredSize(new Dimension(75, 30));
			questFamePanel.setBackground(GameScreen.smallPanel);

			horizontal.add(questFamePanel);

			JLabel questFameLabel = new JLabel();
			questFameLabel.setText(Integer.toString(GameScreen.availableQuest.availableQuests.get(ii).fame));
			questFamePanel.add(questFameLabel);

			JPanel questFeePanel = new JPanel();
			questFeePanel.setPreferredSize(new Dimension(138, 30));
			questFeePanel.setBackground(GameScreen.smallPanel);

			horizontal.add(questFeePanel);

			JLabel questFeeLabel = new JLabel();
			questFeeLabel.setText(Integer.toString(GameScreen.availableQuest.availableQuests.get(ii).contractFee));
			questFeePanel.add(questFeeLabel);

			JPanel questSelectPanel = new JPanel();
			questSelectPanel.setPreferredSize(new Dimension(52, 30));
			questSelectPanel.setBackground(GameScreen.smallPanel);

			JButton questSelect = new JButton();
			questSelect.setPreferredSize(new Dimension(50, 24));
			questSelect.setContentAreaFilled(false);
			questSelectPanel.add(questSelect);
			
				questSelect.addActionListener(new ActionListener() {
					public void actionPerformed (ActionEvent e) {
						GameScreen.currentQuest = GameScreen.availableQuest.availableQuests.get(index);
						fillAccountManagerScreen();
					}
				});

			horizontal.add(questSelectPanel);

		}

		nameLabel.setText(accountManager.name);
		skillNumberLabel.setText(Integer.toString(accountManager.skill));
		combatNumberLabel.setText(Integer.toString(accountManager.combat));
		messages.setText(Integer.toString(GameScreen.newMessages.size()));

	}

}
