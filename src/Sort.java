public class Sort {
	//Attributes
	private String nom;
	private int effets;
	private int mana;
	//Constructor
	public Sort(String nom,int effets,int mana) {
		this.nom = nom;
		this.effets = effets;
		this.mana = mana;
	}
	//Methods
	public String getNom() {
		return nom;
	}
	public int getEffets() {
		return effets;
	}
	public int getMana() {
		return mana;
	}
}
