package Graphics.Screens.Utility;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.Timer;

import Graphics.GameScreen;

public class TextRollerLabel extends JTextArea {
	
	public Timer timer;

	private static final long serialVersionUID = 1L;
	ActionListener outcomeAction;

	public TextRollerLabel() {

		super();
		setFont(new Font("Garamond", Font.BOLD, 18));
		setForeground(GameScreen.textColour);
		setMargin(new Insets(0, 10, 0, 5));
		setLineWrap(true);
		setWrapStyleWord(true);
		setOpaque(false);
		setEditable(false);
		setFocusable(false);
		setPreferredSize(new Dimension(1400, 250));

	}

	public void rollText(String input) {

		outcomeAction = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

					try {
						
						GameScreen.questScreen.textLabel.append(input.substring(GameScreen.runner, GameScreen.runner + 1));
						GameScreen.runner++;
						
					} 
					
					catch (Exception e1) {

						GameScreen.questScreen.textFinished = true;
						timer.stop();
						GameScreen.runner = 0;
						
					}
					
				}

		};

		timer = new Timer(15, outcomeAction);
		timer.start();

	}

}
