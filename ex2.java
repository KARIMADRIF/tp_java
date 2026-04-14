package td3;
 class Rectangle {

    
    private double largeur;
    private double hauteur;

    
    public Rectangle(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    
    public double surface() {
        return largeur * hauteur;
    }

   
    public double perimetre() {
        return 2 * (largeur + hauteur);
    }
}



 public class ex2 {
	 public static void main(String[] args) {
		  Rectangle r = new Rectangle(5,7);
		  double s = r.surface();
		  double p=r.perimetre();
		  System.out.println("Surface = " + s);
	        System.out.println("Périmètre = " + p);
		  
		  
		  		  
		 
	 }
}
