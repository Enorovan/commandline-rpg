public abstract class Guerrier extends Personnage {
	//Constructor
	public Guerrier(Arme arme,Sort sort) {
		super(80,20,arme,sort);
	}
	//Methods
	public abstract boolean useSort(Personnage cible);
	public  int getPvMax() {
		return 80;
	}
}
