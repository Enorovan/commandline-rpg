public abstract class Mage extends Personnage {
	//Constructor
	public Mage(Arme arme,Sort sort) {
		super(40,40,arme,sort);
	}
	//Methods
	public boolean useSort(Personnage cible) {
		if (getSort().getMana() < this.getMana()) {
			cible.setPv(cible.getPv() - getSort().getEffets()) ;
			System.out.println(getSort().getNom()+" a �t� lanc�, il inflige "+getSort().getEffets()+" points de d�gats !");
			this.setMana(getMana()-getSort().getMana());
			return true;
		}
		System.out.println("Pas suffisament de mana. Echec critique !");
		return false;
	}
	public int getPvMax() {
		return 40;
	}
}
