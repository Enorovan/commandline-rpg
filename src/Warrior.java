//Boost ses dégats
public class Warrior extends Guerrier {
	//Attributes
    private static Arme arme = new Arme("Hache de l'ombre",60);
    private static Sort sort = new Sort("Boost DEGATS",50,20);
    public Warrior() {
        super(arme,sort);
    }
    //Methods
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
	public int getPvMax() {
			return 40;
	}
	 public String toString() {
	    	return "Warrior";
	    }
}