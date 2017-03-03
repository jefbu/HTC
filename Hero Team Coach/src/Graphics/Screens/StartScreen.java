package Graphics.Screens;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Graphics.GameScreen;
import Graphics.ImageLoader;

public class StartScreen extends JPanel {

	private static final long serialVersionUID = 1L;
	GridBagConstraints c;
	ImageLoader imageLoader;
	public JButton startButton;

	public StartScreen() {

		super();
		setPreferredSize(new Dimension(GameScreen.WIDTH, GameScreen.HEIGHT));
		setBackground(GameScreen.backgroundColor);
		setLayout(new GridBagLayout());

		imageLoader = new ImageLoader();

		c = new GridBagConstraints();
		c.anchor = GridBagConstraints.FIRST_LINE_START;
		c.fill = GridBagConstraints.BOTH;
		c.insets = new Insets(0, 0, 3, 0);

		c.gridx = 0;
		c.gridy = 0;
		JPanel upperPanel = new JPanel();
		upperPanel.setPreferredSize(new Dimension(GameScreen.WIDTH * 9 / 10, GameScreen.HEIGHT * 9 / 10 / 3));
		upperPanel.setBackground(GameScreen.mediumColor);

			JLabel upperPanelLabel = new JLabel(imageLoader.loadImageIcon("/Images/upperstartscreen.png"),
					JLabel.CENTER);
			upperPanel.add(upperPanelLabel);

		add(upperPanel, c);

		c.gridy = 1;
		JPanel middlePanel = new JPanel();
		middlePanel.setPreferredSize(new Dimension(GameScreen.WIDTH * 9 / 10, GameScreen.HEIGHT * 9 / 10 / 3));
		middlePanel.setBackground(GameScreen.mediumColor);
		middlePanel.setLayout(new FlowLayout());

			JLabel middlePanelLabel = new JLabel(
					imageLoader.loadImageIcon("/Images/middlestartscreen.png"), JLabel.CENTER);
			middlePanelLabel.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));

				startButton = new JButton("START");
				startButton.setPreferredSize(new Dimension(GameScreen.WIDTH / 10, GameScreen.HEIGHT / 10));
				middlePanelLabel.add(startButton);
				
					startButton.addActionListener(new ActionListener()
					{
					  public void actionPerformed(ActionEvent e)
					  {
					    setVisible(false);
					    GameScreen.teamOverviewScreen.setVisible(true);
					  }
					});
								
				JButton loadButton = new JButton("LOAD");
				loadButton.setPreferredSize(new Dimension(GameScreen.WIDTH / 10, GameScreen.HEIGHT / 10));
				middlePanelLabel.add(loadButton);
				
				JButton optionsButton = new JButton("OPTIONS");
				optionsButton.setPreferredSize(new Dimension(GameScreen.WIDTH / 10, GameScreen.HEIGHT / 10));
				middlePanelLabel.add(optionsButton);
				
					optionsButton.addActionListener(new ActionListener()
					{
					  public void actionPerformed(ActionEvent e)
					  {
					    setVisible(false);
					    GameScreen.optionsScreen.setVisible(true);
					  }
					});
		
				JButton creditsButton = new JButton("CREDITS");
				creditsButton.setPreferredSize(new Dimension(GameScreen.WIDTH / 10, GameScreen.HEIGHT / 10));
				middlePanelLabel.add(creditsButton);

			middlePanel.add(middlePanelLabel);

		add(middlePanel, c);

		c.gridy = 2;
		JPanel lowerPanel = new JPanel ();
		lowerPanel.setPreferredSize(new Dimension(GameScreen.WIDTH * 9 / 10, GameScreen.HEIGHT * 9 / 10 / 3));
		lowerPanel.setBackground(GameScreen.mediumColor);
			
			JLabel lowerPanelLabel = new JLabel(imageLoader.loadImageIcon("/Images/lowerstartscreen.png"),
					JLabel.CENTER);
			lowerPanel.add(lowerPanelLabel);
		
		
		add(lowerPanel, c);

		setVisible(false);

	}

}
