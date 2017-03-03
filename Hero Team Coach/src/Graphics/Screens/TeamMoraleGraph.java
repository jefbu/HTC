package Graphics.Screens;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

import Graphics.GameScreen;

public class TeamMoraleGraph extends JPanel {

		private static final long serialVersionUID = 1L;

		public TeamMoraleGraph() {

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
			g.drawString("Team Morale", 25, 15);
			g.setFont(new Font ("Serif", 0, 12));
			g.drawString("in the past five weeks", 35, 30);
			g.setColor(new Color(200 - GameScreen.teamMoraleminus4, 80 + GameScreen.teamMoraleminus4, 30));
			g.fillRect(25, 135 - GameScreen.teamMoraleminus4, 25, GameScreen.teamMoraleminus4);
			g.setColor(new Color(200 - GameScreen.teamMoraleminus3, 80 + GameScreen.teamMoraleminus3, 30));
			g.fillRect(51, 135 - GameScreen.teamMoraleminus3, 25, GameScreen.teamMoraleminus3);
			g.setColor(new Color(200 - GameScreen.teamMoraleminus2, 80 + GameScreen.teamMoraleminus2, 30));
			g.fillRect(77, 135 - GameScreen.teamMoraleminus2, 25, GameScreen.teamMoraleminus2);
			g.setColor(new Color(200 - GameScreen.teamMoraleminus1, 80 + GameScreen.teamMoraleminus1, 30));
			g.fillRect(103, 135 - GameScreen.teamMoraleminus1, 25, GameScreen.teamMoraleminus1);
			g.setColor(new Color(200 - GameScreen.teamMorale, 80 + GameScreen.teamMorale, 30));
			g.fillRect(129, 135 - GameScreen.teamMorale, 25, GameScreen.teamMorale);
			g.setColor(Color.DARK_GRAY);
			g.setFont(new Font("Serif", 1, 13));
			g.drawString(Integer.toString(GameScreen.teamMoraleminus4), 31, 130);
			g.drawString(Integer.toString(GameScreen.teamMoraleminus3), 57, 130);
			g.drawString(Integer.toString(GameScreen.teamMoraleminus2), 83, 130);
			g.drawString(Integer.toString(GameScreen.teamMoraleminus1), 109, 130);
			g.drawString(Integer.toString(GameScreen.teamMorale), 135, 130);


		}

	}



