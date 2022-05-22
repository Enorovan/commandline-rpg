//Boost sa vie
public class Paladin extends Guerrier {
	//Attributes
    private static Arme arme = new Arme("Espadon de lumière",60);
    private static Sort sort = new Sort("Boost PV",50,20);
    //Constructor
    public Paladin() {
        super(arme,sort);
    }
    //Methods
    public void setPvMax(int pv) {
    	this.setPv(this.getPv() + this.getPv()/2);
    }
	public boolean useSort(Personnage cible) {
		if (sort.getMana() < this.getMana()) {
			this.getArme().setDegats(sort.getEffets()) ;
			System.out.println(sort.getNom()+" a été lancé, il boost de "+sort.getEffets()+" les points de dégats !");
			this.setMana(getMana()-sort.getMana());
			return true;
		}
		System.out.println("Pas suffisament de mana. Echec critique !");
		return false;
	}
	 public String toString() {
	    	return "Paladin";
	    }
}
