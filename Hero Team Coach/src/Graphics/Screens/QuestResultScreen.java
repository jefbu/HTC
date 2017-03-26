package Graphics.Screens;

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

public class QuestResultScreen extends JPanel {

	private static final long serialVersionUID = 1;
	
	Timer timer;
	ActionListener outcomeAction;
	
	JTextArea textArea;

	JButton advanceButton;
	
	String output;
	
	public QuestResultScreen() {
			
		super();
		setPreferredSize(new Dimension(GameScreen.WIDTH, GameScreen.HEIGHT));
		setBackground(GameScreen.mediumColor);
		setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
		
		JPanel textAreaPanel = new JPanel();
		textAreaPanel.setBackground(GameScreen.smallPanel);
		textAreaPanel.setPreferredSize(new Dimension (GameScreen.WIDTH / 2, GameScreen.HEIGHT - 100));
		textAreaPanel.setBorder(new LineBorder(GameScreen.borderColor, 3, false));
			
			textArea = new JTextArea();
			textArea.setPreferredSize(new Dimension ((GameScreen.WIDTH / 2) - 30, (GameScreen.HEIGHT - 130)));
			textArea.setBackground(GameScreen.smallPanel);
			textArea.setFont(new Font("Garamond", Font.BOLD, 18));
			textArea.setForeground(GameScreen.textColour);
			textArea.setMargin(new Insets(0, 10, 0, 5));
			textArea.setLineWrap(true);
			textArea.setWrapStyleWord(true);
			textArea.setOpaque(false);
			textArea.setEditable(false);
			textArea.setFocusable(false);
			textAreaPanel.add(textArea);
			
		add(textAreaPanel);
		
		advanceButton = new JButton();
		advanceButton.setPreferredSize(new Dimension(100, 50));
		add(advanceButton);
		
		
	}
	
	
	
	
	public void fillScreen() {
		
		
		output = "For better or for worse, here are the results of the quest: \n \n";
		
		for (int i = 0; i < GameScreen.questers.size(); i++) {

			GameScreen.questers.get(i).levelUp();
			GameScreen.questers.get(i).value = GameScreen.questers.get(i).calculateValue();

		} 

		rollText(output, textArea);
		
	}
	
	
	
	
	public void rollText(String input, JTextArea textArea) {

		outcomeAction = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

					try {
						
						textArea.append(input.substring(GameScreen.runner, GameScreen.runner + 1));
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

	
	


