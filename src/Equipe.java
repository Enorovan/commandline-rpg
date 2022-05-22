public class Equipe  {
    private Personnage[] tab;
    private int x;
    private int y;
 
    public Equipe(Personnage p1,Personnage p2,Personnage p3) {
    	tab = new Personnage[3];
        tab[0] = p1;
        tab[1] = p2;
        tab[2] = p3;
        x = 0;
        y = 0;
    }
    public int getX() {
    	return x;
    }
    public int getY() {
    	return y;
    }
    public void move(Boss b) {
    	x += (int) Math.signum(-getX() + b.getX());
    	y += (int) Math.signum(-getY() + b.getY());
    }
    public void soigneEquipe() {
    	for (int i = 0 ; i < tab.length ; i++) {
    		tab[i].setPv(tab[i].getPvMax());
    	}
    }
}