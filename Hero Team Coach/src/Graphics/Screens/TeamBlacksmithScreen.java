package Graphics.Screens;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

import Entity.Hero;
import Entity.Role;
import Graphics.GameScreen;
import Graphics.Screens.Utility.WeaponInventoryPanel;
import Utility.TeamRoster;

public class TeamBlacksmithScreen extends TeamScreen {

	
	private static final long serialVersionUID = 1L;
	public Hero blacksmith;
	JPanel upperBlacksmithPanel;
	JLabel nameLabel;
	JLabel skillNumberLabel;
	JLabel combatNumberLabel;
	JLabel traitsLabel;
	
	public static boolean showWeapons;
	
	public WeaponInventoryPanel weaponInventoryPanel;

	
	public TeamBlacksmithScreen () {
		
		super();
		
		showWeapons = true;
		
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
			
				JLabel textLabel = new JLabel(" Your Current Blacksmith is");
				upperStringPanel.add(textLabel);
			
			upperPanel.add(upperStringPanel);
			
			upperBlacksmithPanel = new JPanel();
			upperBlacksmithPanel.setPreferredSize(new Dimension(350, 35));
			upperBlacksmithPanel.setBackground(GameScreen.backgroundColor);
			upperBlacksmithPanel.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
			upperBlacksmithPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 7));

				nameLabel = new JLabel();
				upperBlacksmithPanel.add(nameLabel);
			
			upperPanel.add(upperBlacksmithPanel);
			
			JPanel skillPanel = new JPanel();
			skillPanel.setPreferredSize(new Dimension(50, 35));
			skillPanel.setBackground(GameScreen.smallPanel);
			skillPanel.setBorder(new LineBorder(GameScreen.importantColor, 2, true));
			skillPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 7));
			
				JLabel skillLabel = new JLabel("SKL");
				skillPanel.add(skillLabel);
				
			upperPanel.add(skillPanel);
			
			JPanel skillNumberPanel = new JPanel();
			skillNumberPanel.setPreferredSize(new Dimension(50, 35));
			skillNumberPanel.setBackground(GameScreen.smallPanel);
			skillNumberPanel.setBorder(new LineBorder(GameScreen.importantColor, 2, true));
			skillNumberPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 7));
			
				skillNumberLabel = new JLabel();
				skillNumberPanel.add(skillNumberLabel);
				
			upperPanel.add(skillNumberPanel);
			
			JPanel combatPanel = new JPanel();
			combatPanel.setPreferredSize(new Dimension(50, 35));
			combatPanel.setBackground(GameScreen.smallPanel);
			combatPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 2, true));
			combatPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 7));
			
				JLabel combatLabel = new JLabel("COM");
				combatPanel.add(combatLabel);
				
			upperPanel.add(combatPanel);
			
			JPanel combatNumberPanel = new JPanel();
			combatNumberPanel.setPreferredSize(new Dimension(50, 35));
			combatNumberPanel.setBackground(GameScreen.smallPanel);
			combatNumberPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 2, true));
			combatNumberPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 7));
			
				combatNumberLabel = new JLabel();
				combatNumberPanel.add(combatNumberLabel);
				
			upperPanel.add(combatNumberPanel);
			
			JPanel traitsPanel = new JPanel();
			traitsPanel.setPreferredSize(new Dimension(50, 35));
			traitsPanel.setBackground(GameScreen.smallPanel);
			traitsPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 2, true));
			traitsPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 7));
			
				traitsLabel = new JLabel("Traits");
				traitsPanel.add(traitsLabel);
				
			upperPanel.add(traitsPanel);
			
			JPanel traitsNumberPanel = new JPanel();
			traitsNumberPanel.setPreferredSize(new Dimension(200, 35));
			traitsNumberPanel.setBackground(GameScreen.smallPanel);
			traitsNumberPanel.setBorder(new LineBorder(GameScreen.lessImportantColor, 2, true));
			traitsNumberPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 7));
				
			upperPanel.add(traitsNumberPanel);
			
		JPanel middlePanel = new JPanel();
		middlePanel.setPreferredSize(new Dimension(750, 155));
		middlePanel.setBackground(GameScreen.smallPanel);
		middlePanel.setBorder(new LineBorder(GameScreen.borderColor, 3, true));
		middlePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 5));
		
			JLabel workingOnLabel = new JLabel("<html>and is currently <br>working on: </html>");
			middlePanel.add(workingOnLabel);
			
		
			JPanel itemType = new JPanel();
			itemType.setPreferredSize(new Dimension (140, 140));
			itemType.setBackground(GameScreen.mediumColor);
			middlePanel.add(itemType);
			
				JLabel itemTypeLabel = new JLabel(imageLoader.loadImageIcon("/Images/Icons/armour.png"));
				itemTypeLabel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 110));
				itemType.add(itemTypeLabel);
				
					JLabel itemName = new JLabel("Medium Scale Armour");
					itemTypeLabel.add(itemName);
			
			JPanel material = new JPanel();
			material.setPreferredSize(new Dimension (140, 140));
			material.setBackground(GameScreen.mediumColor);
			middlePanel.add(material);
			
				JLabel materialLabel = new JLabel(imageLoader.loadImageIcon("/Images/Icons/gold.png"));
				materialLabel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 110));
				material.add(materialLabel);
				
					JLabel materialName = new JLabel("Gold");
					materialLabel.add(materialName);
			
			JPanel quality = new JPanel();
			quality.setPreferredSize(new Dimension (140, 140));
			quality.setBackground(GameScreen.mediumColor);
			middlePanel.add(quality);
			
				JLabel qualityLabel = new JLabel(imageLoader.loadImageIcon("/Images/Icons/4stars.png"));
				qualityLabel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 110));
				quality.add(qualityLabel);
				
					JLabel qualityName = new JLabel("Excellent");
					qualityLabel.add(qualityName);
		
		JPanel itemList = new JPanel();
		itemList.setPreferredSize(new Dimension(1050, 550));
		itemList.setBorder(new LineBorder(GameScreen.borderColor, 3, true));
		itemList.setBackground(GameScreen.mediumColor);
		itemList.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
			JPanel itemListTitle = new JPanel();
			itemListTitle.setPreferredSize(new Dimension(1030, 50));
			itemListTitle.setBackground(GameScreen.tableRow1);
			itemListTitle.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 3));
			itemListTitle.setBorder(new LineBorder(GameScreen.borderColor, 2, true));
			itemList.add(itemListTitle);
			
				JButton titleIcon = new JButton("img");
				titleIcon.setPreferredSize(new Dimension(60, 40));					
				itemListTitle.add(titleIcon);
				
				JButton nameIcon = new JButton("Name");
				nameIcon.setPreferredSize(new Dimension(150, 40));					
				itemListTitle.add(nameIcon);
				
				JButton typeIcon = new JButton("Type");
				typeIcon.setPreferredSize(new Dimension(100, 40));					
				itemListTitle.add(typeIcon);
				
				JButton materialIcon = new JButton("Material");
				materialIcon.setPreferredSize(new Dimension(100, 40));					
				itemListTitle.add(materialIcon);
				
				JButton qualityIcon = new JButton("Quality");
				qualityIcon.setPreferredSize(new Dimension(100, 40));					
				itemListTitle.add(qualityIcon);
				
				JButton combatIcon = new JButton("Com+");
				combatIcon.setPreferredSize(new Dimension(65, 40));					
				itemListTitle.add(combatIcon);
				
				JButton skillIcon = new JButton("Skl+");
				skillIcon.setPreferredSize(new Dimension(65, 40));					
				itemListTitle.add(skillIcon);
				
				JButton intelligenceIcon = new JButton("Int+");
				intelligenceIcon.setPreferredSize(new Dimension(65, 40));					
				itemListTitle.add(intelligenceIcon);
				
				JButton personalityIcon = new JButton("Per+");
				personalityIcon.setPreferredSize(new Dimension(65, 40));					
				itemListTitle.add(personalityIcon);
				
				JButton traitsIcon = new JButton("Traits");
				traitsIcon.setPreferredSize(new Dimension(180, 40));					
				itemListTitle.add(traitsIcon);
		
				weaponInventoryPanel = new WeaponInventoryPanel();
			
				
					
		JScrollPane scrollPane = new JScrollPane(weaponInventoryPanel);
		scrollPane.setPreferredSize(new Dimension(1030, 400));
		itemList.add(scrollPane);
		
		JButton showWeapons = new JButton("Weapons");
		showWeapons.setPreferredSize(new Dimension (140, 70));
		itemList.add(showWeapons);
		
			showWeapons.addActionListener(new ActionListener()
			{
				  public void actionPerformed(ActionEvent e)
				  {
					  TeamBlacksmithScreen.showWeapons = true;
					  weaponInventoryPanel.fillInventoryTable();
				  }
				});

		
		JButton showArmour = new JButton("Armour");
		showArmour.setPreferredSize(new Dimension (140, 70));
		itemList.add(showArmour);
		
			showArmour.addActionListener(new ActionListener()
			{
				  public void actionPerformed(ActionEvent e)
				  {
					  TeamBlacksmithScreen.showWeapons = false;
					  weaponInventoryPanel.fillInventoryTable();
				  }
				});


			
			
		centrePanel.add(upperPanel);
		centrePanel.add(middlePanel);
		centrePanel.add(itemList);
		
		fillBlacksmithScreen();
		
		
	}
	
	public void fillBlacksmithScreen() {
		
		for (int i = 0; i < TeamRoster.teamRosterList.size(); i++) {
			if (TeamRoster.teamRosterList.get(i).role == Role.blacksmith) {
				blacksmith = TeamRoster.teamRosterList.get(i);
			}
		}

		
		nameLabel.setText(blacksmith.name);
		skillNumberLabel.setText(Integer.toString(blacksmith.skill));
		combatNumberLabel.setText(Integer.toString(blacksmith.combat));
		messages.setText(Integer.toString(GameScreen.newMessages.size()));
		
		weaponInventoryPanel.fillInventoryTable();
		
	}
	
	
	
	
}
