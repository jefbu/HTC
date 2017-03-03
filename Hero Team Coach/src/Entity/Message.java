package Entity;

import java.awt.Color;

import Utility.Strings;

public class Message {

	public Hero author;
	public Strings title;
	public Strings greeting;
	public Strings content;
	public Strings ending;
	public int situation;
	public Color effectPanelColor;
	public String effectString;



	
	public Message(Hero author, Strings title, Strings greeting, Strings content, Strings ending, int situation) {

		this.author = author;
		this.title = title;
		this.greeting = greeting;
		this.ending = ending;
		this.content = content;
		this.situation = situation;
		
		effectPanelColor = decideColor(situation);
		decideString(situation);

	}
	

	public void messageOutcome(int situation) {
		
		switch (situation) {
		
		case 1:
			author.morale = author.morale + 5;
			effectString = author.name + " receives +5 to their morale";
			break;
		}
		
	}
	
	
	private Color decideColor(int situation) {

		if(situation == 1) return new Color(200, 230, 180);
		else return new Color (10, 10, 10);
		
		}
	
	private void decideString(int situation) {
		
		if (situation == 1) effectString = author.name + " receives +5 to their morale";
		else effectString = author.name + " receives +5 to their morale";
		
	}



}
