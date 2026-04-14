package td3;
 class NombreComplexe {

    
    private double reel;
    private double imaginaire;

    
    public NombreComplexe(double reel, double imaginaire) {
        this.reel = reel;
        this.imaginaire = imaginaire;
    }

    public NombreComplexe addition(NombreComplexe n) {
        double r = this.reel + n.reel;
        double i = this.imaginaire + n.imaginaire;
        return new NombreComplexe(r, i);
    }

    public NombreComplexe multiplication(NombreComplexe n) {
        double r = (this.reel * n.reel) - (this.imaginaire * n.imaginaire);
        double i = (this.reel * n.imaginaire) + (this.imaginaire * n.reel);
        return new NombreComplexe(r, i);
    }

    public void afficher() {
        System.out.println(reel + " + " + imaginaire + "i");
    }
}
 public class ex4 {
	    public static void main(String[] args) {

	        NombreComplexe n1 = new NombreComplexe(2, 3);
	        NombreComplexe n2 = new NombreComplexe(1, 4);

	        NombreComplexe somme = n1.addition(n2);
	        NombreComplexe produit = n1.multiplication(n2);

	        System.out.print("Somme : ");
	        somme.afficher();

	        System.out.print("Produit : ");
	        produit.afficher();
	    }
	}
