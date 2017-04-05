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
	
	Timer resultTimer;
	ActionListener outcomeAction;
	
	JTextArea textResultArea;

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
			
			textResultArea = new JTextArea();
			textResultArea.setPreferredSize(new Dimension ((GameScreen.WIDTH / 2) - 30, (GameScreen.HEIGHT - 130)));
			textResultArea.setBackground(GameScreen.smallPanel);
			textResultArea.setFont(new Font("Garamond", Font.BOLD, 18));
			textResultArea.setForeground(GameScreen.textColour);
			textResultArea.setMargin(new Insets(0, 10, 0, 5));
			textResultArea.setLineWrap(true);
			textResultArea.setWrapStyleWord(true);
			textResultArea.setOpaque(false);
			textResultArea.setEditable(false);
			textResultArea.setFocusable(false);
			textAreaPanel.add(textResultArea);
			
		add(textAreaPanel);
		
		advanceButton = new JButton();
		advanceButton.setPreferredSize(new Dimension(100, 50));
		
			advanceButton.addActionListener(new ActionListener() {
				
				public void actionPerformed (ActionEvent e) {
					rollResultText(output, textResultArea);
				}
				
			});
		
		add(advanceButton);
		
		
	}
	
	
	
	
	public void fillScreen() {
		
		GameScreen.questSequence = 0;
		
		int[] heroInt = new int[30];
		
		for (int i = 0; i < GameScreen.questers.size(); i++) {
			
			heroInt[i * 5] = GameScreen.questers.get(i).maturity;
			heroInt[i * 5 +1] = GameScreen.questers.get(i).combat;
			heroInt[i * 5 +2] = GameScreen.questers.get(i).skill;
			heroInt[i * 5 +3] = GameScreen.questers.get(i).intelligence;
			heroInt[i * 5 +4] = GameScreen.questers.get(i).personality;
			
		}
				
		output = "For better or for worse, here are the results of the quest: \n \n";
		
		for (int i = 0; i < GameScreen.questers.size(); i++) {

			GameScreen.questers.get(i).levelUp();
			GameScreen.questers.get(i).value = GameScreen.questers.get(i).calculateValue();
			
			if (GameScreen.questers.get(i).maturity > heroInt[i * 5]) {
				output = output + GameScreen.questers.get(i).name + " progressed on the road to wisdom \n";
			}
			
			if (GameScreen.questers.get(i).combat > heroInt[i * 5 + 1]) {
				output = output + GameScreen.questers.get(i).name + " has achieved increased combat prowess \n";
			}
			
			if (GameScreen.questers.get(i).skill > heroInt[i * 5 + 2]) {
				output = output + GameScreen.questers.get(i).name + " climbed onto the next rung of the skill ladder \n";
			}
			
			if (GameScreen.questers.get(i).intelligence > heroInt[i * 5 + 3]) {
				output = output + GameScreen.questers.get(i).name + " expanded their mental acumen \n";
			}
			
			if (GameScreen.questers.get(i).personality > heroInt[i * 5 + 4]) {
				output = output + GameScreen.questers.get(i).name + " leaves all onlookers more awestruck than before \n";
			}

		} 

		GameScreen.runner = 0;
		
	}
	
	
	
	
	public void rollResultText(String input, JTextArea textResultArea) {
		
		outcomeAction = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

					try {
						
						textResultArea.append(input.substring(GameScreen.runner, GameScreen.runner + 1));
						GameScreen.runner++;
						
					} 
					
					catch (Exception e1) {

						//GameScreen.questScreen.textFinished = true;
						resultTimer.stop();
						GameScreen.runner = 0;
						
					}
					
				}

		};

		resultTimer = new Timer(15, outcomeAction);
		//resultTimer.setInitialDelay(5000);
		resultTimer.start();
		

	}

}

	
	


