package Graphics.Screens;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.Timer;
import javax.swing.border.LineBorder;

import Graphics.GameScreen;

public class QuestInitiationScreen extends JPanel {

	private static final long serialVersionUID = 1L;
	JPanel centrePanel;
	JTextArea textArea;
	JButton advanceButton;
	Timer initiationTimer;
	ActionListener outcomeAction;
	public boolean textFinished;
	
	
	public QuestInitiationScreen() {
		
		super();
		
		textFinished = false;
		
		setPreferredSize(new Dimension(GameScreen.WIDTH, GameScreen.HEIGHT));
		setBackground(GameScreen.mediumColor);
		setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
		
		JPanel emptyTopPanel = new JPanel();
		emptyTopPanel.setPreferredSize(new Dimension(GameScreen.WIDTH, GameScreen.HEIGHT/20));
		emptyTopPanel.setBackground(GameScreen.mediumColor);
		add(emptyTopPanel);
		
		centrePanel = new JPanel();
		centrePanel.setPreferredSize(new Dimension(GameScreen.WIDTH/2, GameScreen.HEIGHT/2));
		centrePanel.setBackground(Color.BLACK);
		add(centrePanel);
		
		advanceButton = new JButton("ADVANCE");
		advanceButton.setPreferredSize(new Dimension (200, 100));
		add(advanceButton);
		
			advanceButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if (textFinished == true) {
					
					initiationTimer.stop();
					GameScreen.runner = 0;
					GameScreen.questScreen.initiate();
					
				} else {
					initiationTimer.setDelay(0);
				}
				}
			});;
		
		JPanel textPanel = new JPanel();
		textPanel.setPreferredSize(new Dimension (GameScreen.WIDTH / 4 * 3, GameScreen.HEIGHT / 4));
		textPanel.setBackground(GameScreen.smallPanel);
		textPanel.setBorder(new LineBorder(GameScreen.borderColor, 2, true));		
		
			textArea = new JTextArea();
			textArea.setPreferredSize(new Dimension(GameScreen.WIDTH / 3 * 2, GameScreen.HEIGHT / 3 * 2));
			textArea.setFont(new Font("Garamond", Font.BOLD, 18));
			textArea.setForeground(GameScreen.textColour);
			textArea.setMargin(new Insets(0, 10, 0, 5));
			textArea.setLineWrap(true);
			textArea.setWrapStyleWord(true);
			textArea.setOpaque(false);
			textArea.setEditable(false);
			textArea.setFocusable(false);
			textPanel.add(textArea);

		add(textPanel);
		
	}
	
	
	public void initiate() {	
		
		textArea.setText("");
		GameScreen.runner = 0;
		GameScreen.questSequence = 0;
		textFinished = false;
		GameScreen.questInitiationScreen.setVisible(true);
		rollInitialText(GameScreen.currentQuest.introduction, textArea);		
		
	}

	
	public void rollInitialText(String input, JTextArea textArea) {

		outcomeAction = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

					try {
						
						textArea.append(input.substring(GameScreen.runner, GameScreen.runner + 1));
						GameScreen.runner++;
						
					} 
					
					catch (Exception e1) {

						textFinished = true;
						initiationTimer.stop();
						GameScreen.runner = 0;
						
					}
					
				}

		};

		initiationTimer = new Timer(15, outcomeAction);
		initiationTimer.start();

	}

}
