package Graphics.Screens;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

import Graphics.GameScreen;

public class CustomerSatisfactionGraph extends JPanel {

	private static final long serialVersionUID = 1L;

	public CustomerSatisfactionGraph() {

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
		g.drawString("Customer Satisfaction", 25, 15);
		g.setFont(new Font ("Serif", 0, 12));
		g.drawString("in the past five weeks", 35, 30);
		g.setColor(new Color(200 - GameScreen.customerSatisfactionMinus4, 80 + GameScreen.customerSatisfactionMinus4, 30));
		g.fillRect(25, 135 - GameScreen.customerSatisfactionMinus4, 25, GameScreen.customerSatisfactionMinus4);
		g.setColor(new Color(200 - GameScreen.customerSatisfactionminus3, 80 + GameScreen.customerSatisfactionminus3, 30));
		g.fillRect(51, 135 - GameScreen.customerSatisfactionminus3, 25, GameScreen.customerSatisfactionminus3);
		g.setColor(new Color(200 - GameScreen.customerSatisfactionminus2, 80 + GameScreen.customerSatisfactionminus2, 30));
		g.fillRect(77, 135 - GameScreen.customerSatisfactionminus2, 25, GameScreen.customerSatisfactionminus2);
		g.setColor(new Color(200 - GameScreen.customerSatisfactionminus1, 80 + GameScreen.customerSatisfactionminus1, 30));
		g.fillRect(103, 135 - GameScreen.customerSatisfactionminus1, 25, GameScreen.customerSatisfactionminus1);
		g.setColor(new Color(200 - GameScreen.customerSatisfaction, 80 + GameScreen.customerSatisfaction, 30));
		g.fillRect(129, 135 - GameScreen.customerSatisfaction, 25, GameScreen.customerSatisfaction);
		g.setColor(Color.DARK_GRAY);
		g.setFont(new Font("Serif", 1, 13));
		g.drawString(Integer.toString(GameScreen.customerSatisfactionMinus4), 31, 130);
		g.drawString(Integer.toString(GameScreen.customerSatisfactionminus3), 57, 130);
		g.drawString(Integer.toString(GameScreen.customerSatisfactionminus2), 83, 130);
		g.drawString(Integer.toString(GameScreen.customerSatisfactionminus1), 109, 130);
		g.drawString(Integer.toString(GameScreen.customerSatisfaction), 135, 130);


	}

}
