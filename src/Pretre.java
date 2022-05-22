public abstract class Pretre extends Personnage {
	//Constructor
	public Pretre(Arme arme,Sort sort) {
		super(30,50,arme,sort);
	}
	public abstract boolean useSort(Personnage cible);
	public int getPvMax() {
		return 30;
	}
}
