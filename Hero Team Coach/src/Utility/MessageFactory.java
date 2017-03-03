package Utility;

import java.util.Random;

import Entity.Hero;
import Entity.Message;
import Entity.Trait;

public class MessageFactory {

	Random random;
	int roll;
	Trait input;
	Strings title;
	Strings greeting;
	Strings content;
	Strings ending;

	public MessageFactory() {

		random = new Random();

	}

	public Message generateMessage(Hero author) {

		roll = random.nextInt(author.heroTraits.size());
		input = author.heroTraits.get(roll);

		return generateRandomMessage(author, input);

	}

	public Message generateRandomMessage(Hero author, Trait input) {

			Message outputMessage = null;
			boolean forward = false;

			while (!forward) {
			
			roll = random.nextInt(2) + 1;
			switch (roll) {

			case 1:
				if (input == Trait.hero_illiterate) forward = true;
				outputMessage = new Message(author, Strings.title_friendlyMessage_illiterate,
						Strings.greeting_friendlyMessage_illiterate, Strings.content_friendlyMessage_illiterate,
						Strings.ending_friendlyMessage_illiterate, 1);
				break;

			case 2:
				forward = true;
				outputMessage = new Message(author, Strings.title_friendlyMessage_generic,
						Strings.greeting_friendlyMessage_generic, Strings.content_friendlyMessage_generic,
						Strings.ending_friendlyMessage_generic, 1);
				break;

			}
			
		}

		forward = false;
		return outputMessage;

	}

}
