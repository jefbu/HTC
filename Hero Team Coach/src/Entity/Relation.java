package Entity;

public class Relation {
	
	public Hero target;
	public int intensity;
	
	public String relationType;
	
	public Relation(Hero target, int intensity, String relationType) {
		
		this.target = target;
		this.intensity = intensity;
		this.relationType = relationType;
		
	}

}
