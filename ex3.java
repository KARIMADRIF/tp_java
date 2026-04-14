package td3;
class Etudiant {

    
    private String cne;
    private double note;

    
    public Etudiant(String cne, double note) {
        this.cne = cne;
        this.note = note;
    }

   
    
    public String toString() {
        return "CNE: " + cne + ", Note: " + note;
    }

  
    public boolean estAdmis() {
        return note >= 10; 
    }
}
public class ex3 {
    public static void main(String[] args) {

        Etudiant e1 = new Etudiant("CNE123", 12);

        System.out.println(e1.toString());

        if (e1.estAdmis()) {
            System.out.println("Admis");
        } else {
            System.out.println("Non admis");
        }
    }
}