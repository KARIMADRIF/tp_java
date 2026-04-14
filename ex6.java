package td3;
 class Voiture {

    
    private String marque;
    private double vitesse;

    
    public Voiture(String marque, double vitesse) {
        this.marque = marque;
        this.vitesse = vitesse;
    }

    
    public void accelerer(double valeur) {
        if (valeur > 0) {
            vitesse += valeur;

          
            if (vitesse > 240) {
                vitesse = 240;
            }
        }
    }

   
    public void freiner(double valeur) {
        if (valeur > 0) {
            vitesse -= valeur;
            if (vitesse < 0) {
                vitesse = 0;
            }
        }
    }

    
    public void afficher() {
        System.out.println("Marque: " + marque + ", Vitesse: " + vitesse + " km/h");
    }
}

public class ex6 {public static void main(String[] args) {

    Voiture v = new Voiture("MERCEDES", 100);

    v.accelerer(50);
    v.afficher();

    v.accelerer(200);
    v.afficher(); 

    v.freiner(100);
    v.afficher();

    v.freiner(200);
    v.afficher(); 
}

}
