package Utility;

import Entity.Relation;
import Entity.Trait;

public class Strings {

	public String text;
	public Trait traitCondition;
	public Relation relationCondition;
	public Strings stringsCondition;

	public static Strings title_friendlyMessage_illiterate = new Strings("Jus a tank u", Trait.hero_illiterate);
	public static Strings greeting_friendlyMessage_illiterate = new Strings("Helo Bos",
			Strings.title_friendlyMessage_illiterate);
	public static Strings content_friendlyMessage_illiterate = new Strings(
			"I like dis workin in adventure in gettin good fun an wantin to be tankin u",
			Strings.title_friendlyMessage_illiterate);
	public static Strings ending_friendlyMessage_illiterate = new Strings("Bybye",
			Strings.title_friendlyMessage_illiterate);

	public static Strings title_friendlyMessage_generic = new Strings("Just wanted to thank you");
	public static Strings greeting_friendlyMessage_generic = new Strings("Dear boss,");
	public static Strings content_friendlyMessage_generic = new Strings(
			"Well as the title implies, I just wanted to thank you for the opportunity to work in this team. It's been a lot of fun so far and I'm looking forward to many more successful adventures");
	public static Strings ending_friendlyMessage_generic = new Strings("Well, thanks again and see you soon");

	
	public Strings(String text, Trait traitCondition, Relation relationCondition) {

		this.text = text;
		this.traitCondition = traitCondition;
		this.relationCondition = relationCondition;

	}

	public Strings(String text, Trait traitCondition) {

		this.text = text;
		this.traitCondition = traitCondition;

	}

	public Strings(String text, Relation relationCondition) {

		this.text = text;
		this.relationCondition = relationCondition;

	}

	public Strings(String text) {

		this.text = text;

	}

	public Strings(String text, Strings stringsCondition) {

		this.text = text;
		this.stringsCondition = stringsCondition;

	}

}
