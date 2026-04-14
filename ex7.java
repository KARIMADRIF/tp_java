package td3;

import java.util.ArrayList;

class Produit {

    private int id;
    private String nom;
    private String description;
    private double prix;
    private int quantite;

    public Produit(int id, String nom, String description, double prix, int quantite) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.prix = prix;
        this.quantite = quantite;
    }

    public int getId() {
        return id;
    }

    public void afficher() {
        System.out.println(id + " | " + nom + " | " + prix + " | " + quantite);
    }

    public void setPrix(double prix) {
        if (prix > 0) {
            this.prix = prix;
        }
    }
}

class GestionProduit {

    private ArrayList<Produit> liste = new ArrayList<>();

    public void ajouterProd(Produit p) {
        liste.add(p);
    }

    public void modifierProd(int id, double nouveauPrix) {
        for (Produit p : liste) {
            if (p.getId() == id) {
                p.setPrix(nouveauPrix);
                System.out.println("Produit trouvé, modification...");
            }
        }
    }

    public void supprimerProd(int id) {
        for (Produit p : liste) {
            if (p.getId() == id) {
                liste.remove(p);
                break;
            }
        }
    }

    public Produit getProduitByID(int id) {
        for (Produit p : liste) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }
}

public class ex7 {
    public static void main(String[] args) {

        GestionProduit gp = new GestionProduit();

        Produit p1 = new Produit(1, "PC", "HP Laptop", 7000, 5);
        Produit p2 = new Produit(2, "Phone", "Samsung", 3000, 10);

        gp.ajouterProd(p1);
        gp.ajouterProd(p2);

        Produit p = gp.getProduitByID(1);
        if (p != null) {
            p.afficher();
        }

        gp.supprimerProd(2);
    }
}