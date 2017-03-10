package Graphics.Screens;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import Graphics.GameScreen;
import Graphics.Screens.Utility.TextRollerLabel;

public class QuestInitiationScreen extends JPanel {

	private static final long serialVersionUID = 1L;
	JPanel centrePanel;
	TextRollerLabel textPanel;
	JButton advanceButton;
	
	
	public QuestInitiationScreen() {
		
		super();
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
		
		textPanel = new TextRollerLabel();
		textPanel.setPreferredSize(new Dimension (GameScreen.WIDTH / 4 * 3, GameScreen.HEIGHT / 4));
		textPanel.setBackground(GameScreen.smallPanel);
		textPanel.setBorder(new LineBorder(GameScreen.borderColor, 2, true));
		add(textPanel);
		
	}
	
	
	public void initiate() {	
		
		GameScreen.questInitiationScreen.setVisible(true);
		textPanel.setText(GameScreen.currentQuest.introduction);
		
		
		
	}
	
	

}
