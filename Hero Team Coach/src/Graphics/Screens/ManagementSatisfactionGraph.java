package Graphics.Screens;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

import Graphics.GameScreen;

public class ManagementSatisfactionGraph extends JPanel {

	private static final long serialVersionUID = 1L;

	public ManagementSatisfactionGraph() {

		super();
		setPreferredSize(new Dimension(175, 150));
		setBackground(GameScreen.mediumColor);

	}

	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		g.setColor(GameScreen.backgroundColor);
		g.fillRect(0, 0, 175, 150);
		g.setColor(GameScreen.borderColor);
		g.fillRect(15, 30, 5, 115);
		g.fillRect(10, 135, 150, 5);
		g.setColor(Color.BLACK);
		g.setFont(new Font ("Serif", 1, 13));
		g.drawString("Management Satisfaction", 25, 15);
		g.setFont(new Font ("Serif", 0, 12));
		g.drawString("in the past five weeks", 35, 30);
		g.setColor(new Color(200 - GameScreen.managementSatisfactionminus4, 80 + GameScreen.managementSatisfactionminus4, 30));
		g.fillRect(25, 135 - GameScreen.managementSatisfactionminus4, 25, GameScreen.managementSatisfactionminus4);
		g.setColor(new Color(200 - GameScreen.managementSatisfactionminus3, 80 + GameScreen.managementSatisfactionminus3, 30));
		g.fillRect(51, 135 - GameScreen.managementSatisfactionminus3, 25, GameScreen.managementSatisfactionminus3);
		g.setColor(new Color(200 - GameScreen.managementSatisfactionminus2, 80 + GameScreen.managementSatisfactionminus2, 30));
		g.fillRect(77, 135 - GameScreen.managementSatisfactionminus2, 25, GameScreen.managementSatisfactionminus2);
		g.setColor(new Color(200 - GameScreen.managementSatisfactionminus1, 80 + GameScreen.managementSatisfactionminus1, 30));
		g.fillRect(103, 135 - GameScreen.managementSatisfactionminus1, 25, GameScreen.managementSatisfactionminus1);
		g.setColor(new Color(200 - GameScreen.managementSatisfaction, 80 + GameScreen.managementSatisfaction, 30));
		g.fillRect(129, 135 - GameScreen.managementSatisfaction, 25, GameScreen.managementSatisfaction);
		g.setColor(Color.DARK_GRAY);
		g.setFont(new Font("Serif", 1, 13));
		g.drawString(Integer.toString(GameScreen.managementSatisfactionminus4), 31, 130);
		g.drawString(Integer.toString(GameScreen.managementSatisfactionminus3), 57, 130);
		g.drawString(Integer.toString(GameScreen.managementSatisfactionminus2), 83, 130);
		g.drawString(Integer.toString(GameScreen.managementSatisfactionminus1), 109, 130);
		g.drawString(Integer.toString(GameScreen.managementSatisfaction), 135, 130);


	}

}
	
