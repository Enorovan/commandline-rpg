public class Boss extends Personnage {
	//Attributes
	private static Arme arme = new Arme("Griffes",10);
    private static Sort sort = new Sort("Attaque élémentaire",20,20);
    private int x;
    private int y;
    //Constructor
	public Boss(){
		super(300,200,arme,sort);
	}
	//Methods
	public boolean useSort(Personnage cible) {
		if (sort.getMana() < this.getMana()) {
			cible.setPv(cible.getPv() - sort.getEffets()) ;
			System.out.println(sort.getNom()+" a été lancé, il inflige "+sort.getEffets()+" points de dégats !");
			this.setMana(getMana()-sort.getMana());
			return true;
		}
		System.out.println("Pas suffisament de mana. Echec critique !");
		return false;
	}
	public int getPvMax() {
		return 300;
	}
    public int getX() {
    	return x;
    }
    public int getY() {
    	return y;
    }
    public void setX(int x) {
    	this.x = x;
    }
    public void setY(int y) {
    	this.y = y;
    }
}
