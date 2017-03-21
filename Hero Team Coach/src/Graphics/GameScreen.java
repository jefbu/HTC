package Graphics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Entity.Hero;
import Entity.Message;
import Entity.Quests.Quest;
import Graphics.Screens.AccountManagerScreen;
import Graphics.Screens.HeroDetailScreen;
import Graphics.Screens.MessagesScreen;
import Graphics.Screens.OptionsScreen;
import Graphics.Screens.QuestInitiationScreen;
import Graphics.Screens.QuestScreen;
import Graphics.Screens.StartScreen;
import Graphics.Screens.TeamBlacksmithScreen;
import Graphics.Screens.TeamHRScreen;
import Graphics.Screens.TeamOverviewScreen;
import Graphics.Screens.Utility.MessageDialog;
import Utility.ArmourInventory;
import Utility.AvailableQuests;
import Utility.MessageFactory;
import Utility.TeamRoster;
import Utility.WeaponInventory;

public class GameScreen extends JFrame {


	private static final long serialVersionUID = 1L;
	JPanel contentPanel;
	public static final int WIDTH = 1600;
	public static final int HEIGHT = WIDTH / 16 * 10;
	public static Color backgroundColor = new Color(220, 230, 240);
	public static Color borderColor = new Color(160, 180, 240);
	public static Color mediumColor = new Color (240, 240, 250);
	public static Color tableRow1 = new Color (210, 210, 230);
	public static Color tableRow2 = new Color (240, 240, 210);
	public static Color smallPanel = new Color (255, 255, 230);
	public static Color importantColor = new Color (100, 200, 100);
	public static Color lessImportantColor = new Color (180, 200, 130);
	public static Color unselectedColor = new Color (240, 190, 190);
	public static Color textColour = new Color (10, 50, 20);
	
	public static StartScreen startScreen;
	public static OptionsScreen optionsScreen;
	public static TeamOverviewScreen teamOverviewScreen;
	public static TeamHRScreen teamHRScreen;
	public static TeamBlacksmithScreen teamBlacksmithScreen;
	public static AccountManagerScreen teamAccountManagerScreen;
	public static MessagesScreen messagesScreen;
	public static HeroDetailScreen heroDetailScreen;
	public static QuestScreen questScreen;
	public static QuestInitiationScreen questInitiationScreen;
	public static TeamRoster teamRoster;
	public static WeaponInventory weaponInventory;
	public static ArmourInventory armourInventory;
	public static MessageDialog messageDialog;
	public static AvailableQuests availableQuest;
	
	public static int difficulty = 20;
	public static int conversationsAmount = 2;
	public static ArrayList<Message> newMessages = new ArrayList<Message>();
	public static ArrayList<Message> oldMessages = new ArrayList<Message>();
	public static MessageFactory messageFactory = new MessageFactory();
	
	public static int customerSatisfactionMinus4 = 80;
	public static int customerSatisfactionminus3 = 67;
	public static int customerSatisfactionminus2 = 31;
	public static int customerSatisfactionminus1 = 49;
	public static int customerSatisfaction = 63;
	
	public static int managementSatisfactionminus4 = 10;
	public static int managementSatisfactionminus3 = 39;
	public static int managementSatisfactionminus2 = 42;
	public static int managementSatisfactionminus1 = 25;
	public static int managementSatisfaction = 8;
	
	public static int teamMoraleminus4 = 56;
	public static int teamMoraleminus3 = 69;
	public static int teamMoraleminus2 = 77;
	public static int teamMoraleminus1 = 89;
	public static int teamMorale = 98;
	
	public static Hero currentHero;
	public static int currentHeroIndex;
	public static Quest currentQuest;
	public static int questSequence = 0;
	public static int runner = 0;
	
	public static ArrayList<Hero> questers;
	
	public Hero hrOfficer;

	

	
	public GameScreen() {
		
		super();
		
		teamRoster = new TeamRoster();
		weaponInventory = new WeaponInventory();
		armourInventory = new ArmourInventory();
		currentHero = TeamRoster.teamRosterList.get(0);
		questers = new ArrayList<Hero>();
		messageDialog = new MessageDialog();
		availableQuest = new AvailableQuests();
		
		hrOfficer = null;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(WIDTH, HEIGHT);
		setLocationRelativeTo(null);
		
		JPanel contentPanel = new JPanel();
		contentPanel.setSize(new Dimension(GameScreen.WIDTH, GameScreen.HEIGHT));
		contentPanel.setBackground(backgroundColor);
		setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		add(contentPanel);
		setContentPane(contentPanel);		
		contentPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
						
		startScreen = new StartScreen();
		getContentPane().add(startScreen);
		startScreen.setVisible(true);
				
		teamOverviewScreen = new TeamOverviewScreen();
		getContentPane().add(teamOverviewScreen);
		teamOverviewScreen.setVisible(false);
		
		teamHRScreen = new TeamHRScreen();
		getContentPane().add(teamHRScreen);
		teamHRScreen.setVisible(false);
		
		teamBlacksmithScreen = new TeamBlacksmithScreen();
		getContentPane().add(teamBlacksmithScreen);
		teamBlacksmithScreen.setVisible(false);
		
		teamAccountManagerScreen = new AccountManagerScreen();
		getContentPane().add(teamAccountManagerScreen);
		teamAccountManagerScreen.setVisible(false);
		
		messagesScreen = new MessagesScreen();
		getContentPane().add(messagesScreen);
		messagesScreen.setVisible(false);
		
		optionsScreen = new OptionsScreen();
		getContentPane().add(optionsScreen);
		optionsScreen.setVisible(false);
		
		heroDetailScreen = new HeroDetailScreen();
		getContentPane().add(heroDetailScreen);
		heroDetailScreen.setVisible(false);
		
		questScreen = new QuestScreen();
		getContentPane().add(questScreen);
		questScreen.setVisible(false);
		
		questInitiationScreen = new QuestInitiationScreen();
		getContentPane().add(questInitiationScreen);
		questInitiationScreen.setVisible(false);
		

		setVisible(true);
		
	}




	public static void setScreensInvisible() {

		GameScreen.teamOverviewScreen.setVisible(false);
		GameScreen.teamAccountManagerScreen.setVisible(false);
		GameScreen.messagesScreen.setVisible(false);
		GameScreen.heroDetailScreen.setVisible(false);
		GameScreen.teamBlacksmithScreen.setVisible(false);
		GameScreen.questInitiationScreen.setVisible(false);
		GameScreen.questScreen.setVisible(false);
		
	}
	
	
}
