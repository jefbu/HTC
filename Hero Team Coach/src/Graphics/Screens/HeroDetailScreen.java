package Graphics.Screens;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

import Entity.Armour;
import Entity.Weapon;
import Graphics.GameScreen;
import Utility.ArmourInventory;
import Utility.WeaponInventory;

public class HeroDetailScreen extends TeamScreen {

	private static final long serialVersionUID = 1L;

	JPanel portraitPanel;
	JPanel equipmentPanel;
	JPanel weaponTitlePanel;
	JLabel weaponTitleLabel;
	JPanel combatTitlePanel;
	JLabel combatTitleLabel;
	JPanel skillTitlePanel;
	JLabel skillTitleLabel;
	JPanel intelligenceTitlePanel;
	JLabel intelligenceTitleLabel;
	JPanel personalityTitlePanel;
	JLabel personalityTitleLabel;
	JButton weaponIconButton;
	JPanel weaponNamePanel;
	JLabel weaponNameLabel;
	JPanel weaponCombatPanel;
	JLabel weaponCombatLabel;
	JPanel weaponSkillPanel;
	JLabel weaponSkillLabel;
	JPanel weaponIntelligencePanel;
	JLabel weaponIntelligenceLabel;
	JPanel weaponPersonalityPanel;
	JLabel weaponPersonalityLabel;
	JButton armourIconButton;
	JPanel armourTitlePanel;
	JLabel armourTitleLabel;
	JPanel combatTitlePanel2;
	JLabel combatTitleLabel2;
	JPanel skillTitlePanel2;
	JLabel skillTitleLabel2;
	JPanel intelligenceTitlePanel2;
	JLabel intelligenceTitleLabel2;
	JPanel personalityTitlePanel2;
	JLabel personalityTitleLabel2;
	JPanel armourNamePanel;
	JLabel armourNameLabel;
	JPanel armourCombatPanel;
	JLabel armourCombatLabel;
	JPanel armourSkillPanel;
	JLabel armourSkillLabel;
	JPanel armourIntelligencePanel;
	JLabel armourIntelligenceLabel;
	JPanel armourPersonalityPanel;
	JLabel armourPersonalityLabel;
	JPanel generalInfoPanel;
	JPanel namePanel;
	JLabel nameLabel;
	JPanel nameContentPanel;
	JLabel nameContentLabel;
	JPanel genderPanel;
	JLabel genderLabel;
	JPanel genderContentPanel;
	JLabel genderContentLabel;
	JPanel racePanel;
	JLabel raceLabel;
	JPanel raceContentPanel;
	JLabel raceContentLabel;
	JPanel jobPanel;
	JLabel jobLabel;
	JPanel jobContentPanel;
	JLabel jobContentLabel;
	JPanel statInfoPanel;
	JPanel maturityPanel;
	JLabel maturityLabel;
	JPanel maturityContentPanel;
	JLabel maturityContentLabel;
	JPanel combatPanel;
	JLabel combatLabel;
	JPanel combatContentPanel;
	JLabel combatContentLabel;
	JPanel skillPanel;
	JLabel skillLabel;
	JPanel skillContentPanel;
	JLabel skillContentLabel;
	JPanel intelligencePanel;
	JLabel intelligenceLabel;
	JPanel intelligenceContentPanel;
	JLabel intelligenceContentLabel;
	JPanel personalityPanel;
	JLabel personalityLabel;
	JPanel personalityContentPanel;
	JLabel personalityContentLabel;
	JPanel traitsInfoPanel;
	JPanel traitsOneNrPanel;
	JLabel traitsOneNrLabel;
	JPanel traitsOneIconPanel;
	JLabel traitsOneIconLabel;
	JPanel traitsOneDescriptionPanel;
	JLabel traitsOneDescriptionLabel;
	JPanel traitsTwoIconPanel;
	JLabel traitsTwoIconLabel;
	JPanel traitsTwoDescriptionPanel;
	JLabel traitsTwoDescriptionLabel;
	JPanel traitsTwoNrPanel;
	JLabel traitsTwoNrLabel;
	JPanel traitsThreeIconPanel;
	JLabel traitsThreeIconLabel;
	JPanel traitsThreeDescriptionPanel;
	JLabel traitsThreeDescriptionLabel;
	JPanel traitsThreeNrPanel;
	JLabel traitsThreeNrLabel;
	JPanel traitsFourIconPanel;
	JLabel traitsFourIconLabel;
	JPanel traitsFourDescriptionPanel;
	JLabel traitsFourDescriptionLabel;
	JPanel traitsFourNrPanel;
	JLabel traitsFourNrLabel;
	JPanel traitsFiveIconPanel;
	JLabel traitsFiveIconLabel;
	JPanel traitsFiveDescriptionPanel;
	JLabel traitsFiveDescriptionLabel;
	JPanel traitsFiveNrPanel;
	JLabel traitsFiveNrLabel;
	JPanel traitsSixIconPanel;
	JLabel traitsSixIconLabel;
	JPanel traitsSixDescriptionPanel;
	JLabel traitsSixDescriptionLabel;
	JPanel traitsSixNrPanel;
	JLabel traitsSixNrLabel;
	JPanel traitsSevenIconPanel;
	JLabel traitsSevenIconLabel;
	JPanel traitsSevenDescriptionPanel;
	JLabel traitsSevenDescriptionLabel;
	JPanel traitsSevenNrPanel;
	JLabel traitsSevenNrLabel;
	JPanel traitsEightIconPanel;
	JLabel traitsEightIconLabel;
	JPanel traitsEightDescriptionPanel;
	JLabel traitsEightDescriptionLabel;
	JPanel traitsEightNrPanel;
	JLabel traitsEightNrLabel;
	JPanel valuePanel;
	JPanel valueLabelPanel;
	JLabel valueLabel;
	JPanel valueAmountPanel;
	JLabel valueAmountLabel;
	JPanel wagePanel;
	JLabel wageLabel;
	JPanel wageAmountPanel;
	JLabel wageAmountLabel;
	JPanel contractPanel;
	JLabel contractLabel;
	JPanel contractDurationPanel;
	JLabel contractDurationLabel;
	JPanel relationsPanel;
	JPanel extraPanel;
	JPanel buttonPanel;
	JButton conversationButton;
	JButton contractButton;
	JPanel relationOnePartnerPanel;
	JLabel relationOnePartnerLabel;
	JPanel relationOneTypePanel;
	JLabel relationOneTypeLabel;
	JPanel relationOneIntensityPanel;
	JLabel relationOneIntensityLabel;
	JPanel relationTwoPartnerPanel;
	JLabel relationTwoPartnerLabel;
	JPanel relationTwoTypePanel;
	JLabel relationTwoTypeLabel;
	JPanel relationTwoIntensityPanel;
	JLabel relationTwoIntensityLabel;
	JPanel relationThreePartnerPanel;
	JLabel relationThreePartnerLabel;
	JPanel relationThreeTypePanel;
	JLabel relationThreeTypeLabel;
	JPanel relationThreeIntensityPanel;
	JLabel relationThreeIntensityLabel;
	JPanel relationFourPartnerPanel;
	JLabel relationFourPartnerLabel;
	JPanel relationFourTypePanel;
	JLabel relationFourTypeLabel;
	JPanel relationFourIntensityPanel;
	JLabel relationFourIntensityLabel;
	JPanel relationFivePartnerPanel;
	JLabel relationFivePartnerLabel;
	JPanel relationFiveTypePanel;
	JLabel relationFiveTypeLabel;
	JPanel relationFiveIntensityPanel;
	JLabel relationFiveIntensityLabel;

	public HeroDetailScreen() {

		super();
		centrePanel.setBackground(GameScreen.mediumColor);
		centrePanel.setLayout(new GridBagLayout());

		GridBagConstraints heroDetailC = new GridBagConstraints();
		heroDetailC.anchor = GridBagConstraints.BASELINE;
		heroDetailC.fill = GridBagConstraints.BOTH;
		heroDetailC.insets = new Insets(2, 2, 2, 2);

		heroDetailC.gridx = 0;
		heroDetailC.gridy = 0;
		heroDetailC.gridheight = 2;
		portraitPanel = new JPanel();
		portraitPanel.setPreferredSize(new Dimension(256, 256));
		portraitPanel.setBorder(new LineBorder(GameScreen.borderColor, 5, true));
		portraitPanel.setBackground(GameScreen.smallPanel);

		centrePanel.add(portraitPanel, heroDetailC);

		heroDetailC.gridx = 0;
		heroDetailC.gridy = 2;
		heroDetailC.gridheight = 2;
		equipmentPanel = new JPanel();
		equipmentPanel.setPreferredSize(new Dimension(256, 45));
		equipmentPanel.setBorder(new LineBorder(GameScreen.borderColor, 5, true));
		equipmentPanel.setBackground(GameScreen.smallPanel);
		equipmentPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 2));

		weaponTitlePanel = new JPanel();
		weaponTitlePanel.setPreferredSize(new Dimension(135, 35));
		weaponTitlePanel.setBackground(GameScreen.smallPanel);
		weaponTitlePanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		equipmentPanel.add(weaponTitlePanel);

		weaponTitleLabel = new JLabel("Weapon");
		weaponTitlePanel.add(weaponTitleLabel);

		combatTitlePanel = new JPanel();
		combatTitlePanel.setPreferredSize(new Dimension(25, 35));
		combatTitlePanel.setBackground(GameScreen.smallPanel);
		combatTitlePanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		equipmentPanel.add(combatTitlePanel);

		combatTitleLabel = new JLabel("C+");
		combatTitlePanel.add(combatTitleLabel);

		skillTitlePanel = new JPanel();
		skillTitlePanel.setPreferredSize(new Dimension(25, 35));
		skillTitlePanel.setBackground(GameScreen.smallPanel);
		skillTitlePanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		equipmentPanel.add(skillTitlePanel);

		skillTitleLabel = new JLabel("S+");
		skillTitlePanel.add(skillTitleLabel);

		intelligenceTitlePanel = new JPanel();
		intelligenceTitlePanel.setPreferredSize(new Dimension(25, 35));
		intelligenceTitlePanel.setBackground(GameScreen.smallPanel);
		intelligenceTitlePanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		equipmentPanel.add(intelligenceTitlePanel);

		intelligenceTitleLabel = new JLabel("I+");
		intelligenceTitlePanel.add(intelligenceTitleLabel);

		personalityTitlePanel = new JPanel();
		personalityTitlePanel.setPreferredSize(new Dimension(25, 35));
		personalityTitlePanel.setBackground(GameScreen.smallPanel);
		personalityTitlePanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		equipmentPanel.add(personalityTitlePanel);

		personalityTitleLabel = new JLabel("P+");
		personalityTitlePanel.add(personalityTitleLabel);

		weaponIconButton = new JButton();
		weaponIconButton.setPreferredSize(new Dimension(35, 35));
		equipmentPanel.add(weaponIconButton);

		weaponNamePanel = new JPanel();
		weaponNamePanel.setPreferredSize(new Dimension(98, 35));
		weaponNamePanel.setBackground(GameScreen.smallPanel);
		weaponNamePanel.setBorder(new LineBorder(GameScreen.importantColor, 3, true));
		equipmentPanel.add(weaponNamePanel);

		weaponNameLabel = new JLabel("Weapon Name");
		weaponNamePanel.add(weaponNameLabel);

		weaponCombatPanel = new JPanel();
		weaponCombatPanel.setPreferredSize(new Dimension(25, 35));
		weaponCombatPanel.setBackground(GameScreen.smallPanel);
		weaponCombatPanel.setBorder(new LineBorder(GameScreen.importantColor, 3, true));
		equipmentPanel.add(weaponCombatPanel);

		weaponCombatLabel = new JLabel();
		weaponCombatPanel.add(weaponCombatLabel);

		weaponSkillPanel = new JPanel();
		weaponSkillPanel.setPreferredSize(new Dimension(25, 35));
		weaponSkillPanel.setBackground(GameScreen.smallPanel);
		weaponSkillPanel.setBorder(new LineBorder(GameScreen.importantColor, 3, true));
		equipmentPanel.add(weaponSkillPanel);

		weaponSkillLabel = new JLabel();
		weaponSkillPanel.add(weaponSkillLabel);

		weaponIntelligencePanel = new JPanel();
		weaponIntelligencePanel.setPreferredSize(new Dimension(25, 35));
		weaponIntelligencePanel.setBackground(GameScreen.smallPanel);
		weaponIntelligencePanel.setBorder(new LineBorder(GameScreen.importantColor, 3, true));
		equipmentPanel.add(weaponIntelligencePanel);

		weaponIntelligenceLabel = new JLabel();
		weaponIntelligencePanel.add(weaponIntelligenceLabel);

		weaponPersonalityPanel = new JPanel();
		weaponPersonalityPanel.setPreferredSize(new Dimension(25, 35));
		weaponPersonalityPanel.setBackground(GameScreen.smallPanel);
		weaponPersonalityPanel.setBorder(new LineBorder(GameScreen.importantColor, 3, true));
		equipmentPanel.add(weaponPersonalityPanel);

		weaponPersonalityLabel = new JLabel();
		weaponPersonalityPanel.add(weaponPersonalityLabel);

		armourTitlePanel = new JPanel();
		armourTitlePanel.setPreferredSize(new Dimension(135, 35));
		armourTitlePanel.setBackground(GameScreen.smallPanel);
		armourTitlePanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		equipmentPanel.add(armourTitlePanel);

		armourTitleLabel = new JLabel("Armour");
		armourTitlePanel.add(armourTitleLabel);

		combatTitlePanel2 = new JPanel();
		combatTitlePanel2.setPreferredSize(new Dimension(25, 35));
		combatTitlePanel2.setBackground(GameScreen.smallPanel);
		combatTitlePanel2.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		equipmentPanel.add(combatTitlePanel2);

		combatTitleLabel2 = new JLabel("C+");
		combatTitlePanel2.add(combatTitleLabel2);

		skillTitlePanel2 = new JPanel();
		skillTitlePanel2.setPreferredSize(new Dimension(25, 35));
		skillTitlePanel2.setBackground(GameScreen.smallPanel);
		skillTitlePanel2.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		equipmentPanel.add(skillTitlePanel2);

		skillTitleLabel2 = new JLabel("S+");
		skillTitlePanel2.add(skillTitleLabel2);

		intelligenceTitlePanel2 = new JPanel();
		intelligenceTitlePanel2.setPreferredSize(new Dimension(25, 35));
		intelligenceTitlePanel2.setBackground(GameScreen.smallPanel);
		intelligenceTitlePanel2.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		equipmentPanel.add(intelligenceTitlePanel2);

		intelligenceTitleLabel2 = new JLabel("I+");
		intelligenceTitlePanel2.add(intelligenceTitleLabel2);

		personalityTitlePanel2 = new JPanel();
		personalityTitlePanel2.setPreferredSize(new Dimension(25, 35));
		personalityTitlePanel2.setBackground(GameScreen.smallPanel);
		personalityTitlePanel2.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		equipmentPanel.add(personalityTitlePanel2);

		personalityTitleLabel2 = new JLabel("P+");
		personalityTitlePanel2.add(personalityTitleLabel2);

		armourIconButton = new JButton();
		armourIconButton.setPreferredSize(new Dimension(35, 35));
		equipmentPanel.add(armourIconButton);

		armourNamePanel = new JPanel();
		armourNamePanel.setPreferredSize(new Dimension(98, 35));
		armourNamePanel.setBackground(GameScreen.smallPanel);
		armourNamePanel.setBorder(new LineBorder(GameScreen.importantColor, 3, true));
		equipmentPanel.add(armourNamePanel);

		armourNameLabel = new JLabel("armour Name");
		armourNamePanel.add(armourNameLabel);

		armourCombatPanel = new JPanel();
		armourCombatPanel.setPreferredSize(new Dimension(25, 35));
		armourCombatPanel.setBackground(GameScreen.smallPanel);
		armourCombatPanel.setBorder(new LineBorder(GameScreen.importantColor, 3, true));
		equipmentPanel.add(armourCombatPanel);

		armourCombatLabel = new JLabel();
		armourCombatPanel.add(armourCombatLabel);

		armourSkillPanel = new JPanel();
		armourSkillPanel.setPreferredSize(new Dimension(25, 35));
		armourSkillPanel.setBackground(GameScreen.smallPanel);
		armourSkillPanel.setBorder(new LineBorder(GameScreen.importantColor, 3, true));
		equipmentPanel.add(armourSkillPanel);

		armourSkillLabel = new JLabel();
		armourSkillPanel.add(armourSkillLabel);

		armourIntelligencePanel = new JPanel();
		armourIntelligencePanel.setPreferredSize(new Dimension(25, 35));
		armourIntelligencePanel.setBackground(GameScreen.smallPanel);
		armourIntelligencePanel.setBorder(new LineBorder(GameScreen.importantColor, 3, true));
		equipmentPanel.add(armourIntelligencePanel);

		armourIntelligenceLabel = new JLabel();
		armourIntelligencePanel.add(armourIntelligenceLabel);

		armourPersonalityPanel = new JPanel();
		armourPersonalityPanel.setPreferredSize(new Dimension(25, 35));
		armourPersonalityPanel.setBackground(GameScreen.smallPanel);
		armourPersonalityPanel.setBorder(new LineBorder(GameScreen.importantColor, 3, true));
		equipmentPanel.add(armourPersonalityPanel);

		armourPersonalityLabel = new JLabel();
		armourPersonalityPanel.add(armourPersonalityLabel);

		centrePanel.add(equipmentPanel, heroDetailC);

		heroDetailC.gridx = 1;
		heroDetailC.gridy = 0;
		heroDetailC.gridheight = 1;
		generalInfoPanel = new JPanel();
		generalInfoPanel.setPreferredSize(new Dimension(256, 185));
		generalInfoPanel.setBackground(GameScreen.smallPanel);
		generalInfoPanel.setBorder(new LineBorder(GameScreen.borderColor, 5, true));
		generalInfoPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 3, 3));

		centrePanel.add(generalInfoPanel, heroDetailC);

		namePanel = new JPanel();
		namePanel.setPreferredSize(new Dimension(100, 40));
		namePanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		namePanel.setBackground(GameScreen.smallPanel);

		nameLabel = new JLabel("Name");
		namePanel.add(nameLabel);

		generalInfoPanel.add(namePanel);

		nameContentPanel = new JPanel();
		nameContentPanel.setPreferredSize(new Dimension(136, 40));
		nameContentPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		nameContentPanel.setBackground(GameScreen.smallPanel);

		nameContentLabel = new JLabel();
		nameContentPanel.add(nameContentLabel);

		generalInfoPanel.add(nameContentPanel);

		genderPanel = new JPanel();
		genderPanel.setPreferredSize(new Dimension(100, 40));
		genderPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		genderPanel.setBackground(GameScreen.smallPanel);

		genderLabel = new JLabel("Gender");
		genderPanel.add(genderLabel);

		generalInfoPanel.add(genderPanel);

		genderContentPanel = new JPanel();
		genderContentPanel.setPreferredSize(new Dimension(136, 40));
		genderContentPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		genderContentPanel.setBackground(GameScreen.smallPanel);

		genderContentLabel = new JLabel("TBI");
		genderContentPanel.add(genderContentLabel);

		generalInfoPanel.add(genderContentPanel);

		racePanel = new JPanel();
		racePanel.setPreferredSize(new Dimension(100, 40));
		racePanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		racePanel.setBackground(GameScreen.smallPanel);

		raceLabel = new JLabel("Race");
		racePanel.add(raceLabel);

		generalInfoPanel.add(racePanel);

		raceContentPanel = new JPanel();
		raceContentPanel.setPreferredSize(new Dimension(136, 40));
		raceContentPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		raceContentPanel.setBackground(GameScreen.smallPanel);

		raceContentLabel = new JLabel();
		raceContentPanel.add(raceContentLabel);

		generalInfoPanel.add(raceContentPanel);

		jobPanel = new JPanel();
		jobPanel.setPreferredSize(new Dimension(100, 40));
		jobPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		jobPanel.setBackground(GameScreen.smallPanel);

		jobLabel = new JLabel("Job");
		jobPanel.add(jobLabel);

		generalInfoPanel.add(jobPanel);

		jobContentPanel = new JPanel();
		jobContentPanel.setPreferredSize(new Dimension(136, 40));
		jobContentPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		jobContentPanel.setBackground(GameScreen.smallPanel);

		jobContentLabel = new JLabel();
		jobContentPanel.add(jobContentLabel);

		generalInfoPanel.add(jobContentPanel);

		heroDetailC.gridx = 1;
		heroDetailC.gridy = 1;
		heroDetailC.gridheight = 3;
		statInfoPanel = new JPanel();
		statInfoPanel.setPreferredSize(new Dimension(256, 70));
		statInfoPanel.setBackground(GameScreen.smallPanel);
		statInfoPanel.setBorder(new LineBorder(GameScreen.borderColor, 5, true));
		statInfoPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 3, 3));

		centrePanel.add(statInfoPanel, heroDetailC);

		maturityPanel = new JPanel();
		maturityPanel.setPreferredSize(new Dimension(100, 40));
		maturityPanel.setBorder(new LineBorder(GameScreen.importantColor, 3, true));
		maturityPanel.setBackground(GameScreen.smallPanel);

		maturityLabel = new JLabel("Maturity");
		maturityPanel.add(maturityLabel);

		statInfoPanel.add(maturityPanel);

		maturityContentPanel = new JPanel();
		maturityContentPanel.setPreferredSize(new Dimension(136, 40));
		maturityContentPanel.setBorder(new LineBorder(GameScreen.importantColor, 3, true));
		maturityContentLabel = new JLabel();
		maturityContentPanel.add(maturityContentLabel);

		statInfoPanel.add(maturityContentPanel);

		combatPanel = new JPanel();
		combatPanel.setPreferredSize(new Dimension(100, 40));
		combatPanel.setBorder(new LineBorder(GameScreen.importantColor, 3, true));
		combatPanel.setBackground(GameScreen.smallPanel);

		combatLabel = new JLabel("Combat");
		combatPanel.add(combatLabel);

		statInfoPanel.add(combatPanel);

		combatContentPanel = new JPanel();
		combatContentPanel.setPreferredSize(new Dimension(136, 40));
		combatContentPanel.setBorder(new LineBorder(GameScreen.importantColor, 3, true));
		combatContentPanel.setBackground(GameScreen.smallPanel);

		combatContentLabel = new JLabel();
		combatContentPanel.add(combatContentLabel);

		statInfoPanel.add(combatContentPanel);

		skillPanel = new JPanel();
		skillPanel.setPreferredSize(new Dimension(100, 40));
		skillPanel.setBorder(new LineBorder(GameScreen.importantColor, 3, true));
		skillPanel.setBackground(GameScreen.smallPanel);

		statInfoPanel.add(skillPanel);

		skillLabel = new JLabel("Skill");
		skillPanel.add(skillLabel);

		skillContentPanel = new JPanel();
		skillContentPanel.setPreferredSize(new Dimension(136, 40));
		skillContentPanel.setBorder(new LineBorder(GameScreen.importantColor, 3, true));
		skillContentPanel.setBackground(GameScreen.smallPanel);

		skillContentLabel = new JLabel();
		skillContentPanel.add(skillContentLabel);

		statInfoPanel.add(skillContentPanel);

		intelligencePanel = new JPanel();
		intelligencePanel.setPreferredSize(new Dimension(100, 40));
		intelligencePanel.setBorder(new LineBorder(GameScreen.importantColor, 3, true));
		intelligencePanel.setBackground(GameScreen.smallPanel);

		statInfoPanel.add(intelligencePanel);

		intelligenceLabel = new JLabel("Intelligence");
		intelligencePanel.add(intelligenceLabel);

		intelligenceContentPanel = new JPanel();
		intelligenceContentPanel.setPreferredSize(new Dimension(136, 40));
		intelligenceContentPanel.setBorder(new LineBorder(GameScreen.importantColor, 3, true));
		intelligenceContentPanel.setBackground(GameScreen.smallPanel);

		intelligenceContentLabel = new JLabel();
		intelligenceContentPanel.add(intelligenceContentLabel);

		statInfoPanel.add(intelligenceContentPanel);

		personalityPanel = new JPanel();
		personalityPanel.setPreferredSize(new Dimension(100, 40));
		personalityPanel.setBorder(new LineBorder(GameScreen.importantColor, 3, true));
		personalityPanel.setBackground(GameScreen.smallPanel);

		statInfoPanel.add(personalityPanel);

		personalityLabel = new JLabel("Personality");
		personalityPanel.add(personalityLabel);

		personalityContentPanel = new JPanel();
		personalityContentPanel.setPreferredSize(new Dimension(136, 40));
		personalityContentPanel.setBorder(new LineBorder(GameScreen.importantColor, 3, true));
		personalityContentPanel.setBackground(GameScreen.smallPanel);

		personalityContentLabel = new JLabel();
		personalityContentPanel.add(personalityContentLabel);

		statInfoPanel.add(personalityContentPanel);

		heroDetailC.gridx = 2;
		heroDetailC.gridy = 0;
		heroDetailC.gridheight = 3;
		traitsInfoPanel = new JPanel();
		traitsInfoPanel.setPreferredSize(new Dimension(560, 360));
		traitsInfoPanel.setBackground(GameScreen.smallPanel);
		traitsInfoPanel.setBorder(new LineBorder(GameScreen.borderColor, 5, true));
		traitsInfoPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 3, 3));

		centrePanel.add(traitsInfoPanel, heroDetailC);

		traitsOneNrPanel = new JPanel();
		traitsOneNrPanel.setPreferredSize(new Dimension(40, 40));
		traitsOneNrPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		traitsOneNrPanel.setBackground(GameScreen.smallPanel);
		traitsInfoPanel.add(traitsOneNrPanel);

		traitsOneNrLabel = new JLabel("1");
		traitsOneNrPanel.add(traitsOneNrLabel);

		traitsOneIconPanel = new JPanel();
		traitsOneIconPanel.setPreferredSize(new Dimension(40, 40));
		traitsOneIconPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		traitsOneIconPanel.setBackground(GameScreen.smallPanel);
		traitsInfoPanel.add(traitsOneIconPanel);

		traitsOneIconLabel = new JLabel();
		traitsOneNrPanel.add(traitsOneIconLabel);

		traitsOneDescriptionPanel = new JPanel();
		traitsOneDescriptionPanel.setPreferredSize(new Dimension(458, 40));
		traitsOneDescriptionPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		traitsOneDescriptionPanel.setBackground(GameScreen.smallPanel);
		traitsOneDescriptionPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 1, 1));
		traitsInfoPanel.add(traitsOneDescriptionPanel);

		traitsOneDescriptionLabel = new JLabel("<html> blablabla <br> blablabla</html>");
		traitsOneDescriptionPanel.add(traitsOneDescriptionLabel);

		traitsTwoNrPanel = new JPanel();
		traitsTwoNrPanel.setPreferredSize(new Dimension(40, 40));
		traitsTwoNrPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		traitsTwoNrPanel.setBackground(GameScreen.smallPanel);
		traitsInfoPanel.add(traitsTwoNrPanel);

		traitsTwoNrLabel = new JLabel("2");
		traitsTwoNrPanel.add(traitsTwoNrLabel);

		traitsTwoIconPanel = new JPanel();
		traitsTwoIconPanel.setPreferredSize(new Dimension(40, 40));
		traitsTwoIconPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		traitsTwoIconPanel.setBackground(GameScreen.smallPanel);
		traitsInfoPanel.add(traitsTwoIconPanel);

		traitsTwoIconLabel = new JLabel();
		traitsTwoNrPanel.add(traitsTwoIconLabel);

		traitsTwoDescriptionPanel = new JPanel();
		traitsTwoDescriptionPanel.setPreferredSize(new Dimension(458, 40));
		traitsTwoDescriptionPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		traitsTwoDescriptionPanel.setBackground(GameScreen.smallPanel);
		traitsTwoDescriptionPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 1, 1));
		traitsInfoPanel.add(traitsTwoDescriptionPanel);

		traitsTwoDescriptionLabel = new JLabel("<html> blablabla <br> blablabla</html>");
		traitsTwoDescriptionPanel.add(traitsTwoDescriptionLabel);

		traitsThreeNrPanel = new JPanel();
		traitsThreeNrPanel.setPreferredSize(new Dimension(40, 40));
		traitsThreeNrPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		traitsThreeNrPanel.setBackground(GameScreen.smallPanel);
		traitsInfoPanel.add(traitsThreeNrPanel);

		traitsThreeNrLabel = new JLabel("3");
		traitsThreeNrPanel.add(traitsThreeNrLabel);

		traitsThreeIconPanel = new JPanel();
		traitsThreeIconPanel.setPreferredSize(new Dimension(40, 40));
		traitsThreeIconPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		traitsThreeIconPanel.setBackground(GameScreen.smallPanel);
		traitsInfoPanel.add(traitsThreeIconPanel);

		traitsThreeIconLabel = new JLabel();
		traitsThreeNrPanel.add(traitsThreeIconLabel);

		traitsThreeDescriptionPanel = new JPanel();
		traitsThreeDescriptionPanel.setPreferredSize(new Dimension(458, 40));
		traitsThreeDescriptionPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		traitsThreeDescriptionPanel.setBackground(GameScreen.smallPanel);
		traitsThreeDescriptionPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 1, 1));
		traitsInfoPanel.add(traitsThreeDescriptionPanel);

		traitsThreeDescriptionLabel = new JLabel("<html> blablabla <br> blablabla</html>");
		traitsThreeDescriptionPanel.add(traitsThreeDescriptionLabel);

		traitsFourNrPanel = new JPanel();
		traitsFourNrPanel.setPreferredSize(new Dimension(40, 40));
		traitsFourNrPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		traitsFourNrPanel.setBackground(GameScreen.smallPanel);
		traitsInfoPanel.add(traitsFourNrPanel);

		traitsFourNrLabel = new JLabel("4");
		traitsFourNrPanel.add(traitsFourNrLabel);

		traitsFourIconPanel = new JPanel();
		traitsFourIconPanel.setPreferredSize(new Dimension(40, 40));
		traitsFourIconPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		traitsFourIconPanel.setBackground(GameScreen.smallPanel);
		traitsInfoPanel.add(traitsFourIconPanel);

		traitsFourIconLabel = new JLabel();
		traitsFourNrPanel.add(traitsFourIconLabel);

		traitsFourDescriptionPanel = new JPanel();
		traitsFourDescriptionPanel.setPreferredSize(new Dimension(458, 40));
		traitsFourDescriptionPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		traitsFourDescriptionPanel.setBackground(GameScreen.smallPanel);
		traitsFourDescriptionPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 1, 1));
		traitsInfoPanel.add(traitsFourDescriptionPanel);

		traitsFourDescriptionLabel = new JLabel("<html> blablabla <br> blablabla</html>");
		traitsFourDescriptionPanel.add(traitsFourDescriptionLabel);

		traitsFiveNrPanel = new JPanel();
		traitsFiveNrPanel.setPreferredSize(new Dimension(40, 40));
		traitsFiveNrPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		traitsFiveNrPanel.setBackground(GameScreen.smallPanel);
		traitsInfoPanel.add(traitsFiveNrPanel);

		traitsFiveNrLabel = new JLabel("5");
		traitsFiveNrPanel.add(traitsFiveNrLabel);

		traitsFiveIconPanel = new JPanel();
		traitsFiveIconPanel.setPreferredSize(new Dimension(40, 40));
		traitsFiveIconPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		traitsFiveIconPanel.setBackground(GameScreen.smallPanel);
		traitsInfoPanel.add(traitsFiveIconPanel);

		traitsFiveIconLabel = new JLabel();
		traitsFiveNrPanel.add(traitsFiveIconLabel);

		traitsFiveDescriptionPanel = new JPanel();
		traitsFiveDescriptionPanel.setPreferredSize(new Dimension(458, 40));
		traitsFiveDescriptionPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		traitsFiveDescriptionPanel.setBackground(GameScreen.smallPanel);
		traitsFiveDescriptionPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 1, 1));
		traitsInfoPanel.add(traitsFiveDescriptionPanel);

		traitsFiveDescriptionLabel = new JLabel("<html> blablabla <br> blablabla</html>");
		traitsFiveDescriptionPanel.add(traitsFiveDescriptionLabel);

		traitsSixNrPanel = new JPanel();
		traitsSixNrPanel.setPreferredSize(new Dimension(40, 40));
		traitsSixNrPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		traitsSixNrPanel.setBackground(GameScreen.smallPanel);
		traitsInfoPanel.add(traitsSixNrPanel);

		traitsSixNrLabel = new JLabel("6");
		traitsSixNrPanel.add(traitsSixNrLabel);

		traitsSixIconPanel = new JPanel();
		traitsSixIconPanel.setPreferredSize(new Dimension(40, 40));
		traitsSixIconPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		traitsSixIconPanel.setBackground(GameScreen.smallPanel);
		traitsInfoPanel.add(traitsSixIconPanel);

		traitsSixIconLabel = new JLabel();
		traitsSixNrPanel.add(traitsSixIconLabel);

		traitsSixDescriptionPanel = new JPanel();
		traitsSixDescriptionPanel.setPreferredSize(new Dimension(458, 40));
		traitsSixDescriptionPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		traitsSixDescriptionPanel.setBackground(GameScreen.smallPanel);
		traitsSixDescriptionPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 1, 1));
		traitsInfoPanel.add(traitsSixDescriptionPanel);

		traitsSixDescriptionLabel = new JLabel("<html> blablabla <br> blablabla</html>");
		traitsSixDescriptionPanel.add(traitsSixDescriptionLabel);

		traitsSevenNrPanel = new JPanel();
		traitsSevenNrPanel.setPreferredSize(new Dimension(40, 40));
		traitsSevenNrPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		traitsSevenNrPanel.setBackground(GameScreen.smallPanel);
		traitsInfoPanel.add(traitsSevenNrPanel);

		traitsSevenNrLabel = new JLabel("7");
		traitsSevenNrPanel.add(traitsSevenNrLabel);

		traitsSevenIconPanel = new JPanel();
		traitsSevenIconPanel.setPreferredSize(new Dimension(40, 40));
		traitsSevenIconPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		traitsSevenIconPanel.setBackground(GameScreen.smallPanel);
		traitsInfoPanel.add(traitsSevenIconPanel);

		traitsSevenIconLabel = new JLabel();
		traitsSevenNrPanel.add(traitsSevenIconLabel);

		traitsSevenDescriptionPanel = new JPanel();
		traitsSevenDescriptionPanel.setPreferredSize(new Dimension(458, 40));
		traitsSevenDescriptionPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		traitsSevenDescriptionPanel.setBackground(GameScreen.smallPanel);
		traitsSevenDescriptionPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 1, 1));
		traitsInfoPanel.add(traitsSevenDescriptionPanel);

		traitsSevenDescriptionLabel = new JLabel("<html> blablabla <br> blablabla</html>");
		traitsSevenDescriptionPanel.add(traitsSevenDescriptionLabel);

		traitsEightNrPanel = new JPanel();
		traitsEightNrPanel.setPreferredSize(new Dimension(40, 40));
		traitsEightNrPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		traitsEightNrPanel.setBackground(GameScreen.smallPanel);
		traitsInfoPanel.add(traitsEightNrPanel);

		traitsEightNrLabel = new JLabel("8");
		traitsEightNrPanel.add(traitsEightNrLabel);

		traitsEightIconPanel = new JPanel();
		traitsEightIconPanel.setPreferredSize(new Dimension(40, 40));
		traitsEightIconPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		traitsEightIconPanel.setBackground(GameScreen.smallPanel);
		traitsInfoPanel.add(traitsEightIconPanel);

		traitsEightIconLabel = new JLabel();
		traitsEightNrPanel.add(traitsEightIconLabel);

		traitsEightDescriptionPanel = new JPanel();
		traitsEightDescriptionPanel.setPreferredSize(new Dimension(458, 40));
		traitsEightDescriptionPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		traitsEightDescriptionPanel.setBackground(GameScreen.smallPanel);
		traitsEightDescriptionPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 1, 1));
		traitsInfoPanel.add(traitsEightDescriptionPanel);

		traitsEightDescriptionLabel = new JLabel("<html> blablabla <br> blablabla</html>");
		traitsEightDescriptionPanel.add(traitsEightDescriptionLabel);

		heroDetailC.gridx = 2;
		heroDetailC.gridy = 3;
		heroDetailC.gridheight = 1;
		valuePanel = new JPanel();
		valuePanel.setPreferredSize(new Dimension(560, 55));
		valuePanel.setBackground(GameScreen.smallPanel);
		valuePanel.setBorder(new LineBorder(GameScreen.borderColor, 5, true));
		valuePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 2));

		valueLabelPanel = new JPanel();
		valueLabelPanel.setPreferredSize(new Dimension(93, 40));
		valueLabelPanel.setBorder(new LineBorder(GameScreen.importantColor, 3, true));
		valueLabelPanel.setBackground(GameScreen.smallPanel);
		valuePanel.add(valueLabelPanel);

		valueLabel = new JLabel("Current Value");
		valueLabelPanel.add(valueLabel);

		valueAmountPanel = new JPanel();
		valueAmountPanel.setPreferredSize(new Dimension(85, 40));
		valueAmountPanel.setBorder(new LineBorder(GameScreen.importantColor, 3, true));
		valueAmountPanel.setBackground(GameScreen.smallPanel);
		valuePanel.add(valueAmountPanel);

		valueAmountLabel = new JLabel();
		valueAmountPanel.add(valueAmountLabel);

		wagePanel = new JPanel();
		wagePanel.setPreferredSize(new Dimension(93, 40));
		wagePanel.setBackground(GameScreen.smallPanel);
		wagePanel.setBorder(new LineBorder(GameScreen.importantColor, 3, true));
		valuePanel.add(wagePanel);

		wageLabel = new JLabel("Salary");
		wagePanel.add(wageLabel);

		wageAmountPanel = new JPanel();
		wageAmountPanel.setPreferredSize(new Dimension(85, 40));
		wageAmountPanel.setBackground(GameScreen.smallPanel);
		wageAmountPanel.setBorder(new LineBorder(GameScreen.importantColor, 3, true));
		valuePanel.add(wageAmountPanel);

		wageAmountLabel = new JLabel();
		wageAmountPanel.add(wageAmountLabel);

		contractPanel = new JPanel();
		contractPanel.setPreferredSize(new Dimension(93, 40));
		contractPanel.setBackground(GameScreen.smallPanel);
		contractPanel.setBorder(new LineBorder(GameScreen.importantColor, 3, true));
		valuePanel.add(contractPanel);

		contractLabel = new JLabel("<html>End of <br>Contract</html>");
		contractPanel.add(contractLabel);

		contractDurationPanel = new JPanel();
		contractDurationPanel.setPreferredSize(new Dimension(85, 40));
		contractDurationPanel.setBackground(GameScreen.smallPanel);
		contractDurationPanel.setBorder(new LineBorder(GameScreen.importantColor, 3, true));
		valuePanel.add(contractDurationPanel);

		contractDurationLabel = new JLabel();
		contractPanel.add(contractDurationLabel);

		centrePanel.add(valuePanel, heroDetailC);

		heroDetailC.gridx = 0;
		heroDetailC.gridy = 4;
		heroDetailC.gridwidth = 2;
		relationsPanel = new JPanel();
		relationsPanel.setBackground(GameScreen.smallPanel);
		relationsPanel.setBorder(new LineBorder(GameScreen.borderColor, 5, true));
		relationsPanel.setPreferredSize(new Dimension(520, 230));
		relationsPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 3, 3));

		relationOnePartnerPanel = new JPanel();
		relationOnePartnerPanel.setPreferredSize(new Dimension(166, 40));
		relationOnePartnerPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		relationOnePartnerPanel.setBackground(GameScreen.smallPanel);
		relationOnePartnerPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 1, 5));
		relationsPanel.add(relationOnePartnerPanel);

		relationOnePartnerLabel = new JLabel("Partner");
		relationOnePartnerPanel.add(relationOnePartnerLabel);

		relationOneTypePanel = new JPanel();
		relationOneTypePanel.setPreferredSize(new Dimension(166, 40));
		relationOneTypePanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		relationOneTypePanel.setBackground(GameScreen.smallPanel);
		relationOneTypePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 1, 5));
		relationsPanel.add(relationOneTypePanel);

		relationOneTypeLabel = new JLabel("Type");
		relationOneTypePanel.add(relationOneTypeLabel);

		relationOneIntensityPanel = new JPanel();
		relationOneIntensityPanel.setPreferredSize(new Dimension(166, 40));
		relationOneIntensityPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		relationOneIntensityPanel.setBackground(GameScreen.smallPanel);
		relationOneIntensityPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 1, 5));
		relationsPanel.add(relationOneIntensityPanel);

		relationOneIntensityLabel = new JLabel("Intensity");
		relationOneIntensityPanel.add(relationOneIntensityLabel);

		relationTwoPartnerPanel = new JPanel();
		relationTwoPartnerPanel.setPreferredSize(new Dimension(166, 40));
		relationTwoPartnerPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		relationTwoPartnerPanel.setBackground(GameScreen.smallPanel);
		relationTwoPartnerPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 1, 5));
		relationsPanel.add(relationTwoPartnerPanel);

		relationTwoPartnerLabel = new JLabel("Partner");
		relationTwoPartnerPanel.add(relationTwoPartnerLabel);

		relationTwoTypePanel = new JPanel();
		relationTwoTypePanel.setPreferredSize(new Dimension(166, 40));
		relationTwoTypePanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		relationTwoTypePanel.setBackground(GameScreen.smallPanel);
		relationTwoTypePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 1, 5));
		relationsPanel.add(relationTwoTypePanel);

		relationTwoTypeLabel = new JLabel("Type");
		relationTwoTypePanel.add(relationTwoTypeLabel);

		relationTwoIntensityPanel = new JPanel();
		relationTwoIntensityPanel.setPreferredSize(new Dimension(166, 40));
		relationTwoIntensityPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		relationTwoIntensityPanel.setBackground(GameScreen.smallPanel);
		relationTwoIntensityPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 1, 5));
		relationsPanel.add(relationTwoIntensityPanel);

		relationTwoIntensityLabel = new JLabel("Intensity");
		relationTwoIntensityPanel.add(relationTwoIntensityLabel);

		relationThreePartnerPanel = new JPanel();
		relationThreePartnerPanel.setPreferredSize(new Dimension(166, 40));
		relationThreePartnerPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		relationThreePartnerPanel.setBackground(GameScreen.smallPanel);
		relationThreePartnerPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 1, 5));
		relationsPanel.add(relationThreePartnerPanel);

		relationThreePartnerLabel = new JLabel("Partner");
		relationThreePartnerPanel.add(relationThreePartnerLabel);

		relationThreeTypePanel = new JPanel();
		relationThreeTypePanel.setPreferredSize(new Dimension(166, 40));
		relationThreeTypePanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		relationThreeTypePanel.setBackground(GameScreen.smallPanel);
		relationThreeTypePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 1, 5));
		relationsPanel.add(relationThreeTypePanel);

		relationThreeTypeLabel = new JLabel("Type");
		relationThreeTypePanel.add(relationThreeTypeLabel);

		relationThreeIntensityPanel = new JPanel();
		relationThreeIntensityPanel.setPreferredSize(new Dimension(166, 40));
		relationThreeIntensityPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		relationThreeIntensityPanel.setBackground(GameScreen.smallPanel);
		relationThreeIntensityPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 1, 5));
		relationsPanel.add(relationThreeIntensityPanel);

		relationThreeIntensityLabel = new JLabel("Intensity");
		relationThreeIntensityPanel.add(relationThreeIntensityLabel);

		relationFourPartnerPanel = new JPanel();
		relationFourPartnerPanel.setPreferredSize(new Dimension(166, 40));
		relationFourPartnerPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		relationFourPartnerPanel.setBackground(GameScreen.smallPanel);
		relationFourPartnerPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 1, 5));
		relationsPanel.add(relationFourPartnerPanel);

		relationFourPartnerLabel = new JLabel("Partner");
		relationFourPartnerPanel.add(relationFourPartnerLabel);

		relationFourTypePanel = new JPanel();
		relationFourTypePanel.setPreferredSize(new Dimension(166, 40));
		relationFourTypePanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		relationFourTypePanel.setBackground(GameScreen.smallPanel);
		relationFourTypePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 1, 5));
		relationsPanel.add(relationFourTypePanel);

		relationFourTypeLabel = new JLabel("Type");
		relationFourTypePanel.add(relationFourTypeLabel);

		relationFourIntensityPanel = new JPanel();
		relationFourIntensityPanel.setPreferredSize(new Dimension(166, 40));
		relationFourIntensityPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		relationFourIntensityPanel.setBackground(GameScreen.smallPanel);
		relationFourIntensityPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 1, 5));
		relationsPanel.add(relationFourIntensityPanel);

		relationFourIntensityLabel = new JLabel("Intensity");
		relationFourIntensityPanel.add(relationFourIntensityLabel);

		relationFivePartnerPanel = new JPanel();
		relationFivePartnerPanel.setPreferredSize(new Dimension(166, 40));
		relationFivePartnerPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		relationFivePartnerPanel.setBackground(GameScreen.smallPanel);
		relationFivePartnerPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 1, 5));
		relationsPanel.add(relationFivePartnerPanel);

		relationFivePartnerLabel = new JLabel("Partner");
		relationFivePartnerPanel.add(relationFivePartnerLabel);

		relationFiveTypePanel = new JPanel();
		relationFiveTypePanel.setPreferredSize(new Dimension(166, 40));
		relationFiveTypePanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		relationFiveTypePanel.setBackground(GameScreen.smallPanel);
		relationFiveTypePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 1, 5));
		relationsPanel.add(relationFiveTypePanel);

		relationFiveTypeLabel = new JLabel("Type");
		relationFiveTypePanel.add(relationFiveTypeLabel);

		relationFiveIntensityPanel = new JPanel();
		relationFiveIntensityPanel.setPreferredSize(new Dimension(166, 40));
		relationFiveIntensityPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 3, true));
		relationFiveIntensityPanel.setBackground(GameScreen.smallPanel);
		relationFiveIntensityPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 1, 5));
		relationsPanel.add(relationFiveIntensityPanel);

		relationFiveIntensityLabel = new JLabel("Intensity");
		relationFiveIntensityPanel.add(relationFiveIntensityLabel);

		centrePanel.add(relationsPanel, heroDetailC);

		heroDetailC.gridx = 2;
		heroDetailC.gridy = 4;
		heroDetailC.gridwidth = 1;
		extraPanel = new JPanel();
		extraPanel.setPreferredSize(new Dimension(500, 230));
		extraPanel.setBorder(new LineBorder(GameScreen.borderColor, 5, true));
		extraPanel.setBackground(GameScreen.smallPanel);

		centrePanel.add(extraPanel, heroDetailC);

		heroDetailC.gridx = 0;
		heroDetailC.gridy = 5;
		heroDetailC.gridwidth = 3;
		buttonPanel = new JPanel();
		buttonPanel.setPreferredSize(new Dimension(1080, 110));
		buttonPanel.setBackground(GameScreen.smallPanel);
		buttonPanel.setBorder(new LineBorder(GameScreen.borderColor, 5, true));
		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		conversationButton = new JButton("Have a Conversation");
		conversationButton.setPreferredSize(new Dimension(250, 80));
		buttonPanel.add(conversationButton);

		contractButton = new JButton("Negotiate Contract");
		contractButton.setPreferredSize(new Dimension(250, 80));
		buttonPanel.add(contractButton);

		centrePanel.add(buttonPanel, heroDetailC);

		weaponIconButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JDialog weaponInventoryDialog = new JDialog(null, Dialog.ModalityType.APPLICATION_MODAL);
				weaponInventoryDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				weaponInventoryDialog.setSize(new Dimension(400, 300));
				weaponInventoryDialog.setLocationRelativeTo(getParent());
				weaponInventoryDialog.setLocation(620, 520);
				weaponInventoryDialog.setUndecorated(true);

				JPanel weaponInventory = new JPanel();

				weaponInventory.setPreferredSize(new Dimension(350, WeaponInventory.weaponInventoryList.size() * 50));
				weaponInventory.setBackground(GameScreen.backgroundColor);
				weaponInventory.setBorder(new LineBorder(GameScreen.borderColor, 3, true));
				weaponInventory.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 2));

				for (int i = 0; i < WeaponInventory.weaponInventoryList.size(); i++) {

					final int index = i;

					JButton weaponIconButton = new JButton();
					weaponIconButton.setPreferredSize(new Dimension(40, 40));
					weaponInventory.add(weaponIconButton);

					weaponIconButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {

							WeaponInventory.weaponInventoryList.add(GameScreen.currentHero.weapon);
							GameScreen.currentHero.weapon = WeaponInventory.weaponInventoryList.get(index);
							WeaponInventory.weaponInventoryList.remove(index);

							Collections.sort(WeaponInventory.weaponInventoryList, new Comparator<Weapon>() {
								@Override
								public int compare(Weapon p1, Weapon p2) {
									return p1.name.compareToIgnoreCase(p2.name);
								}
							});

							weaponInventoryDialog.dispose();
							fillScreen();

						}
					});

					JPanel weaponNamePanel = new JPanel();
					weaponNamePanel.setPreferredSize(new Dimension(160, 40));
					weaponNamePanel.setBackground(GameScreen.smallPanel);
					weaponNamePanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 2, true));
					weaponInventory.add(weaponNamePanel);

					JLabel weaponNameLabel = new JLabel();
					weaponNameLabel.setText(WeaponInventory.weaponInventoryList.get(i).name);
					weaponNamePanel.add(weaponNameLabel);

					JPanel weaponCombatBonusPanel = new JPanel();
					weaponCombatBonusPanel.setPreferredSize(new Dimension(40, 40));
					weaponCombatBonusPanel.setBackground(GameScreen.smallPanel);
					weaponCombatBonusPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 2, true));
					weaponInventory.add(weaponCombatBonusPanel);

					JLabel weaponCombatBonusLabel = new JLabel();
					if (GameScreen.currentHero.weapon.combatBonus > WeaponInventory.weaponInventoryList
							.get(i).combatBonus) {
						weaponCombatBonusLabel.setForeground(Color.RED);
					} else if (GameScreen.currentHero.weapon.combatBonus < WeaponInventory.weaponInventoryList
							.get(i).combatBonus) {
						weaponCombatBonusLabel.setForeground(Color.BLUE);
					}

					weaponCombatBonusLabel
							.setText(Integer.toString(WeaponInventory.weaponInventoryList.get(i).combatBonus));
					weaponCombatBonusPanel.add(weaponCombatBonusLabel);

					JPanel weaponSkillBonusPanel = new JPanel();
					weaponSkillBonusPanel.setPreferredSize(new Dimension(40, 40));
					weaponSkillBonusPanel.setBackground(GameScreen.smallPanel);
					weaponSkillBonusPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 2, true));
					weaponInventory.add(weaponSkillBonusPanel);

					JLabel weaponSkillBonusLabel = new JLabel();
					if (GameScreen.currentHero.weapon.skillBonus > WeaponInventory.weaponInventoryList
							.get(i).skillBonus) {
						weaponSkillBonusLabel.setForeground(Color.RED);
					} else if (GameScreen.currentHero.weapon.skillBonus < WeaponInventory.weaponInventoryList
							.get(i).skillBonus) {
						weaponSkillBonusLabel.setForeground(Color.BLUE);
					}

					weaponSkillBonusLabel
							.setText(Integer.toString(WeaponInventory.weaponInventoryList.get(i).skillBonus));
					weaponSkillBonusPanel.add(weaponSkillBonusLabel);

					JPanel weaponIntelligenceBonusPanel = new JPanel();
					weaponIntelligenceBonusPanel.setPreferredSize(new Dimension(40, 40));
					weaponIntelligenceBonusPanel.setBackground(GameScreen.smallPanel);
					weaponIntelligenceBonusPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 2, true));
					weaponInventory.add(weaponIntelligenceBonusPanel);

					JLabel weaponIntelligenceBonusLabel = new JLabel();
					if (GameScreen.currentHero.weapon.intelligenceBonus > WeaponInventory.weaponInventoryList
							.get(i).intelligenceBonus) {
						weaponIntelligenceBonusLabel.setForeground(Color.RED);
					} else if (GameScreen.currentHero.weapon.intelligenceBonus < WeaponInventory.weaponInventoryList
							.get(i).intelligenceBonus) {
						weaponIntelligenceBonusLabel.setForeground(Color.BLUE);
					}

					weaponIntelligenceBonusLabel
							.setText(Integer.toString(WeaponInventory.weaponInventoryList.get(i).intelligenceBonus));
					weaponIntelligenceBonusPanel.add(weaponIntelligenceBonusLabel);

					JPanel weaponPersonalityBonusPanel = new JPanel();
					weaponPersonalityBonusPanel.setPreferredSize(new Dimension(40, 40));
					weaponPersonalityBonusPanel.setBackground(GameScreen.smallPanel);
					weaponPersonalityBonusPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 2, true));
					weaponInventory.add(weaponPersonalityBonusPanel);

					JLabel weaponPersonalityBonusLabel = new JLabel();
					if (GameScreen.currentHero.weapon.personalityBonus > WeaponInventory.weaponInventoryList
							.get(i).personalityBonus) {
						weaponPersonalityBonusLabel.setForeground(Color.RED);
					} else if (GameScreen.currentHero.weapon.personalityBonus < WeaponInventory.weaponInventoryList
							.get(i).personalityBonus) {
						weaponPersonalityBonusLabel.setForeground(Color.BLUE);
					}

					weaponPersonalityBonusLabel
							.setText(Integer.toString(WeaponInventory.weaponInventoryList.get(i).personalityBonus));
					weaponPersonalityBonusPanel.add(weaponPersonalityBonusLabel);

				}

				JScrollPane scrollPane = new JScrollPane(weaponInventory);
				scrollPane.setPreferredSize(new Dimension(380, 280));
				weaponInventoryDialog.add(scrollPane);

				weaponInventoryDialog.setVisible(true);

			}
		});

		armourIconButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JDialog armourInventoryDialog = new JDialog(null, Dialog.ModalityType.APPLICATION_MODAL);
				armourInventoryDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				armourInventoryDialog.setSize(new Dimension(400, 300));
				armourInventoryDialog.setLocationRelativeTo(getParent());
				armourInventoryDialog.setLocation(620, 720);
				armourInventoryDialog.setUndecorated(true);

				JPanel armourInventory = new JPanel();

				armourInventory.setPreferredSize(new Dimension(350, ArmourInventory.armourInventoryList.size() * 50));
				armourInventory.setBackground(GameScreen.backgroundColor);
				armourInventory.setBorder(new LineBorder(GameScreen.borderColor, 3, true));
				armourInventory.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 2));

				for (int i = 0; i < ArmourInventory.armourInventoryList.size(); i++) {

					final int index = i;

					JButton armourIconButton = new JButton();
					armourIconButton.setPreferredSize(new Dimension(40, 40));
					armourInventory.add(armourIconButton);

					armourIconButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {

							ArmourInventory.armourInventoryList.add(GameScreen.currentHero.armour);
							GameScreen.currentHero.armour = ArmourInventory.armourInventoryList.get(index);
							ArmourInventory.armourInventoryList.remove(index);

							Collections.sort(ArmourInventory.armourInventoryList, new Comparator<Armour>() {
								@Override
								public int compare(Armour p1, Armour p2) {
									return p1.name.compareToIgnoreCase(p2.name);
								}
							});

							armourInventoryDialog.dispose();
							fillScreen();

						}
					});

					JPanel armourNamePanel = new JPanel();
					armourNamePanel.setPreferredSize(new Dimension(160, 40));
					armourNamePanel.setBackground(GameScreen.smallPanel);
					armourNamePanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 2, true));
					armourInventory.add(armourNamePanel);

					JLabel armourNameLabel = new JLabel();
					armourNameLabel.setText(ArmourInventory.armourInventoryList.get(i).name);
					armourNamePanel.add(armourNameLabel);

					JPanel armourCombatBonusPanel = new JPanel();
					armourCombatBonusPanel.setPreferredSize(new Dimension(40, 40));
					armourCombatBonusPanel.setBackground(GameScreen.smallPanel);
					armourCombatBonusPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 2, true));
					armourInventory.add(armourCombatBonusPanel);

					JLabel armourCombatBonusLabel = new JLabel();
					if (GameScreen.currentHero.armour.combatBonus > ArmourInventory.armourInventoryList
							.get(i).combatBonus) {
						armourCombatBonusLabel.setForeground(Color.RED);
					} else if (GameScreen.currentHero.armour.combatBonus < ArmourInventory.armourInventoryList
							.get(i).combatBonus) {
						armourCombatBonusLabel.setForeground(Color.BLUE);
					}

					armourCombatBonusLabel
							.setText(Integer.toString(ArmourInventory.armourInventoryList.get(i).combatBonus));
					armourCombatBonusPanel.add(armourCombatBonusLabel);

					JPanel armourSkillBonusPanel = new JPanel();
					armourSkillBonusPanel.setPreferredSize(new Dimension(40, 40));
					armourSkillBonusPanel.setBackground(GameScreen.smallPanel);
					armourSkillBonusPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 2, true));
					armourInventory.add(armourSkillBonusPanel);

					JLabel armourSkillBonusLabel = new JLabel();
					if (GameScreen.currentHero.armour.skillBonus > ArmourInventory.armourInventoryList
							.get(i).skillBonus) {
						armourSkillBonusLabel.setForeground(Color.RED);
					} else if (GameScreen.currentHero.armour.skillBonus < ArmourInventory.armourInventoryList
							.get(i).skillBonus) {
						armourSkillBonusLabel.setForeground(Color.BLUE);
					}

					armourSkillBonusLabel
							.setText(Integer.toString(ArmourInventory.armourInventoryList.get(i).skillBonus));
					armourSkillBonusPanel.add(armourSkillBonusLabel);

					JPanel armourIntelligenceBonusPanel = new JPanel();
					armourIntelligenceBonusPanel.setPreferredSize(new Dimension(40, 40));
					armourIntelligenceBonusPanel.setBackground(GameScreen.smallPanel);
					armourIntelligenceBonusPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 2, true));
					armourInventory.add(armourIntelligenceBonusPanel);

					JLabel armourIntelligenceBonusLabel = new JLabel();
					if (GameScreen.currentHero.armour.intelligenceBonus > ArmourInventory.armourInventoryList
							.get(i).intelligenceBonus) {
						armourIntelligenceBonusLabel.setForeground(Color.RED);
					} else if (GameScreen.currentHero.armour.intelligenceBonus < ArmourInventory.armourInventoryList
							.get(i).intelligenceBonus) {
						armourIntelligenceBonusLabel.setForeground(Color.BLUE);
					}

					armourIntelligenceBonusLabel
							.setText(Integer.toString(ArmourInventory.armourInventoryList.get(i).intelligenceBonus));
					armourIntelligenceBonusPanel.add(armourIntelligenceBonusLabel);

					JPanel armourPersonalityBonusPanel = new JPanel();
					armourPersonalityBonusPanel.setPreferredSize(new Dimension(40, 40));
					armourPersonalityBonusPanel.setBackground(GameScreen.smallPanel);
					armourPersonalityBonusPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 2, true));
					armourInventory.add(armourPersonalityBonusPanel);

					JLabel armourPersonalityBonusLabel = new JLabel();
					if (GameScreen.currentHero.armour.personalityBonus > ArmourInventory.armourInventoryList
							.get(i).personalityBonus) {
						armourPersonalityBonusLabel.setForeground(Color.RED);
					} else if (GameScreen.currentHero.armour.personalityBonus < ArmourInventory.armourInventoryList
							.get(i).personalityBonus) {
						armourPersonalityBonusLabel.setForeground(Color.BLUE);
					}

					armourPersonalityBonusLabel
							.setText(Integer.toString(ArmourInventory.armourInventoryList.get(i).personalityBonus));
					armourPersonalityBonusPanel.add(armourPersonalityBonusLabel);

				}

				JScrollPane scrollPane2 = new JScrollPane(armourInventory);
				scrollPane2.setPreferredSize(new Dimension(380, 280));
				armourInventoryDialog.add(scrollPane2);

				armourInventoryDialog.setVisible(true);

			}

		});

	}

	public void fillScreen() {

		GameScreen.currentHero.refreshStats();

		GameScreen.heroDetailScreen.weaponNameLabel.setText(GameScreen.currentHero.weapon.name);
		GameScreen.heroDetailScreen.weaponCombatLabel
				.setText(Integer.toString(GameScreen.currentHero.weapon.combatBonus));
		GameScreen.heroDetailScreen.weaponSkillLabel
				.setText(Integer.toString(GameScreen.currentHero.weapon.skillBonus));
		GameScreen.heroDetailScreen.weaponIntelligenceLabel
				.setText(Integer.toString(GameScreen.currentHero.weapon.intelligenceBonus));
		GameScreen.heroDetailScreen.weaponPersonalityLabel
				.setText(Integer.toString(GameScreen.currentHero.weapon.personalityBonus));

		GameScreen.heroDetailScreen.armourNameLabel.setText(GameScreen.currentHero.armour.name);
		GameScreen.heroDetailScreen.armourCombatLabel
				.setText(Integer.toString(GameScreen.currentHero.armour.combatBonus));
		GameScreen.heroDetailScreen.armourSkillLabel
				.setText(Integer.toString(GameScreen.currentHero.armour.skillBonus));
		GameScreen.heroDetailScreen.armourIntelligenceLabel
				.setText(Integer.toString(GameScreen.currentHero.armour.intelligenceBonus));
		GameScreen.heroDetailScreen.armourPersonalityLabel
				.setText(Integer.toString(GameScreen.currentHero.armour.personalityBonus));

		GameScreen.heroDetailScreen.nameContentLabel.setText(GameScreen.currentHero.name);
		GameScreen.heroDetailScreen.raceContentLabel.setText(GameScreen.currentHero.race.name);
		GameScreen.heroDetailScreen.jobContentLabel.setText(GameScreen.currentHero.job.name);

		GameScreen.heroDetailScreen.maturityContentLabel.setText(Integer.toString(GameScreen.currentHero.maturity));
		maturityContentPanel.setBackground(
				new Color(240 - GameScreen.currentHero.maturity, 140 + GameScreen.currentHero.maturity, 150));

		GameScreen.heroDetailScreen.combatContentLabel.setText(Integer.toString(GameScreen.currentHero.combat));
		combatContentPanel.setBackground(
				new Color(240 - GameScreen.currentHero.combat, 140 + GameScreen.currentHero.combat, 150));

		GameScreen.heroDetailScreen.skillContentLabel.setText(Integer.toString(GameScreen.currentHero.skill));
		skillContentPanel
				.setBackground(new Color(240 - GameScreen.currentHero.skill, 140 + GameScreen.currentHero.skill, 150));

		GameScreen.heroDetailScreen.intelligenceContentLabel
				.setText(Integer.toString(GameScreen.currentHero.intelligence));
		intelligenceContentPanel.setBackground(
				new Color(240 - GameScreen.currentHero.intelligence, 140 + GameScreen.currentHero.intelligence, 150));

		GameScreen.heroDetailScreen.personalityContentLabel
				.setText(Integer.toString(GameScreen.currentHero.personality));
		personalityContentPanel.setBackground(
				new Color(240 - GameScreen.currentHero.personality, 140 + GameScreen.currentHero.personality, 150));

		GameScreen.heroDetailScreen.relationOnePartnerLabel
		.setText("Partner");
		GameScreen.heroDetailScreen.relationOneTypeLabel
		.setText("Type");
		GameScreen.heroDetailScreen.relationOneIntensityLabel
		.setText(Integer.toString(0));
		
		if (GameScreen.currentHero.heroRelations.size() > 0) {

			GameScreen.heroDetailScreen.relationOnePartnerLabel
					.setText(GameScreen.currentHero.heroRelations.get(0).target.name);
			GameScreen.heroDetailScreen.relationOneTypeLabel
					.setText(GameScreen.currentHero.heroRelations.get(0).relationType);
			GameScreen.heroDetailScreen.relationOneIntensityLabel
					.setText(Integer.toString(GameScreen.currentHero.heroRelations.get(0).intensity));
		}

		int no = GameScreen.currentHero.value;
		String number = String.format("%,d", no);
		GameScreen.heroDetailScreen.valueAmountLabel.setText(number);

	}

}
