//Rend du mana
public class Druide extends Pretre {
    private static Arme arme = new Arme("Sceptre de la nature",40);
    private static Sort sort = new Sort("Soins intensifs",40,20);
    public Druide() {
        super(arme,sort);
    }
    public boolean useSort(Personnage cible) {
    	if (sort.getMana() < this.getMana()) {
    		cible.setMana(cible.getMana() + sort.getEffets()) ;
    		System.out.println(sort.getNom()+" a été lancé, il rend "+sort.getEffets()+" points de mana !");
    		this.setMana(getMana()-sort.getMana());
    		return true;
    	}
    	System.out.println("Pas suffisament de mana. Echec critique !");
    	return false;
    }
    public String toString() {
    	return "Druide";
    }
}