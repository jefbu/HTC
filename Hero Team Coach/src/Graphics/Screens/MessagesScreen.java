package Graphics.Screens;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

import Entity.Message;
import Graphics.GameScreen;
import Graphics.ImageLoader;
import Graphics.Screens.Utility.DialogButton;
import Utility.MessageFactory;

public class MessagesScreen extends TeamScreen {
	

	private static final long serialVersionUID = 1L;
	
	JPanel titlePanel;
	JLabel titleLabel;
	JScrollPane scrollPane;
	JPanel messageArchivePanel;
	JScrollPane archiveScrollPane;
	JPanel emptySpacePanel;
	JPanel titlePanel2;
	JLabel titleLabel2;
	int messageLogPanelHeight;
	int messageArchivePanelHeight;
	JPanel messageLogPanel;
	JButton deleteButton;
	JButton deleteArchivedButton;
	
	ImageIcon checkbox;
	ImageIcon checkedbox;
	ImageLoader imageLoader;
	
	MessageFactory messageFactory;
	Message currentMessage;
	
	boolean selectYes = true;
	



	
	public MessagesScreen() {
		
		super();
		
		imageLoader = new ImageLoader();
		messageFactory = new MessageFactory();
		checkbox = new ImageIcon();
		checkedbox = new ImageIcon();
		
		checkbox = imageLoader.loadImageIcon("/Images/Icons/checkbox.png");
		checkedbox = imageLoader.loadImageIcon("/Images/Icons/checkedbox.png");
		
		titlePanel = new JPanel();
		titlePanel.setPreferredSize(new Dimension( 1000, 50));
		titlePanel.setBackground(GameScreen.smallPanel);
		titlePanel.setBorder(new LineBorder(GameScreen.borderColor, 3, true));
		titlePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 10));
		centrePanel.add(titlePanel);
		
			titleLabel = new JLabel();
			titlePanel.add(titleLabel);
		
		messageLogPanel = new JPanel();
		messageLogPanelHeight = GameScreen.newMessages.size() * 55 + 60;
		messageLogPanel.setPreferredSize(new Dimension(880, messageLogPanelHeight));
		messageLogPanel.setBackground(GameScreen.backgroundColor);
		
		scrollPane = new JScrollPane(messageLogPanel);
		scrollPane.setPreferredSize(new Dimension(950, 275));
		centrePanel.add(scrollPane);
		
		deleteButton = new JButton("Mark all messages as read");
		deleteButton.setPreferredSize(new Dimension(600, 50));
		centrePanel.add(deleteButton);
		
			deleteButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					for (int i = 0; i < GameScreen.newMessages.size(); i++) {
						GameScreen.oldMessages.add(GameScreen.newMessages.get(i));
					}
					GameScreen.newMessages.clear();
					messages.setText(Integer.toString(GameScreen.newMessages.size()));
					messagesScreenFill();
					
				}					
			});
		
		
		emptySpacePanel = new JPanel();
		emptySpacePanel.setPreferredSize(new Dimension (880, 20));
		emptySpacePanel.setBackground(GameScreen.mediumColor);
		centrePanel.add(emptySpacePanel);
		
		titlePanel2 = new JPanel();
		titlePanel2.setPreferredSize(new Dimension( 1000, 50));
		titlePanel2.setBackground(GameScreen.smallPanel);
		titlePanel2.setBorder(new LineBorder(GameScreen.borderColor, 3, true));
		titlePanel2.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 10));
		centrePanel.add(titlePanel2);
		
			titleLabel2 = new JLabel();
			titlePanel2.add(titleLabel2);
		
		messageArchivePanel = new JPanel();
		messageArchivePanelHeight = GameScreen.oldMessages.size() * 50;
		messageArchivePanel.setPreferredSize(new Dimension(880, messageArchivePanelHeight));
		messageArchivePanel.setBackground(GameScreen.backgroundColor);
		
		archiveScrollPane = new JScrollPane(messageArchivePanel);
		archiveScrollPane.setPreferredSize(new Dimension (950, 225));
		centrePanel.add(archiveScrollPane);
		
		deleteArchivedButton = new JButton("Permanently shred all archived messages");
		deleteArchivedButton.setPreferredSize(new Dimension(600, 50));
		centrePanel.add(deleteArchivedButton);
		
		
		messagesScreenFill();
		
	}
	
	
	public void messagesScreenFill() {
		
		messageLogPanel.removeAll();
		messageLogPanel.repaint();
		messageLogPanel.revalidate();
		messageArchivePanel.removeAll();
		messageArchivePanel.repaint();
		messageArchivePanel.revalidate();
		
		messageLogPanelHeight = GameScreen.newMessages.size() * 55 + 60;
		messageLogPanel.setPreferredSize(new Dimension(880, messageLogPanelHeight));
		
		if (GameScreen.newMessages.size() > 0) {
			titleLabel.setText("As you open your inbox, you notice the following new messages");
		}
		else titleLabel.setText("There are currently no new messages");
		
		if (GameScreen.oldMessages.size() > 0) {
			titleLabel2.setText("Here are your old, archived messages"); 
		}
		else titleLabel2.setText("You haven't got any archived messages");
		
		JPanel numberPanel = new JPanel();
		numberPanel.setPreferredSize(new Dimension (120, 50));
		numberPanel.setBackground(GameScreen.mediumColor);
		numberPanel.setBorder(new LineBorder(GameScreen.borderColor, 2, true));
		numberPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 16));
		messageLogPanel.add(numberPanel);
		
			JLabel numberLabel = new JLabel();
			numberLabel.setText("Nr");
			numberPanel.add(numberLabel);
			
		JPanel authorPanel = new JPanel();
		authorPanel.setPreferredSize(new Dimension (250, 50));
		authorPanel.setBackground(GameScreen.mediumColor);
		authorPanel.setBorder(new LineBorder(GameScreen.borderColor, 2, true));
		authorPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 16));
		messageLogPanel.add(authorPanel);

			JLabel authorLabel = new JLabel();
			authorLabel.setText("Message Author");
			authorPanel.add(authorLabel);
			
		JPanel titlePanel = new JPanel();
		titlePanel.setPreferredSize(new Dimension(530, 50));
		titlePanel.setBackground(GameScreen.mediumColor);
		titlePanel.setBorder(new LineBorder(GameScreen.borderColor, 2, true));
		titlePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 16));
		messageLogPanel.add(titlePanel);
		
			JLabel titleLabel = new JLabel();
			titleLabel.setText("Message Description");
			titlePanel.add(titleLabel);
			

		
		for (int i = 0; i < GameScreen.newMessages.size(); i++) {
			
			int index = i;
			
			JPanel nrPanel = new JPanel();
			nrPanel.setPreferredSize(new Dimension(120, 50));
			nrPanel.setBackground(GameScreen.smallPanel);
			nrPanel.setBorder(new LineBorder(GameScreen.borderColor, 3, true));
			nrPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 15));
			messageLogPanel.add(nrPanel);
				
				JLabel nrLabel = new JLabel();
				nrLabel.setText(Integer.toString(i + 1));
				nrPanel.add(nrLabel);
				
			JPanel authorContentPanel = new JPanel();
			authorContentPanel.setPreferredSize(new Dimension(250, 50));
			authorContentPanel.setBackground(GameScreen.smallPanel);
			authorContentPanel.setBorder(new LineBorder(GameScreen.borderColor, 3, true));
			authorContentPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 15));
			messageLogPanel.add(authorContentPanel);
			
				JLabel authorContentLabel = new JLabel();
				authorContentLabel.setText(GameScreen.newMessages.get(i).author.name);
				authorContentPanel.add(authorContentLabel);
				
			JPanel titleContentPanel = new JPanel();
			titleContentPanel.setPreferredSize(new Dimension(530, 50));
			titleContentPanel.setBackground(GameScreen.smallPanel);
			titleContentPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
			messageLogPanel.add(titleContentPanel);
			
				DialogButton dialogButton = new DialogButton(GameScreen.newMessages.get(i), index);
				titleContentPanel.add(dialogButton);
			
		}
		
		
		JPanel numberArchivePanel = new JPanel();
		numberArchivePanel.setPreferredSize(new Dimension (120, 50));
		numberArchivePanel.setBackground(GameScreen.mediumColor);
		numberArchivePanel.setBorder(new LineBorder(GameScreen.borderColor, 2, true));
		numberArchivePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 16));
		messageArchivePanel.add(numberArchivePanel);
		
			JLabel numberArchiveLabel = new JLabel();
			numberArchiveLabel.setText("Nr");
			numberArchivePanel.add(numberArchiveLabel);
			
		JPanel authorArchivePanel = new JPanel();
		authorArchivePanel.setPreferredSize(new Dimension (250, 50));
		authorArchivePanel.setBackground(GameScreen.mediumColor);
		authorArchivePanel.setBorder(new LineBorder(GameScreen.borderColor, 2, true));
		authorArchivePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 16));
		messageArchivePanel.add(authorArchivePanel);

			JLabel authorArchiveLabel = new JLabel();
			authorArchiveLabel.setText("Message Author");
			authorArchivePanel.add(authorArchiveLabel);
			
		JPanel titleArchivePanel = new JPanel();
		titleArchivePanel.setPreferredSize(new Dimension(530, 50));
		titleArchivePanel.setBackground(GameScreen.mediumColor);
		titleArchivePanel.setBorder(new LineBorder(GameScreen.borderColor, 2, true));
		titleArchivePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 16));
		messageArchivePanel.add(titleArchivePanel);
		
			JLabel titleArchiveLabel = new JLabel();
			titleArchiveLabel.setText("Message Description");
			titleArchivePanel.add(titleArchiveLabel);
		
		for (int ii = 0; ii < GameScreen.oldMessages.size(); ii++) {
			
			JPanel nrPanel = new JPanel();
			nrPanel.setPreferredSize(new Dimension(120, 50));
			nrPanel.setBackground(GameScreen.smallPanel);
			nrPanel.setBorder(new LineBorder(GameScreen.borderColor, 3, true));
			nrPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 15));
			messageArchivePanel.add(nrPanel);
				
				JLabel nrLabel = new JLabel();
				nrLabel.setText(Integer.toString(ii + 1));
				nrPanel.add(nrLabel);
				
			JPanel authorContentPanel = new JPanel();
			authorContentPanel.setPreferredSize(new Dimension(250, 50));
			authorContentPanel.setBackground(GameScreen.smallPanel);
			authorContentPanel.setBorder(new LineBorder(GameScreen.borderColor, 3, true));
			authorContentPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 15));
			messageArchivePanel.add(authorContentPanel);
			
				JLabel authorContentLabel = new JLabel();
				authorContentLabel.setText(GameScreen.oldMessages.get(ii).author.name);
				authorContentPanel.add(authorContentLabel);
				
			JPanel titleContentPanel = new JPanel();
			titleContentPanel.setPreferredSize(new Dimension(530, 50));
			titleContentPanel.setBackground(GameScreen.smallPanel);
			titleContentPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
			messageArchivePanel.add(titleContentPanel);
			
				JButton titleContentButton = new JButton();
				titleContentButton.setText(GameScreen.oldMessages.get(ii).title.text);
				titleContentButton.setPreferredSize(new Dimension (530,50));
				titleContentButton.setContentAreaFilled(false);
				titleContentPanel.add(titleContentButton);
				
			
		}


		
	}
	

}
