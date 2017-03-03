package Graphics.Screens;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Graphics.GameScreen;

public class OptionsScreen extends JPanel {
	
	String explained;

	private static final long serialVersionUID = 1L;

	public OptionsScreen() {
		
		super();
		
		explained = "<html>The number chosen here is used throughout the game.<br>"
				+ " Generally speaking, a higher number will make it slightly harder to get lucky heroes <br>"
				+ " (that is, heroes with good stats); will make them somewhat whinier and quicker to anger; <br>"
				+ " will make enemies slightly stronger and so on. <br>"
				+ "Consider anything between 1 and 30 to be easy, until 60 to be moderate and higher to be hard. </html>";

		GridBagConstraints c = new GridBagConstraints();
		setLayout(new GridBagLayout());
		setPreferredSize(new Dimension(800, 900));
		setBackground(GameScreen.mediumColor);
		c.anchor = GridBagConstraints.BASELINE;
		c.insets = new Insets(0,5,10,5);
		
		c.gridx = 0;
		c.gridy = 0;
		JLabel chooseDifficulty = new JLabel("Difficulty");
		add(chooseDifficulty, c);
		
		c.gridx = 0;
		c.gridy = 1;
		JPanel upperPanel = new JPanel();
		upperPanel.setPreferredSize(new Dimension (300, 40));
		upperPanel.setLayout(new FlowLayout());
		upperPanel.setBackground(GameScreen.backgroundColor);
		
		
			JLabel title = new JLabel("Choose a number from 1 to 100");
			title.setFont(new Font("Serif", Font.BOLD, 18));
			upperPanel.add(title);
			
		add(upperPanel, c);
		
		c.gridx = 0;
		c.gridy = 2;
		JTextField difficulty = new JTextField();
		difficulty.setPreferredSize(new Dimension (30, 20));
		
			difficulty.addActionListener(new ActionListener(){

			   public void actionPerformed(ActionEvent ev){
				  GameScreen.difficulty = Integer.parseInt(difficulty.getText());
			   }
			 });
			
		add(difficulty, c);
		
		c.gridx = 0;
		c.gridy = 3;
		JLabel explanation = new JLabel(explained);
		explanation.setPreferredSize(new Dimension (600, 200));
		add(explanation, c);
		
		
	}
	
	
	
	
	
	

}
