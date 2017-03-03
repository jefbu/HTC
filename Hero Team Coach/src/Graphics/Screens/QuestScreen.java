package Graphics.Screens;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import Entity.Role;
import Graphics.GameScreen;
import Graphics.Screens.Utility.QuestersPanel;
import Graphics.Screens.Utility.TextRollerLabel;
import Utility.TeamRoster;

public class QuestScreen extends JPanel {

	private static final long serialVersionUID = 1L;

	private JPanel titlePanel;
	public JLabel titleLabel;
	private JPanel questersPanelContentPane;
	private static QuestersPanel questersPanel;
	private JPanel imagePanel;
	public JLabel imageLabel;
	private JPanel advancePanel;
	private JButton advanceButton;
	private JPanel textPanel;
	public TextRollerLabel textLabel;
	
	public boolean textFinished;

	public QuestScreen() {

		super();
		
		textFinished = false;

		setPreferredSize(new Dimension(GameScreen.WIDTH, GameScreen.HEIGHT));
		setBackground(GameScreen.backgroundColor);
		setLayout(new FlowLayout(FlowLayout.CENTER, 0, 10));

		titlePanel = new JPanel();
		titlePanel.setPreferredSize(new Dimension(1400, 60));
		titlePanel.setBackground(GameScreen.mediumColor);
		titlePanel.setBorder(new LineBorder(GameScreen.borderColor, 3, false));
		add(titlePanel);

		titleLabel = new JLabel();
		titlePanel.add(titleLabel);

		questersPanelContentPane = new JPanel();
		questersPanelContentPane.setPreferredSize(new Dimension(400, 600));
		questersPanelContentPane.setBackground(GameScreen.backgroundColor);
		questersPanelContentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 100, 90));
		questersPanel = new QuestersPanel();
		questersPanelContentPane.add(questersPanel);
		add(questersPanelContentPane);

		imagePanel = new JPanel();
		imagePanel.setPreferredSize(new Dimension(800, 600));
		imagePanel.setBackground(GameScreen.lessImportantColor);
		imagePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		// imagePanel.setBorder(new LineBorder(GameScreen.borderColor, 3,
		// false));
		add(imagePanel);

		imageLabel = new JLabel();
		imagePanel.add(imageLabel);

		advancePanel = new JPanel();
		advancePanel.setPreferredSize(new Dimension(400, 600));
		advancePanel.setBackground(GameScreen.backgroundColor);
		advancePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 150));
		add(advancePanel);

		advanceButton = new JButton();
		advanceButton.setPreferredSize(new Dimension(300, 300));
		advancePanel.add(advanceButton);

		advanceButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (GameScreen.questScreen.textFinished == true) {

					if (GameScreen.questSequence == GameScreen.currentQuest.incidentList.size()) {
						GameScreen.questSequence = 0;
						GameScreen.questScreen.setVisible(false);
						
						for (int i = 0; i < GameScreen.questers.size(); i++) {

							GameScreen.questers.get(i).levelUp();
							GameScreen.questers.get(i).value = GameScreen.questers.get(i).calculateValue();

						}
						
						GameScreen.teamOverviewScreen.setVisible(true);

					}

					else
						GameScreen.currentQuest.incidentList.get(GameScreen.questSequence).outcome();

				}

				else
					GameScreen.questScreen.textLabel.timer.setDelay(1);

			}
		}); 

		textPanel = new JPanel();
		textPanel.setPreferredSize(new Dimension(1400, 250));
		textPanel.setBackground(GameScreen.mediumColor);
		textPanel.setBorder(new LineBorder(GameScreen.borderColor, 3, false));
		add(textPanel);

		textLabel = new TextRollerLabel();
		textPanel.add(textLabel);

	}
		

	public void initiate() {

		GameScreen.questers.clear();

		for (int i = 0; i < TeamRoster.teamRosterList.size(); i++) {
			if (TeamRoster.teamRosterList.get(i).role == Role.quest)
				GameScreen.questers.add(TeamRoster.teamRosterList.get(i));
		}
		GameScreen.questScreen.setVisible(true);
		GameScreen.questScreen.titleLabel.setText(GameScreen.currentQuest.title);

		GameScreen.currentQuest.incidentList.get(GameScreen.questSequence).outcome();

	}

	public static void fillQuestersPanel() {

		if (GameScreen.questers.size() > 0) {

			questersPanel.quester1NameLabel.setText(GameScreen.questers.get(0).name);
			questersPanel.quester1ComLabel.setText(Integer.toString(GameScreen.questers.get(0).questCombat));
			questersPanel.quester1SklLabel.setText(Integer.toString(GameScreen.questers.get(0).questSkill));
			questersPanel.quester1IntLabel.setText(Integer.toString(GameScreen.questers.get(0).questIntelligence));
			questersPanel.quester1PerLabel.setText(Integer.toString(GameScreen.questers.get(0).questPersonality));
			questersPanel.quester1ConditionLabel.setText(GameScreen.questers.get(0).status.toString());

		}

		if (GameScreen.questers.size() > 1) {

			questersPanel.quester2NameLabel.setText(GameScreen.questers.get(1).name);
			questersPanel.quester2ComLabel.setText(Integer.toString(GameScreen.questers.get(1).questCombat));
			questersPanel.quester2SklLabel.setText(Integer.toString(GameScreen.questers.get(1).questSkill));
			questersPanel.quester2IntLabel.setText(Integer.toString(GameScreen.questers.get(1).questIntelligence));
			questersPanel.quester2PerLabel.setText(Integer.toString(GameScreen.questers.get(1).questPersonality));
			questersPanel.quester2ConditionLabel.setText(GameScreen.questers.get(1).status.toString());

		}

		if (GameScreen.questers.size() > 2) {

			questersPanel.quester3NameLabel.setText(GameScreen.questers.get(2).name);
			questersPanel.quester3ComLabel.setText(Integer.toString(GameScreen.questers.get(2).questCombat));
			questersPanel.quester3SklLabel.setText(Integer.toString(GameScreen.questers.get(2).questSkill));
			questersPanel.quester3IntLabel.setText(Integer.toString(GameScreen.questers.get(2).questIntelligence));
			questersPanel.quester3PerLabel.setText(Integer.toString(GameScreen.questers.get(2).questPersonality));
			questersPanel.quester3ConditionLabel.setText(GameScreen.questers.get(2).status.toString());

		}

		if (GameScreen.questers.size() > 3) {

			questersPanel.quester4NameLabel.setText(GameScreen.questers.get(3).name);
			questersPanel.quester4ComLabel.setText(Integer.toString(GameScreen.questers.get(3).questCombat));
			questersPanel.quester4SklLabel.setText(Integer.toString(GameScreen.questers.get(3).questSkill));
			questersPanel.quester4IntLabel.setText(Integer.toString(GameScreen.questers.get(3).questIntelligence));
			questersPanel.quester4PerLabel.setText(Integer.toString(GameScreen.questers.get(3).questPersonality));
			questersPanel.quester4ConditionLabel.setText(GameScreen.questers.get(3).status.toString());

		}

		if (GameScreen.questers.size() > 4) {

			questersPanel.quester5NameLabel.setText(GameScreen.questers.get(4).name);
			questersPanel.quester5ComLabel.setText(Integer.toString(GameScreen.questers.get(4).questCombat));
			questersPanel.quester5SklLabel.setText(Integer.toString(GameScreen.questers.get(4).questSkill));
			questersPanel.quester5IntLabel.setText(Integer.toString(GameScreen.questers.get(4).questIntelligence));
			questersPanel.quester5PerLabel.setText(Integer.toString(GameScreen.questers.get(4).questPersonality));
			questersPanel.quester5ConditionLabel.setText(GameScreen.questers.get(4).status.toString());

		}

		if (GameScreen.questers.size() > 5) {

			questersPanel.quester6NameLabel.setText(GameScreen.questers.get(5).name);
			questersPanel.quester6ComLabel.setText(Integer.toString(GameScreen.questers.get(5).questCombat));
			questersPanel.quester6SklLabel.setText(Integer.toString(GameScreen.questers.get(5).questSkill));
			questersPanel.quester6IntLabel.setText(Integer.toString(GameScreen.questers.get(5).questIntelligence));
			questersPanel.quester6PerLabel.setText(Integer.toString(GameScreen.questers.get(5).questPersonality));
			questersPanel.quester6ConditionLabel.setText(GameScreen.questers.get(5).status.toString());

		}

	}

}
