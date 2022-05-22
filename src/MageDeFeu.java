//Degats forts
public class MageDeFeu extends Mage {
	private static Arme arme = new Arme("Baton de feu",10);
	private static Sort sort = new Sort("Boule de feu",40,20);
	public MageDeFeu() {
		super(arme,sort);
	}
	 public String toString() {
	    	return "Mage de feu";
	    }
}
