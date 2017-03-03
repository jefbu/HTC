package Graphics.Screens.Utility;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Entity.Message;
import Graphics.GameScreen;

public class DialogButton extends JButton {

	private static final long serialVersionUID = 1L;
	
	public DialogButton(Message message, int index) {
		
		super();
		setText(message.title.text);
		setPreferredSize(new Dimension (530,50));
		setContentAreaFilled(false);
		
			addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
		
					GameScreen.messageDialog.dialogFill(message);
					message.messageOutcome(message.situation);
					GameScreen.oldMessages.add(message);
					GameScreen.newMessages.remove(index);
					GameScreen.messagesScreen.messagesScreenFill();
					GameScreen.messageDialog.setVisible(true);
					
				}
				
				
			});
		
	}
	
	

}
