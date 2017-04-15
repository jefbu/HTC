package Graphics.Screens;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import Entity.Hero;
import Entity.Role;
import Graphics.GameScreen;
import Graphics.ImageLoader;
import Utility.HeroFactory;
import Utility.TeamRoster;

public class TeamHRScreen extends TeamScreen {

	private static final long serialVersionUID = 1L;

	Hero hrOfficer;
	int hrMaturity;
	int hrPersonality;

	JLabel nameLabel;
	JLabel maturityNumberLabel;
	JLabel personalityNumberLabel;
	JPanel traitsNumberPanel;

	JPanel requirementsPanel;
	JButton notHiringButton;
	JButton hiringButton;
	int hiring;
	JPanel specialisationRequirementsPanel;
	JButton combatButton;
	JButton skillButton;
	JButton intelligenceButton;
	JButton personalityButton;
	int specialisation;
	JPanel experienceRequirementsPanel;
	JButton juniorButton;
	JButton mediorButton;
	JButton seniorButton;
	JButton leaderButton;
	int seniority;
	JPanel traitsRequirementsPanel;

	JButton lazyButton;
	JButton illiterateButton;

	JPanel hiringStrategyPanel;

	JButton autoButton;
	JButton manualButton;
	JButton phoneButton;
	JButton interviewButton;
	JButton aggressiveButton;
	int strategy;

	JButton jobAdButton;
	JButton bigAdButton;
	JButton jobMarketButton;
	int ads;

	JButton trialistsButton;
	int trial;

	JPanel costPanel;
	JLabel costLabel;
	int cost;

	JPanel applicantsPanel;
	
	JLabel firstApplicantNameLabel;
	JLabel secondApplicantNameLabel;
	JLabel thirdApplicantNameLabel;
	JLabel fourthApplicantNameLabel;
	JLabel fifthApplicantNameLabel;
	
	JLabel firstApplicantJobLabel;
	JLabel secondApplicantJobLabel;
	JLabel thirdApplicantJobLabel;
	JLabel fourthApplicantJobLabel;
	JLabel fifthApplicantJobLabel;
	
	JLabel firstApplicantValueLabel;
	JLabel secondApplicantValueLabel;
	JLabel thirdApplicantValueLabel;
	JLabel fourthApplicantValueLabel;
	JLabel fifthApplicantValueLabel;
	
	JButton firstApplicantContractButton;
	JButton secondApplicantContractButton;
	JButton thirdApplicantContractButton;
	JButton fourthApplicantContractButton;
	JButton fifthApplicantContractButton;

	ImageLoader imageLoader = new ImageLoader();

	ArrayList<Hero> applicants = new ArrayList<Hero>();

	public TeamHRScreen() {

		super();

		hiring = 0;
		specialisation = 0;
		seniority = 0;
		strategy = 0;
		ads = 0;
		trial = 0;
		hrMaturity = 0;
		hrPersonality = 0;

		centrePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

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

		JLabel textLabel = new JLabel(" Your Current HR-rep is");
		upperStringPanel.add(textLabel);

		upperPanel.add(upperStringPanel);

		JPanel upperHRPanel = new JPanel();
		upperHRPanel.setPreferredSize(new Dimension(350, 35));
		upperHRPanel.setBackground(GameScreen.backgroundColor);
		upperHRPanel.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		upperHRPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 7));

		nameLabel = new JLabel();
		upperHRPanel.add(nameLabel);

		upperPanel.add(upperHRPanel);

		JPanel maturityPanel = new JPanel();
		maturityPanel.setPreferredSize(new Dimension(50, 35));
		maturityPanel.setBackground(GameScreen.smallPanel);
		maturityPanel.setBorder(new LineBorder(GameScreen.importantColor, 2, true));
		maturityPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 7));

		JLabel maturityLabel = new JLabel("MAT");
		maturityPanel.add(maturityLabel);

		upperPanel.add(maturityPanel);

		JPanel maturityNumberPanel = new JPanel();
		maturityNumberPanel.setPreferredSize(new Dimension(50, 35));
		maturityNumberPanel.setBackground(GameScreen.smallPanel);
		maturityNumberPanel.setBorder(new LineBorder(GameScreen.importantColor, 2, true));
		maturityNumberPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 7));

		maturityNumberLabel = new JLabel();
		maturityNumberPanel.add(maturityNumberLabel);

		upperPanel.add(maturityNumberPanel);

		JPanel personalityPanel = new JPanel();
		personalityPanel.setPreferredSize(new Dimension(50, 35));
		personalityPanel.setBackground(GameScreen.smallPanel);
		personalityPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 2, true));
		personalityPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 7));

		JLabel personalityLabel = new JLabel("PER");
		personalityPanel.add(personalityLabel);

		upperPanel.add(personalityPanel);

		JPanel personalityNumberPanel = new JPanel();
		personalityNumberPanel.setPreferredSize(new Dimension(50, 35));
		personalityNumberPanel.setBackground(GameScreen.smallPanel);
		personalityNumberPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 2, true));
		personalityNumberPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 7));

		personalityNumberLabel = new JLabel();
		personalityNumberPanel.add(personalityNumberLabel);

		upperPanel.add(personalityNumberPanel);

		JPanel traitsPanel = new JPanel();
		traitsPanel.setPreferredSize(new Dimension(50, 35));
		traitsPanel.setBackground(GameScreen.smallPanel);
		traitsPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 2, true));
		traitsPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 7));

		JLabel traitsLabel = new JLabel("Traits");
		traitsPanel.add(traitsLabel);

		upperPanel.add(traitsPanel);

		traitsNumberPanel = new JPanel();
		traitsNumberPanel.setPreferredSize(new Dimension(200, 35));
		traitsNumberPanel.setBackground(GameScreen.smallPanel);
		traitsNumberPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 2, true));
		traitsNumberPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 7));

		upperPanel.add(traitsNumberPanel);

		centrePanel.add(upperPanel);

		requirementsPanel = new JPanel();
		requirementsPanel.setPreferredSize(new Dimension(1000, 330));
		requirementsPanel.setBorder(new LineBorder(GameScreen.borderColor, 2, true));
		requirementsPanel.setBackground(GameScreen.smallPanel);
		requirementsPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		centrePanel.add(requirementsPanel);

		notHiringButton = new JButton("We are not currently hiring, thank you.");
		notHiringButton.setBackground(GameScreen.unselectedColor);
		notHiringButton.setPreferredSize(new Dimension(400, 30));

		notHiringButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				notHiringButton.setBackground(GameScreen.unselectedColor);
				hiringButton.setBackground(GameScreen.mediumColor);
				hiring = 0;
				greyAllButtons();
				costLabel.setText("0");
			}
		});

		requirementsPanel.add(notHiringButton);

		hiringButton = new JButton("We are currently looking to fill the following position");
		hiringButton.setBackground(GameScreen.mediumColor);
		hiringButton.setPreferredSize(new Dimension(400, 30));

		hiringButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hiringButton.setBackground(GameScreen.lessImportantColor);
				notHiringButton.setBackground(GameScreen.mediumColor);
				hiring = 1;
				recolourAllButtons();
				calculateCost();
			}
		});

		requirementsPanel.add(hiringButton);

		specialisationRequirementsPanel = new JPanel();
		specialisationRequirementsPanel.setPreferredSize(new Dimension(900, 50));
		specialisationRequirementsPanel.setBackground(GameScreen.tableRow2);
		specialisationRequirementsPanel.setBorder(new LineBorder(GameScreen.borderColor, 1, true));
		specialisationRequirementsPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		combatButton = new JButton("COMBAT");
		combatButton.setPreferredSize(new Dimension(180, 40));
		combatButton.setBackground(GameScreen.mediumColor);

		combatButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (hiring == 1) {
					combatButton.setBackground(GameScreen.lessImportantColor);
					skillButton.setBackground(GameScreen.mediumColor);
					intelligenceButton.setBackground(GameScreen.mediumColor);
					personalityButton.setBackground(GameScreen.mediumColor);
					specialisation = 1;
					calculateCost();
				}
			}
		});

		specialisationRequirementsPanel.add(combatButton);

		skillButton = new JButton("SKILL");
		skillButton.setPreferredSize(new Dimension(180, 40));
		skillButton.setBackground(GameScreen.mediumColor);

		skillButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (hiring == 1) {
					skillButton.setBackground(GameScreen.lessImportantColor);
					combatButton.setBackground(GameScreen.mediumColor);
					intelligenceButton.setBackground(GameScreen.mediumColor);
					personalityButton.setBackground(GameScreen.mediumColor);
					specialisation = 2;
					calculateCost();
				}
			}
		});

		specialisationRequirementsPanel.add(skillButton);

		intelligenceButton = new JButton("INTELLIGENCE");
		intelligenceButton.setPreferredSize(new Dimension(180, 40));
		intelligenceButton.setBackground(GameScreen.mediumColor);

		intelligenceButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (hiring == 1) {
					intelligenceButton.setBackground(GameScreen.lessImportantColor);
					skillButton.setBackground(GameScreen.mediumColor);
					combatButton.setBackground(GameScreen.mediumColor);
					personalityButton.setBackground(GameScreen.mediumColor);
					specialisation = 3;
					calculateCost();
				}
			}
		});

		specialisationRequirementsPanel.add(intelligenceButton);

		personalityButton = new JButton("PERSONALITY");
		personalityButton.setPreferredSize(new Dimension(180, 40));
		personalityButton.setBackground(GameScreen.mediumColor);

		personalityButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (hiring == 1) {
					personalityButton.setBackground(GameScreen.lessImportantColor);
					skillButton.setBackground(GameScreen.mediumColor);
					intelligenceButton.setBackground(GameScreen.mediumColor);
					combatButton.setBackground(GameScreen.mediumColor);
					specialisation = 4;
					calculateCost();
				}
			}
		});

		specialisationRequirementsPanel.add(personalityButton);

		JLabel specialisationExplanationLabel = new JLabel("Specialisation");
		specialisationRequirementsPanel.add(specialisationExplanationLabel);

		requirementsPanel.add(specialisationRequirementsPanel);

		experienceRequirementsPanel = new JPanel();
		experienceRequirementsPanel.setPreferredSize(new Dimension(900, 50));
		experienceRequirementsPanel.setBackground(GameScreen.tableRow2);
		experienceRequirementsPanel.setBorder(new LineBorder(GameScreen.borderColor, 1, true));
		experienceRequirementsPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		juniorButton = new JButton("JUNIOR");
		juniorButton.setPreferredSize(new Dimension(180, 40));
		juniorButton.setBackground(GameScreen.mediumColor);

		juniorButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (hiring == 1) {
					juniorButton.setBackground(GameScreen.lessImportantColor);
					mediorButton.setBackground(GameScreen.mediumColor);
					seniorButton.setBackground(GameScreen.mediumColor);
					leaderButton.setBackground(GameScreen.mediumColor);
					seniority = 1;
					if (trial == 1)
						trialistsButton.setBackground(GameScreen.lessImportantColor);
					calculateCost();
				}
			}
		});

		experienceRequirementsPanel.add(juniorButton);

		mediorButton = new JButton("MEDIOR");
		mediorButton.setPreferredSize(new Dimension(180, 40));
		mediorButton.setBackground(GameScreen.mediumColor);

		mediorButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (hiring == 1) {
					mediorButton.setBackground(GameScreen.lessImportantColor);
					juniorButton.setBackground(GameScreen.mediumColor);
					seniorButton.setBackground(GameScreen.mediumColor);
					leaderButton.setBackground(GameScreen.mediumColor);
					seniority = 2;
					trialistsButton.setBackground(GameScreen.mediumColor);
					calculateCost();
				}
			}
		});

		experienceRequirementsPanel.add(mediorButton);

		seniorButton = new JButton("SENIOR");
		seniorButton.setPreferredSize(new Dimension(180, 40));
		seniorButton.setBackground(GameScreen.mediumColor);

		seniorButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (hiring == 1) {
					seniorButton.setBackground(GameScreen.lessImportantColor);
					mediorButton.setBackground(GameScreen.mediumColor);
					juniorButton.setBackground(GameScreen.mediumColor);
					leaderButton.setBackground(GameScreen.mediumColor);
					seniority = 3;
					trialistsButton.setBackground(GameScreen.mediumColor);
					calculateCost();
				}
			}
		});

		experienceRequirementsPanel.add(seniorButton);

		leaderButton = new JButton("ROLE MODEL");
		leaderButton.setPreferredSize(new Dimension(180, 40));
		leaderButton.setBackground(GameScreen.mediumColor);

		leaderButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (hiring == 1) {
					leaderButton.setBackground(GameScreen.lessImportantColor);
					mediorButton.setBackground(GameScreen.mediumColor);
					seniorButton.setBackground(GameScreen.mediumColor);
					juniorButton.setBackground(GameScreen.mediumColor);
					seniority = 4;
					trialistsButton.setBackground(GameScreen.mediumColor);
					calculateCost();
				}
			}
		});

		experienceRequirementsPanel.add(leaderButton);

		JLabel experienceLabel = new JLabel("  Experience  ");
		experienceRequirementsPanel.add(experienceLabel);

		requirementsPanel.add(experienceRequirementsPanel);

		traitsRequirementsPanel = new JPanel();
		traitsRequirementsPanel.setPreferredSize(new Dimension(900, 50));
		traitsRequirementsPanel.setBackground(GameScreen.tableRow2);
		traitsRequirementsPanel.setBorder(new LineBorder(GameScreen.borderColor, 1, true));
		traitsRequirementsPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JButton testButton2 = new JButton();
		testButton2.setPreferredSize(new Dimension(890, 16));
		traitsRequirementsPanel.add(testButton2);

		JButton lazyButton = new JButton();
		lazyButton.setPreferredSize(new Dimension(16, 16));
		lazyButton.setIcon(imageLoader.loadImageIcon("/Images/Icons/hero_lazy.png"));
		traitsRequirementsPanel.add(lazyButton);

		lazyButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				lazyButton.setBorder(new LineBorder(GameScreen.importantColor, 2, false));
			}

		});

		requirementsPanel.add(traitsRequirementsPanel);

		hiringStrategyPanel = new JPanel();
		hiringStrategyPanel.setPreferredSize(new Dimension(900, 110));
		hiringStrategyPanel.setBackground(GameScreen.tableRow2);
		hiringStrategyPanel.setBorder(new LineBorder(GameScreen.borderColor, 1, true));
		hiringStrategyPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		autoButton = new JButton("Filter CVs automatically");
		autoButton.setPreferredSize(new Dimension(170, 40));
		autoButton.setBackground(GameScreen.mediumColor);

		autoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (hiring == 1) {
					autoButton.setBackground(GameScreen.lessImportantColor);
					manualButton.setBackground(GameScreen.mediumColor);
					phoneButton.setBackground(GameScreen.mediumColor);
					interviewButton.setBackground(GameScreen.mediumColor);
					aggressiveButton.setBackground(GameScreen.mediumColor);
					strategy = 1;
					calculateCost();
				}
			}
		});

		hiringStrategyPanel.add(autoButton);

		manualButton = new JButton("Filter CVs manually");
		manualButton.setPreferredSize(new Dimension(170, 40));
		manualButton.setBackground(GameScreen.mediumColor);

		manualButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (hiring == 1) {
					manualButton.setBackground(GameScreen.lessImportantColor);
					autoButton.setBackground(GameScreen.mediumColor);
					phoneButton.setBackground(GameScreen.mediumColor);
					interviewButton.setBackground(GameScreen.mediumColor);
					aggressiveButton.setBackground(GameScreen.mediumColor);
					strategy = 2;
					calculateCost();
				}
			}
		});

		hiringStrategyPanel.add(manualButton);

		phoneButton = new JButton("Initial phone interview");
		phoneButton.setPreferredSize(new Dimension(170, 40));
		phoneButton.setBackground(GameScreen.mediumColor);

		phoneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (hiring == 1) {
					phoneButton.setBackground(GameScreen.lessImportantColor);
					manualButton.setBackground(GameScreen.mediumColor);
					autoButton.setBackground(GameScreen.mediumColor);
					interviewButton.setBackground(GameScreen.mediumColor);
					aggressiveButton.setBackground(GameScreen.mediumColor);
					strategy = 3;
					calculateCost();
				}
			}
		});

		hiringStrategyPanel.add(phoneButton);

		interviewButton = new JButton("HR live interview");
		interviewButton.setPreferredSize(new Dimension(170, 40));
		interviewButton.setBackground(GameScreen.mediumColor);

		interviewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (hiring == 1) {
					interviewButton.setBackground(GameScreen.lessImportantColor);
					manualButton.setBackground(GameScreen.mediumColor);
					phoneButton.setBackground(GameScreen.mediumColor);
					autoButton.setBackground(GameScreen.mediumColor);
					aggressiveButton.setBackground(GameScreen.mediumColor);
					strategy = 4;
					calculateCost();
				}
			}
		});

		hiringStrategyPanel.add(interviewButton);

		aggressiveButton = new JButton("Target profiles directly");
		aggressiveButton.setPreferredSize(new Dimension(170, 40));
		aggressiveButton.setBackground(GameScreen.mediumColor);

		aggressiveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (hiring == 1) {
					aggressiveButton.setBackground(GameScreen.lessImportantColor);
					manualButton.setBackground(GameScreen.mediumColor);
					phoneButton.setBackground(GameScreen.mediumColor);
					interviewButton.setBackground(GameScreen.mediumColor);
					autoButton.setBackground(GameScreen.mediumColor);
					strategy = 5;
					calculateCost();
				}
			}
		});

		hiringStrategyPanel.add(aggressiveButton);

		JPanel emptySpacePanel = new JPanel();
		emptySpacePanel.setPreferredSize(new Dimension(850, 10));
		emptySpacePanel.setBackground(GameScreen.tableRow2);
		hiringStrategyPanel.add(emptySpacePanel);

		jobAdButton = new JButton("Newspaper Ad");
		jobAdButton.setPreferredSize(new Dimension(130, 40));
		jobAdButton.setBackground(GameScreen.mediumColor);

		jobAdButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (hiring == 1) {
					jobAdButton.setBackground(GameScreen.lessImportantColor);
					bigAdButton.setBackground(GameScreen.mediumColor);
					jobMarketButton.setBackground(GameScreen.mediumColor);
					ads = 1;
					calculateCost();
				}
			}
		});

		hiringStrategyPanel.add(jobAdButton);

		bigAdButton = new JButton("Billboard Ads");
		bigAdButton.setPreferredSize(new Dimension(130, 40));
		bigAdButton.setBackground(GameScreen.mediumColor);

		bigAdButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (hiring == 1) {
					bigAdButton.setBackground(GameScreen.lessImportantColor);
					jobAdButton.setBackground(GameScreen.mediumColor);
					jobMarketButton.setBackground(GameScreen.mediumColor);
					ads = 2;
					calculateCost();
				}
			}
		});

		hiringStrategyPanel.add(bigAdButton);

		jobMarketButton = new JButton("Host Job Fair");
		jobMarketButton.setPreferredSize(new Dimension(130, 40));
		jobMarketButton.setBackground(GameScreen.mediumColor);

		jobMarketButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (hiring == 1) {
					jobMarketButton.setBackground(GameScreen.lessImportantColor);
					bigAdButton.setBackground(GameScreen.mediumColor);
					jobAdButton.setBackground(GameScreen.mediumColor);
					ads = 3;
					calculateCost();
				}
			}
		});

		hiringStrategyPanel.add(jobMarketButton);

		JPanel emptySpacePanel2 = new JPanel();
		emptySpacePanel2.setPreferredSize(new Dimension(20, 40));
		emptySpacePanel2.setBackground(GameScreen.tableRow2);
		hiringStrategyPanel.add(emptySpacePanel2);

		trialistsButton = new JButton("hold Trials for junior profiles");
		trialistsButton.setPreferredSize(new Dimension(200, 40));
		trialistsButton.setBackground(GameScreen.mediumColor);

		trialistsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (hiring == 1 && seniority == 1) {
					if (trial == 0) {
						trialistsButton.setBackground(GameScreen.lessImportantColor);
						trial = 1;
						calculateCost();
					} else if (trial == 1) {
						trialistsButton.setBackground(GameScreen.mediumColor);
						trial = 0;
						calculateCost();
					}
				}
			}
		});

		hiringStrategyPanel.add(trialistsButton);

		requirementsPanel.add(hiringStrategyPanel);

		costPanel = new JPanel();
		costPanel.setPreferredSize(new Dimension(1050, 40));
		costPanel.setBackground(GameScreen.tableRow1);
		costPanel.setBorder(new LineBorder(GameScreen.borderColor, 2, true));
		costPanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));

		JLabel costTextLabel = new JLabel("Current hiring policy will incur a weekly cost of        ");
		costPanel.add(costTextLabel);

		JPanel costShowPanel = new JPanel();
		costShowPanel.setPreferredSize(new Dimension(100, 25));
		costShowPanel.setBackground(GameScreen.backgroundColor);
		costPanel.add(costShowPanel);

		costLabel = new JLabel("0");
		costShowPanel.add(costLabel);

		centrePanel.add(costPanel);

		applicantsPanel = new JPanel();
		applicantsPanel.setPreferredSize(new Dimension(1000, 315));
		applicantsPanel.setBorder(new LineBorder(GameScreen.borderColor, 2, true));
		applicantsPanel.setBackground(GameScreen.smallPanel);
		applicantsPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 7));

		JLabel applicantsTitleLabel = new JLabel(
				"We have selected the following CVs for you to review. These applicants will receive a standard 'the position has already been filled' answer if you choose to ignore them");

		applicantsPanel.add(applicantsTitleLabel);

		JPanel firstApplicantPanel = new JPanel();
		firstApplicantPanel.setPreferredSize(new Dimension(900, 50));
		firstApplicantPanel.setBackground(GameScreen.tableRow2);
		firstApplicantPanel.setBorder(new LineBorder(GameScreen.borderColor, 1, true));
		firstApplicantPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
			JPanel firstApplicantNamePanel = new JPanel();
			firstApplicantNamePanel.setPreferredSize(new Dimension (200, 40));
			firstApplicantNamePanel.setBackground(GameScreen.smallPanel);
			firstApplicantNamePanel.setBorder(new LineBorder(GameScreen.borderColor, 1, false));
			firstApplicantPanel.add(firstApplicantNamePanel);
			
				firstApplicantNameLabel = new JLabel();
				firstApplicantNamePanel.add(firstApplicantNameLabel);
			
			JPanel firstApplicantJobPanel = new JPanel();
			firstApplicantJobPanel.setPreferredSize(new Dimension (200, 40));
			firstApplicantJobPanel.setBackground(GameScreen.smallPanel);
			firstApplicantJobPanel.setBorder(new LineBorder(GameScreen.borderColor, 1, false));
			firstApplicantPanel.add(firstApplicantJobPanel);	
				
				firstApplicantJobLabel = new JLabel();
				firstApplicantJobPanel.add(firstApplicantJobLabel);
			
			JPanel firstApplicantValuePanel = new JPanel();
			firstApplicantValuePanel.setPreferredSize(new Dimension (200, 40));
			firstApplicantValuePanel.setBackground(GameScreen.smallPanel);
			firstApplicantValuePanel.setBorder(new LineBorder(GameScreen.borderColor, 1, false));
			firstApplicantPanel.add(firstApplicantValuePanel);	
			
				firstApplicantValueLabel = new JLabel();
				firstApplicantValuePanel.add(firstApplicantValueLabel);
			
			firstApplicantContractButton  = new JButton();
			firstApplicantContractButton.setPreferredSize(new Dimension(270, 40));
			firstApplicantPanel.add(firstApplicantContractButton);

		applicantsPanel.add(firstApplicantPanel);

		JPanel secondApplicantPanel = new JPanel();
		secondApplicantPanel.setPreferredSize(new Dimension(900, 50));
		secondApplicantPanel.setBackground(GameScreen.tableRow2);
		secondApplicantPanel.setBorder(new LineBorder(GameScreen.borderColor, 1, true));
		secondApplicantPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
			JPanel secondApplicantNamePanel = new JPanel();
			secondApplicantNamePanel.setPreferredSize(new Dimension (200, 40));
			secondApplicantNamePanel.setBackground(GameScreen.smallPanel);
			secondApplicantNamePanel.setBorder(new LineBorder(GameScreen.borderColor, 1, false));
			secondApplicantPanel.add(secondApplicantNamePanel);
		
				secondApplicantNameLabel = new JLabel();
				secondApplicantNamePanel.add(secondApplicantNameLabel);
			
			JPanel secondApplicantJobPanel = new JPanel();
			secondApplicantJobPanel.setPreferredSize(new Dimension (200, 40));
			secondApplicantJobPanel.setBackground(GameScreen.smallPanel);
			secondApplicantJobPanel.setBorder(new LineBorder(GameScreen.borderColor, 1, false));
			secondApplicantPanel.add(secondApplicantJobPanel);	
				
				secondApplicantJobLabel = new JLabel();
				secondApplicantJobPanel.add(secondApplicantJobLabel);
				
			JPanel secondApplicantValuePanel = new JPanel();
			secondApplicantValuePanel.setPreferredSize(new Dimension (200, 40));
			secondApplicantValuePanel.setBackground(GameScreen.smallPanel);
			secondApplicantValuePanel.setBorder(new LineBorder(GameScreen.borderColor, 1, false));
			secondApplicantPanel.add(secondApplicantValuePanel);
			
				secondApplicantValueLabel = new JLabel();
				secondApplicantValuePanel.add(secondApplicantValueLabel);
			
			secondApplicantContractButton  = new JButton();
			secondApplicantContractButton.setPreferredSize(new Dimension(270, 40));
			secondApplicantPanel.add(secondApplicantContractButton);

		applicantsPanel.add(secondApplicantPanel);

		JPanel thirdApplicantPanel = new JPanel();
		thirdApplicantPanel.setPreferredSize(new Dimension(900, 50));
		thirdApplicantPanel.setBackground(GameScreen.tableRow2);
		thirdApplicantPanel.setBorder(new LineBorder(GameScreen.borderColor, 1, true));
		thirdApplicantPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
			JPanel thirdApplicantNamePanel = new JPanel();
			thirdApplicantNamePanel.setPreferredSize(new Dimension (200, 40));
			thirdApplicantNamePanel.setBackground(GameScreen.smallPanel);
			thirdApplicantNamePanel.setBorder(new LineBorder(GameScreen.borderColor, 1, false));
			thirdApplicantPanel.add(thirdApplicantNamePanel);
		
				thirdApplicantNameLabel = new JLabel();
				thirdApplicantNamePanel.add(thirdApplicantNameLabel);
			
			JPanel thirdApplicantJobPanel = new JPanel();
			thirdApplicantJobPanel.setPreferredSize(new Dimension (200, 40));
			thirdApplicantJobPanel.setBackground(GameScreen.smallPanel);
			thirdApplicantJobPanel.setBorder(new LineBorder(GameScreen.borderColor, 1, false));
			thirdApplicantPanel.add(thirdApplicantJobPanel);				
			
				thirdApplicantJobLabel = new JLabel();
				thirdApplicantJobPanel.add(thirdApplicantJobLabel);
				
			JPanel thirdApplicantValuePanel = new JPanel();
			thirdApplicantValuePanel.setPreferredSize(new Dimension (200, 40));
			thirdApplicantValuePanel.setBackground(GameScreen.smallPanel);
			thirdApplicantValuePanel.setBorder(new LineBorder(GameScreen.borderColor, 1, false));
			thirdApplicantPanel.add(thirdApplicantValuePanel);
				
				thirdApplicantValueLabel = new JLabel();
				thirdApplicantValuePanel.add(thirdApplicantValueLabel);
				
			thirdApplicantContractButton  = new JButton();
			thirdApplicantContractButton.setPreferredSize(new Dimension(270, 40));
			thirdApplicantPanel.add(thirdApplicantContractButton);

		applicantsPanel.add(thirdApplicantPanel);

		JPanel fourthApplicantPanel = new JPanel();
		fourthApplicantPanel.setPreferredSize(new Dimension(900, 50));
		fourthApplicantPanel.setBackground(GameScreen.tableRow2);
		fourthApplicantPanel.setBorder(new LineBorder(GameScreen.borderColor, 1, true));
		fourthApplicantPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
			JPanel fourthApplicantNamePanel = new JPanel();
			fourthApplicantNamePanel.setPreferredSize(new Dimension (200, 40));
			fourthApplicantNamePanel.setBackground(GameScreen.smallPanel);
			fourthApplicantNamePanel.setBorder(new LineBorder(GameScreen.borderColor, 1, false));
			fourthApplicantPanel.add(fourthApplicantNamePanel);
		
				fourthApplicantNameLabel = new JLabel();
				fourthApplicantNamePanel.add(fourthApplicantNameLabel);
				
			JPanel fourthApplicantJobPanel = new JPanel();
			fourthApplicantJobPanel.setPreferredSize(new Dimension (200, 40));
			fourthApplicantJobPanel.setBackground(GameScreen.smallPanel);
			fourthApplicantJobPanel.setBorder(new LineBorder(GameScreen.borderColor, 1, false));
			fourthApplicantPanel.add(fourthApplicantJobPanel);
			
				fourthApplicantJobLabel = new JLabel();
				fourthApplicantJobPanel.add(fourthApplicantJobLabel);
				
			JPanel fourthApplicantValuePanel = new JPanel();
			fourthApplicantValuePanel.setPreferredSize(new Dimension (200, 40));
			fourthApplicantValuePanel.setBackground(GameScreen.smallPanel);
			fourthApplicantValuePanel.setBorder(new LineBorder(GameScreen.borderColor, 1, false));
			fourthApplicantPanel.add(fourthApplicantValuePanel);
			
				fourthApplicantValueLabel = new JLabel();
				fourthApplicantValuePanel.add(fourthApplicantValueLabel);
				
			fourthApplicantContractButton  = new JButton();
			fourthApplicantContractButton.setPreferredSize(new Dimension(270, 40));
			fourthApplicantPanel.add(fourthApplicantContractButton);

		applicantsPanel.add(fourthApplicantPanel);

		JPanel fifthApplicantPanel = new JPanel();
		fifthApplicantPanel.setPreferredSize(new Dimension(900, 50));
		fifthApplicantPanel.setBackground(GameScreen.tableRow2);
		fifthApplicantPanel.setBorder(new LineBorder(GameScreen.borderColor, 1, true));
		fifthApplicantPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
			JPanel fifthApplicantNamePanel = new JPanel();
			fifthApplicantNamePanel.setPreferredSize(new Dimension (200, 40));
			fifthApplicantNamePanel.setBackground(GameScreen.smallPanel);
			fifthApplicantNamePanel.setBorder(new LineBorder(GameScreen.borderColor, 1, false));
			fifthApplicantPanel.add(fifthApplicantNamePanel);
			
				fifthApplicantNameLabel = new JLabel();
				fifthApplicantNamePanel.add(fifthApplicantNameLabel);
			
			JPanel fifthApplicantJobPanel = new JPanel();
			fifthApplicantJobPanel.setPreferredSize(new Dimension (200, 40));
			fifthApplicantJobPanel.setBackground(GameScreen.smallPanel);
			fifthApplicantJobPanel.setBorder(new LineBorder(GameScreen.borderColor, 1, false));
			fifthApplicantPanel.add(fifthApplicantJobPanel);
				
				fifthApplicantJobLabel = new JLabel();
				fifthApplicantJobPanel.add(fifthApplicantJobLabel);
			
			JPanel fifthApplicantValuePanel = new JPanel();
			fifthApplicantValuePanel.setPreferredSize(new Dimension (200, 40));
			fifthApplicantValuePanel.setBackground(GameScreen.smallPanel);
			fifthApplicantValuePanel.setBorder(new LineBorder(GameScreen.borderColor, 1, false));
			fifthApplicantPanel.add(fifthApplicantValuePanel);	
					
				fifthApplicantValueLabel = new JLabel();
				fifthApplicantValuePanel.add(fifthApplicantValueLabel);
			
			fifthApplicantContractButton  = new JButton();
			fifthApplicantContractButton.setPreferredSize(new Dimension(270, 40));
			fifthApplicantPanel.add(fifthApplicantContractButton);

		applicantsPanel.add(fifthApplicantPanel);

		centrePanel.add(applicantsPanel);

	}

	public void greyAllButtons() {
		combatButton.setBackground(GameScreen.mediumColor);
		skillButton.setBackground(GameScreen.mediumColor);
		intelligenceButton.setBackground(GameScreen.mediumColor);
		personalityButton.setBackground(GameScreen.mediumColor);
		juniorButton.setBackground(GameScreen.mediumColor);
		mediorButton.setBackground(GameScreen.mediumColor);
		seniorButton.setBackground(GameScreen.mediumColor);
		leaderButton.setBackground(GameScreen.mediumColor);
		autoButton.setBackground(GameScreen.mediumColor);
		manualButton.setBackground(GameScreen.mediumColor);
		phoneButton.setBackground(GameScreen.mediumColor);
		interviewButton.setBackground(GameScreen.mediumColor);
		aggressiveButton.setBackground(GameScreen.mediumColor);
		jobAdButton.setBackground(GameScreen.mediumColor);
		bigAdButton.setBackground(GameScreen.mediumColor);
		jobMarketButton.setBackground(GameScreen.mediumColor);
		trialistsButton.setBackground(GameScreen.mediumColor);
	}

	public void recolourAllButtons() {

		switch (specialisation) {
		case 1:
			combatButton.setBackground(GameScreen.lessImportantColor);
			break;
		case 2:
			skillButton.setBackground(GameScreen.lessImportantColor);
			break;
		case 3:
			intelligenceButton.setBackground(GameScreen.lessImportantColor);
			break;
		case 4:
			personalityButton.setBackground(GameScreen.lessImportantColor);
			break;
		}

		switch (seniority) {
		case 1:
			juniorButton.setBackground(GameScreen.lessImportantColor);
			break;
		case 2:
			mediorButton.setBackground(GameScreen.lessImportantColor);
			break;
		case 3:
			seniorButton.setBackground(GameScreen.lessImportantColor);
			break;
		case 4:
			leaderButton.setBackground(GameScreen.lessImportantColor);
			break;
		}

		switch (strategy) {
		case 1:
			autoButton.setBackground(GameScreen.lessImportantColor);
			break;
		case 2:
			manualButton.setBackground(GameScreen.lessImportantColor);
			break;
		case 3:
			phoneButton.setBackground(GameScreen.lessImportantColor);
			break;
		case 4:
			interviewButton.setBackground(GameScreen.lessImportantColor);
			break;
		case 5:
			aggressiveButton.setBackground(GameScreen.lessImportantColor);
			break;
		}

		switch (ads) {
		case 1:
			jobAdButton.setBackground(GameScreen.lessImportantColor);
			break;
		case 2:
			bigAdButton.setBackground(GameScreen.lessImportantColor);
			break;
		case 3:
			jobMarketButton.setBackground(GameScreen.lessImportantColor);
			break;
		}

		if (seniority == 1 && trial == 1)
			trialistsButton.setBackground(GameScreen.lessImportantColor);

	}

	public void calculateCost() {

		if (hiring == 1 && specialisation != 0 && seniority != 0 && strategy != 0 && ads != 0) {

			cost = 10000;

			switch (seniority) {
			case 2:
				cost = cost * 12 / 10;
				break;
			case 3:
				cost = cost * 15 / 10;
				break;
			case 4:
				cost = cost * 2;
				break;
			}

			switch (strategy) {
			case 2:
				cost = cost * 12 / 10;
				break;
			case 3:
				cost = cost * 15 / 10;
				break;
			case 4:
				cost = cost * 2;
				break;
			case 5:
				cost = cost * 3;
			}

			switch (ads) {
			case 2:
				cost = cost * 15 / 10;
				break;
			case 3:
				cost = cost * 3;
				break;
			}

			if (trial == 1 && seniority == 1)
				cost = cost * 3;

			costLabel.setText(Integer.toString(cost));

		}

	}

	public void fillHRScreen() {

		hrOfficer = null;

		for (Hero hero : TeamRoster.teamRosterList) {
			if (hero.role == Role.hrOfficer)
				hrOfficer = hero;
		}

		if (hrOfficer != null) {

			nameLabel.setText(hrOfficer.name);
			maturityNumberLabel.setText(Integer.toString(hrOfficer.maturity));
			personalityNumberLabel.setText(Integer.toString(hrOfficer.personality));
			hrMaturity = hrOfficer.maturity;
			hrPersonality = hrOfficer.personality;

		}
		
		else {
			maturityNumberLabel.setText(Integer.toString(0));
			personalityNumberLabel.setText(Integer.toString(0));
			hrMaturity = 0;
			hrPersonality = 0;
		}
	}

	public void searchApplicants() {
		
		applicants.clear();
		firstApplicantNameLabel.setText("");
		firstApplicantJobLabel.setText("");
		firstApplicantValueLabel.setText("");
		secondApplicantNameLabel.setText("");
		secondApplicantJobLabel.setText("");
		secondApplicantValueLabel.setText("");
		thirdApplicantNameLabel.setText("");
		thirdApplicantJobLabel.setText("");
		thirdApplicantValueLabel.setText("");
		fourthApplicantNameLabel.setText("");
		fourthApplicantJobLabel.setText("");
		fourthApplicantValueLabel.setText("");
		fifthApplicantNameLabel.setText("");
		fifthApplicantJobLabel.setText("");
		fifthApplicantValueLabel.setText("");

		int heroesFound = findOutAmountOfApplicants();

		if (heroesFound != 0) {
			
		for (int i = 0; i < heroesFound; i++) {

			applicants.add(HeroFactory.generateHRHero(hrMaturity, hrPersonality, specialisation,
					seniority, strategy, trial));

			}
		
		if (applicants.size() > 0) {
			firstApplicantNameLabel.setText(applicants.get(0).name);
			firstApplicantJobLabel.setText(applicants.get(0).job.name);
			firstApplicantValueLabel.setText(Integer.toString(applicants.get(0).value));
		}

		if (applicants.size() > 1) {
			secondApplicantNameLabel.setText(applicants.get(1).name);
			secondApplicantJobLabel.setText(applicants.get(1).job.name);
			secondApplicantValueLabel.setText(Integer.toString(applicants.get(1).value));
		}
		
		if (applicants.size() > 2) {
			thirdApplicantNameLabel.setText(applicants.get(2).name);
			thirdApplicantJobLabel.setText(applicants.get(2).job.name);
			thirdApplicantValueLabel.setText(Integer.toString(applicants.get(2).value));
		}
		
		if (applicants.size() > 3) {
			fourthApplicantNameLabel.setText(applicants.get(3).name);
			fourthApplicantJobLabel.setText(applicants.get(3).job.name);
			fourthApplicantValueLabel.setText(Integer.toString(applicants.get(3).value));
		}
		
		if (applicants.size() > 4) {
			fifthApplicantNameLabel.setText(applicants.get(4).name);
			fifthApplicantJobLabel.setText(applicants.get(4).job.name);
			fifthApplicantValueLabel.setText(Integer.toString(applicants.get(4).value));
		}
		
		}

	}

	public int findOutAmountOfApplicants() {

		Random random = new Random();
		int heroesFound = random.nextInt(500) + 1;

		switch (seniority) {
		case 1:
			heroesFound = heroesFound * 11 / 10;
			break;
		case 3:
			heroesFound = heroesFound * 8 / 10;
			break;
		case 4:
			heroesFound = heroesFound * 5 / 10;
			break;
		}

		switch (ads) {
		case 2:
			heroesFound = heroesFound * 15 / 10;
			break;
		case 3:
			heroesFound = heroesFound * 3;
			break;
		}

		switch (strategy) {
		case 1:
			heroesFound = heroesFound * 12 / 10;
			break;
		case 3:
			heroesFound = heroesFound * 8 / 10;
			break;
		case 4:
			heroesFound = heroesFound * 5 / 10;
			break;
		case 5:
			heroesFound = random.nextInt((3) + 1) * 100;
			break;
		}

		heroesFound = heroesFound + (hrMaturity / 30) - random.nextInt(3) ;
		heroesFound = heroesFound + (hrPersonality / 50) - random.nextInt(2) ;

		heroesFound = (heroesFound / 100);

		if (heroesFound > 5) {
			heroesFound = 5;
		}

		return heroesFound;

	}

}
