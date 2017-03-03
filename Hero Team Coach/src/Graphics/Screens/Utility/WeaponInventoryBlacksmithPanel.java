package Graphics.Screens.Utility;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import Graphics.GameScreen;
import Utility.WeaponInventory;

public class WeaponInventoryBlacksmithPanel extends JPanel {
	

	private static final long serialVersionUID = 1L;

	public WeaponInventoryBlacksmithPanel() {
	
		super();
		int height = WeaponInventory.weaponInventoryList.size() * 50;
		setBackground(GameScreen.mediumColor);
		setPreferredSize(new Dimension (1010, height));
		setLayout(new FlowLayout(FlowLayout.LEFT, 5, 2));
		
		fillInventoryTable();
			
		}
		
		public void fillInventoryTable() {
	
		for (int i = 0; i < WeaponInventory.weaponInventoryList.size(); i++) {
		
		JPanel rowPanel = new JPanel();
		rowPanel.setPreferredSize(new Dimension(1000, 40));
		rowPanel.setBackground(GameScreen.tableRow1);
		rowPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 1, 0));
		add(rowPanel);
		
		JPanel iconPanel = new JPanel();
		iconPanel.setBackground(GameScreen.smallPanel);
		iconPanel.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		iconPanel.setPreferredSize(new Dimension (64, 36));
		rowPanel.add(iconPanel);
		
		JPanel namePanel = new JPanel();
		namePanel.setBackground(GameScreen.smallPanel);
		namePanel.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		namePanel.setPreferredSize(new Dimension (150, 36));
		rowPanel.add(namePanel);
		
			JLabel nameLabel = new JLabel();
			nameLabel.setText(WeaponInventory.weaponInventoryList.get(i).name);
			namePanel.add(nameLabel);
		
		JPanel typePanel = new JPanel();
		typePanel.setBackground(GameScreen.smallPanel);
		typePanel.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		typePanel.setPreferredSize(new Dimension (105, 36));
		rowPanel.add(typePanel);
		
			JLabel typeLabel = new JLabel();
			typeLabel.setText(WeaponInventory.weaponInventoryList.get(i).weaponType.name);
			typePanel.add(typeLabel);
		
		JPanel materialPanel = new JPanel();
		materialPanel.setBackground(GameScreen.smallPanel);
		materialPanel.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		materialPanel.setPreferredSize(new Dimension (105, 36));
		rowPanel.add(materialPanel);
		
			JLabel materialLabel = new JLabel();
			materialLabel.setText(WeaponInventory.weaponInventoryList.get(i).material.name);
			materialPanel.add(materialLabel);
		
		JPanel qualityPanel = new JPanel();
		qualityPanel.setBackground(GameScreen.smallPanel);
		qualityPanel.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		qualityPanel.setPreferredSize(new Dimension (105, 36));
		rowPanel.add(qualityPanel);
		
			JLabel qualityLabel = new JLabel();
			qualityLabel.setText(WeaponInventory.weaponInventoryList.get(i).quality.name);
			qualityPanel.add(qualityLabel);
		
		JPanel combatPanel = new JPanel();
		combatPanel.setBackground(GameScreen.smallPanel);
		combatPanel.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		combatPanel.setPreferredSize(new Dimension (69, 36));
		rowPanel.add(combatPanel);
		
			JLabel combatLabel = new JLabel();
			combatLabel.setText(Integer.toString(WeaponInventory.weaponInventoryList.get(i).combatBonus));
			combatPanel.add(combatLabel);
		
		JPanel skillPanel = new JPanel();
		skillPanel.setBackground(GameScreen.smallPanel);
		skillPanel.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		skillPanel.setPreferredSize(new Dimension (69, 36));
		rowPanel.add(skillPanel);
		
			JLabel skillLabel = new JLabel();
			skillLabel.setText(Integer.toString(WeaponInventory.weaponInventoryList.get(i).skillBonus));
			skillPanel.add(skillLabel);
		
		JPanel intelligencePanel = new JPanel();
		intelligencePanel.setBackground(GameScreen.smallPanel);
		intelligencePanel.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		intelligencePanel.setPreferredSize(new Dimension (69, 36));
		rowPanel.add(intelligencePanel);
		
			JLabel intelligenceLabel = new JLabel();
			intelligenceLabel.setText(Integer.toString(WeaponInventory.weaponInventoryList.get(i).intelligenceBonus));
			intelligencePanel.add(intelligenceLabel);
		
		JPanel personalityPanel = new JPanel();
		personalityPanel.setBackground(GameScreen.smallPanel);
		personalityPanel.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		personalityPanel.setPreferredSize(new Dimension (69, 36));
		rowPanel.add(personalityPanel);
		
			JLabel personalityLabel = new JLabel();
			personalityLabel.setText(Integer.toString(WeaponInventory.weaponInventoryList.get(i).personalityBonus));
			personalityPanel.add(personalityLabel);
		 
		JPanel traitsPanel = new JPanel();
		traitsPanel.setBackground(GameScreen.smallPanel);
		traitsPanel.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		traitsPanel.setPreferredSize(new Dimension (180, 36));
		rowPanel.add(traitsPanel);
		
		}
	
	

	
	
	
	}

}
