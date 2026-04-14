package td3;

 class CompteBancaire {

    
    private String numero;
    private double solde;

    
    public CompteBancaire(String numero, double solde) {
        this.numero = numero;
        this.solde = solde;
    }

    
    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
        }
    }


    public void retirer(double montant) {
        if (montant > 0 && montant <= solde) {
            solde -= montant;
        } else {
            System.out.println("Retrait impossible !");
        }
    }

    public void transferer(CompteBancaire c, double montant) {
        if (montant > 0 && montant <= solde) {
            this.solde -= montant;
            c.solde += montant;
        } else {
            System.out.println("Transfert impossible !");
        }
    }

   
    public void afficherSolde() {
        System.out.println("Solde du compte " + numero + " : " + solde);
    }
}
 public class ex5 {
	    public static void main(String[] args) {

	        CompteBancaire c1 = new CompteBancaire("KARI", 100000);
	        CompteBancaire c2 = new CompteBancaire("MARAM", 50);

	        c1.deposer(200);
	        c1.retirer(100);
	        c1.transferer(c2, 300);

	        c1.afficherSolde();
	        c2.afficherSolde();
	    }}