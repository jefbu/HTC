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

import Graphics.GameScreen;
import Graphics.ImageLoader;

public class TeamHRScreen extends TeamScreen {

	private static final long serialVersionUID = 1L;

	JPanel requirementsPanel;
	JButton notHiringButton;
	JButton hiringButton;
	JPanel specialisationRequirementsPanel;
	JPanel experienceRequirementsPanel;
		JButton juniorButton;
		JButton mediorButton;
		JButton seniorButton;
		JButton leaderButton;
	JPanel traitsRequirementsPanel;
	
		JButton lazyButton;
		JButton illiterateButton;
		
	JPanel hiringStrategyPanel;
	
		JButton autoButton;
		JButton manualButton;
		JButton phoneButton;
		JButton interviewButton;
		JButton aggressiveButton;
		
		JButton jobAdButton;
		JButton bigAdButton;
		JButton jobMarketButton;
			
		JButton trialistsButton;

	JPanel costPanel;

	JPanel applicantsPanel;
	
	ImageLoader imageLoader = new ImageLoader();

	public TeamHRScreen() {

		super();
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

		JLabel nameLabel = new JLabel();
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

		JLabel maturityNumberLabel = new JLabel();
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

		JLabel personalityNumberLabel = new JLabel();
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

		JPanel traitsNumberPanel = new JPanel();
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

		requirementsPanel.add(notHiringButton);

		hiringButton = new JButton("We are currently looking to fill the following position");
		hiringButton.setBackground(GameScreen.mediumColor);
		hiringButton.setPreferredSize(new Dimension(400, 30));

		requirementsPanel.add(hiringButton);

		specialisationRequirementsPanel = new JPanel();
		specialisationRequirementsPanel.setPreferredSize(new Dimension(900, 50));
		specialisationRequirementsPanel.setBackground(GameScreen.tableRow2);
		specialisationRequirementsPanel.setBorder(new LineBorder(GameScreen.borderColor, 1, true));
		specialisationRequirementsPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
			JButton combatButton = new JButton("COMBAT");
			combatButton.setPreferredSize(new Dimension (180, 40));
			combatButton.setBackground(GameScreen.lessImportantColor);
			
			specialisationRequirementsPanel.add(combatButton);
			
			JButton skillButton = new JButton("SKILL");
			skillButton.setPreferredSize(new Dimension (180, 40));
			skillButton.setBackground(GameScreen.mediumColor);
			
			specialisationRequirementsPanel.add(skillButton);
			
			JButton intelligenceButton = new JButton("INTELLIGENCE");
			intelligenceButton.setPreferredSize(new Dimension (180, 40));
			intelligenceButton.setBackground(GameScreen.mediumColor);
			
			specialisationRequirementsPanel.add(intelligenceButton);
			
			JButton personalityButton = new JButton("PERSONALITY");
			personalityButton.setPreferredSize(new Dimension (180, 40));
			personalityButton.setBackground(GameScreen.mediumColor);
			
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
			
			experienceRequirementsPanel.add(juniorButton);
			
			mediorButton = new JButton("MEDIOR");
			mediorButton.setPreferredSize(new Dimension(180, 40));
			mediorButton.setBackground(GameScreen.mediumColor);
			
			experienceRequirementsPanel.add(mediorButton);
			
			seniorButton = new JButton("SENIOR");
			seniorButton.setPreferredSize(new Dimension(180, 40));
			seniorButton.setBackground(GameScreen.mediumColor);
			
			experienceRequirementsPanel.add(seniorButton);
			
			leaderButton = new JButton("ROLE MODEL");
			leaderButton.setPreferredSize(new Dimension(180, 40));
			leaderButton.setBackground(GameScreen.mediumColor);
			
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
			testButton2.setPreferredSize(new Dimension (890, 16));
			traitsRequirementsPanel.add(testButton2);
			
			JButton lazyButton = new JButton();
			lazyButton.setPreferredSize(new Dimension (16, 16));
			lazyButton.setIcon(imageLoader.loadImageIcon("/Images/Icons/hero_lazy.png"));
			traitsRequirementsPanel.add(lazyButton);
			
				lazyButton.addActionListener(new ActionListener() {
					
					public void actionPerformed (ActionEvent e) {
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
			
			hiringStrategyPanel.add(autoButton);
			
			manualButton = new JButton("Filter CVs manually");
			manualButton.setPreferredSize(new Dimension(170, 40));
			manualButton.setBackground(GameScreen.mediumColor);
			
			hiringStrategyPanel.add(manualButton);
			
			phoneButton = new JButton("Initial phone interview");
			phoneButton.setPreferredSize(new Dimension(170, 40));
			phoneButton.setBackground(GameScreen.mediumColor);
			
			hiringStrategyPanel.add(phoneButton);
			
			interviewButton = new JButton("HR live interview");
			interviewButton.setPreferredSize(new Dimension(170, 40));
			interviewButton.setBackground(GameScreen.mediumColor);
			
			hiringStrategyPanel.add(interviewButton);
			
			aggressiveButton = new JButton("Target profiles directly");
			aggressiveButton.setPreferredSize(new Dimension(170, 40));
			aggressiveButton.setBackground(GameScreen.mediumColor);

			hiringStrategyPanel.add(aggressiveButton);
			
			JPanel emptySpacePanel = new JPanel();
			emptySpacePanel.setPreferredSize(new Dimension(850, 10));
			emptySpacePanel.setBackground(GameScreen.tableRow2);
			hiringStrategyPanel.add(emptySpacePanel);
			
			jobAdButton = new JButton("Newspaper Ad");
			jobAdButton.setPreferredSize(new Dimension(130, 40));
			jobAdButton.setBackground(GameScreen.mediumColor);

			hiringStrategyPanel.add(jobAdButton);
			
			bigAdButton = new JButton("Billboard Ads");
			bigAdButton.setPreferredSize(new Dimension(130, 40));
			bigAdButton.setBackground(GameScreen.mediumColor);
			
			hiringStrategyPanel.add(bigAdButton);
			
			jobMarketButton = new JButton("Host Job Fair");
			jobMarketButton.setPreferredSize(new Dimension(130, 40));
			jobMarketButton.setBackground(GameScreen.mediumColor);
			
			hiringStrategyPanel.add(jobMarketButton);
			
			JPanel emptySpacePanel2 = new JPanel();
			emptySpacePanel2.setPreferredSize(new Dimension (20, 40));
			emptySpacePanel2.setBackground(GameScreen.tableRow2);
			hiringStrategyPanel.add(emptySpacePanel2);
			
			trialistsButton = new JButton("hold Trials for junior profiles");
			trialistsButton.setPreferredSize(new Dimension(200, 40));
			trialistsButton.setBackground(GameScreen.mediumColor);
			
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

		JLabel costLabel = new JLabel("CHING");
		costShowPanel.add(costLabel);

		centrePanel.add(costPanel);

		applicantsPanel = new JPanel();
		applicantsPanel.setPreferredSize(new Dimension(1000, 300));
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

		applicantsPanel.add(firstApplicantPanel);
		
		JPanel secondApplicantPanel = new JPanel();
		secondApplicantPanel.setPreferredSize(new Dimension(900, 45));
		secondApplicantPanel.setBackground(GameScreen.tableRow2);
		secondApplicantPanel.setBorder(new LineBorder(GameScreen.borderColor, 1, true));

		applicantsPanel.add(secondApplicantPanel);
		
		JPanel thirdApplicantPanel = new JPanel();
		thirdApplicantPanel.setPreferredSize(new Dimension(900, 45));
		thirdApplicantPanel.setBackground(GameScreen.tableRow2);
		thirdApplicantPanel.setBorder(new LineBorder(GameScreen.borderColor, 1, true));

		applicantsPanel.add(thirdApplicantPanel);
		
		JPanel fourthApplicantPanel = new JPanel();
		fourthApplicantPanel.setPreferredSize(new Dimension(900, 45));
		fourthApplicantPanel.setBackground(GameScreen.tableRow2);
		fourthApplicantPanel.setBorder(new LineBorder(GameScreen.borderColor, 1, true));

		applicantsPanel.add(fourthApplicantPanel);
		
		JPanel fifthApplicantPanel = new JPanel();
		fifthApplicantPanel.setPreferredSize(new Dimension(900, 45));
		fifthApplicantPanel.setBackground(GameScreen.tableRow2);
		fifthApplicantPanel.setBorder(new LineBorder(GameScreen.borderColor, 1, true));

		applicantsPanel.add(fifthApplicantPanel);
		
		
		centrePanel.add(applicantsPanel);

	}

	public void fillHRScreen() {

	}

}
