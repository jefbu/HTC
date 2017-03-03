package Graphics.Screens.Utility;

import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Entity.Message;
import Graphics.GameScreen;

public class MessageDialog extends JDialog {

	private static final long serialVersionUID = 1L;

	JDialog messageDialog;
	JPanel messageDialogPanel;
	JPanel messageDialogMainPortraitPanel;
	JPanel messageDialogAuthorPanel;
	JLabel messageDialogAuthorLabel;
	JPanel messageDialogPortraitPanel;
	JLabel messageDialogPortraitLabel;
	JPanel messageDialogEmptyPanel;
	JPanel messageDialogMainPanel;
	JPanel messageDialogTitlePanel;
	JLabel messageDialogTitleLabel;
	JPanel messageDialogMessagePanel;
	JLabel messageDialogMessageLabel;
	JPanel messageDialogEffectsPanel;
	JLabel messageDialogEffectsLabel;
	JButton returnButton;
	
	JPanel emptySpacePanel;
	
	
	public MessageDialog() {
		
		super(null, Dialog.ModalityType.APPLICATION_MODAL);
		setUndecorated(true);
		setSize(new Dimension (700, 400));
		
			messageDialogPanel = new JPanel();
			messageDialogPanel.setPreferredSize(new Dimension(700, 400));
			messageDialogPanel.setBackground(GameScreen.smallPanel);
			messageDialogPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
			setContentPane(messageDialogPanel);
			
				messageDialogMainPortraitPanel = new JPanel();
				messageDialogMainPortraitPanel.setPreferredSize(new Dimension (260, 350));
				messageDialogMainPortraitPanel.setBackground(GameScreen.lessImportantColor);
				messageDialogMainPortraitPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
				messageDialogPanel.add(messageDialogMainPortraitPanel);
				
				messageDialogMainPanel = new JPanel();
				messageDialogMainPanel.setPreferredSize(new Dimension (440, 350));
				messageDialogMainPanel.setBackground(GameScreen.lessImportantColor);
				messageDialogMainPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
				messageDialogPanel.add(messageDialogMainPanel);
				
				returnButton = new JButton();
				returnButton.setPreferredSize(new Dimension (700, 50));
				messageDialogPanel.add(returnButton);
				
					returnButton.addActionListener(new ActionListener() {
						public void actionPerformed (ActionEvent e) {
							setVisible(false);
						}		
					});

				
					messageDialogAuthorPanel = new JPanel();
					messageDialogAuthorPanel.setPreferredSize(new Dimension (260, 45));
					messageDialogAuthorPanel.setBackground(GameScreen.mediumColor);
					messageDialogAuthorPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
					messageDialogMainPortraitPanel.add(messageDialogAuthorPanel);
					
						messageDialogAuthorLabel = new JLabel();
						messageDialogAuthorPanel.add(messageDialogAuthorLabel);
					
					messageDialogPortraitPanel = new JPanel();
					messageDialogPortraitPanel.setPreferredSize(new Dimension (260, 260));
					messageDialogPortraitPanel.setBackground(GameScreen.mediumColor);
					messageDialogMainPortraitPanel.add(messageDialogPortraitPanel);
					
						messageDialogPortraitLabel = new JLabel();
						messageDialogPortraitPanel.add(messageDialogPortraitLabel);
					
					emptySpacePanel = new JPanel();
					emptySpacePanel.setPreferredSize(new Dimension(260, 45));
					emptySpacePanel.setBackground(GameScreen.mediumColor);
					messageDialogMainPortraitPanel.add(emptySpacePanel);
			
					messageDialogTitlePanel = new JPanel();
					messageDialogTitlePanel.setPreferredSize(new Dimension(440, 45));
					messageDialogTitlePanel.setBackground(GameScreen.mediumColor);
					messageDialogMainPanel.add(messageDialogTitlePanel);
					
						messageDialogTitleLabel = new JLabel();
						messageDialogTitlePanel.add(messageDialogTitleLabel);
						
					messageDialogMessagePanel = new JPanel();
					messageDialogMessagePanel.setPreferredSize(new Dimension (440, 260));
					messageDialogMessagePanel.setBackground(GameScreen.mediumColor);
					messageDialogMainPanel.add(messageDialogMessagePanel);
					
						messageDialogMessageLabel = new JLabel();
						messageDialogMessagePanel.add(messageDialogMessageLabel);
					
					messageDialogEffectsPanel = new JPanel();
					messageDialogEffectsPanel.setPreferredSize(new Dimension (440, 45));
					messageDialogEffectsPanel.setBackground(GameScreen.mediumColor);
					messageDialogMainPanel.add(messageDialogEffectsPanel);	
					
						messageDialogEffectsLabel = new JLabel();
						messageDialogEffectsPanel.add(messageDialogEffectsLabel);
			
		
	}
	
	
	public void dialogFill(Message message) {
		

		messageDialogAuthorLabel.setText(message.author.name);
		messageDialogPortraitLabel.setIcon(message.author.portrait);
		messageDialogTitleLabel.setText(message.title.text);
		messageDialogMessageLabel.setText(message.greeting.text + message.content.text);
		messageDialogEffectsPanel.setBackground(message.effectPanelColor);
		messageDialogEffectsLabel.setText(message.effectString);

		
	}
	
	
	

}
