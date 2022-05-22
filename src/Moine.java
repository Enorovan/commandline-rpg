//Rend de la vie
public class Moine extends Pretre {
	//Attributes
    private static Arme arme = new Arme("Sceptre de l'erudit",40);
    private static Sort sort = new Sort("Goutte de mana",40,20);
    //Constructor
    public Moine() {
        super(arme,sort);
    }
    //Methods
    public boolean useSort(Personnage cible) {
    	int rand = (int) Math.random()*3;
    	if (rand != 2 && cible.getPv() < getPvMax()) {
    		if (sort.getMana() < this.getMana()) {
    			cible.setPv(cible.getPv() + sort.getEffets()) ;
    			System.out.println(sort.getNom()+" a été lancé, il rend "+sort.getEffets()+" points de vie !");
    			this.setMana(getMana()-sort.getMana());
    			return true;
    		}
    		else {
    			System.out.println("Pas suffisament de mana. Echec critique !");
    			return false;
    		}
    	}
    	System.out.println("Pas de chance, votre sort a échoué !");
    	return false;
    }
    public String toString() {
    	return "Moine";
    }
}