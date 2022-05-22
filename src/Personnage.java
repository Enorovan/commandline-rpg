public abstract class Personnage {
	//Attributes
	private int pv;
	private int mana;
	private Arme arme;
	private Sort sort;
	//Constructors
	public Personnage(int pv,int mana,Arme arme,Sort sort) {
		this.pv = pv;
		this.mana = mana;
		this.arme = arme;
		this.sort = sort;
	}
	//Methods
	public void useArme(Arme a,Personnage cible) {
		int rand = (int) Math.random()*2;
		if (rand == 1) {
			cible.pv -= a.getDegat();
		}
		else
			System.out.println();
	}
	public void enleverPV(Arme a) {
		pv -= a.getDegat();
	}
	public void enleverMana(Sort s) {
		mana -= s.getMana();
	}
	public boolean estMort() {
		if (this.pv <= 0) {
			return true;
		}
		return false;
	}
	
	//Getters
	public int getPv() {
		return pv;
	}
	public int getMana() {
		return mana;
	}
	public Arme getArme() {
		return arme;
	}
	public Sort getSort() {
		return sort;
	}
	//Setters
	public void setPv(int pv) {
		this.pv = pv;
	}
	public void setMana(int mana) {
		this.mana = mana;
	}
	public void setArme(Arme arme) {
		this.arme = arme;
	}
	public void setSort(Sort sort) {
		this.sort = sort;
	}
	//Abstract Methods
	public abstract boolean useSort(Personnage cible);
	public abstract int getPvMax();
}
