public class Arme {
	//Attributes
	private String nom;
	private int degat;
	//Constructor
	public Arme(String nom,int degat) {
		this.nom = nom;
		this.degat = degat;
	}
	//Methods
	public String getNom() {
		return nom;
	}
	public int getDegat() {
		return degat;
	}
	public void setDegats(int boost) {
		degat += boost;
	}
}
