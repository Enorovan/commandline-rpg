public class Terrain {
    //Attributes
    private static final int TAILLE = 10;
    private static final int NBDEBoss = 3;
    private Equipe heros;
    private Boss[] tabBoss;
    //Constructor
    public Terrain() {
    	Personnage[] tabHeros = new Personnage[3];
    	
    	double rand = Math.random()*2;
    	if (rand < 1) {tabHeros[0] = new Warrior();}
    	if (rand >= 1) {tabHeros[0] = new Paladin();}
    	
    	rand = Math.random()*2;
    	if (rand < 1) {tabHeros[1] = new MageDeFeu();}
    	if (rand >= 1) {tabHeros[1] = new MageDeGlace();}
    	
    	rand = Math.random()*2;
    	if (rand < 1) {tabHeros[2] = new Moine();}
    	if (rand >= 1) {tabHeros[2] = new Druide();}
    	
    	heros = new Equipe(tabHeros[0],tabHeros[1],tabHeros[2]);
    	
    	tabBoss = new Boss[NBDEBoss];
    	for (int i = 0 ; i < tabBoss.length; i++) {
    		tabBoss[i] = new Boss();
    	}
    	System.out.println("Votre équipe est composé de : "+ tabHeros[0].toString()+", "+tabHeros[1].toString()+" et "+tabHeros[2].toString()+".");
    }
    //Methods
    public String terrain() {
        String[][] terr = new String[TAILLE][TAILLE];
        int i = 0;
        int j = 0;
        int k = 0;
        String s ="";
        s += "_______________________________\n";
        for (i = 0 ; i < TAILLE ; i++){
            for (j = 0 ; j < TAILLE ; j++){
                terr[i][j] = " . ";
            }
        }

        for (k = 0 ; k < NBDEBoss ; k++){
        	int randX = (int) (Math.random()*9)+1;
        	int randY = (int) (Math.random()*9)+1;
            tabBoss[k].setX(randX);
            tabBoss[k].setY(randY);
            terr[randX][randY] = " B ";
        }

        for (i = 0 ; i < TAILLE ; i++){
            s += "|";
            for (j = 0 ; j < TAILLE ; j++){
                s += terr[i][j];
            }
            s += "|\n";
        }
        s += "________________________________\n";
        return s;
    }
    
    public boolean enCombat() {
    	for(int i = 0 ; i < tabBoss.length ; i++) {
    		if (heros.getX() == tabBoss[i].getX() && heros.getY() == tabBoss[i].getY())
    			return true;	
    	}
    	return false;	
    }
}