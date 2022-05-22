//Degats faible
public class MageDeGlace extends Mage {
    private static Arme arme = new Arme("Baton de glace",20);
    private static Sort sort = new Sort("Pic de glace",20,10);
    public MageDeGlace() {
        super(arme,sort);
    }
    public String toString() {
    	return "Mage de glace";
    }
}