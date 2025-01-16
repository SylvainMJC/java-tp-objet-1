package essais;

import entities.AdressePostale;
import entities.Personne;

public class TestPersonne {

    public static void main(String[] args) {
        AdressePostale ap = new AdressePostale(
                5, "Boulay Paty", "Nantes", 44000
        );
        AdressePostale ap2 = new AdressePostale(
                2, "WoottonBasset", "Blain", 44130
        );


        Personne p = new Personne(
                "Doe", "John", ap
        );
        Personne p2 = new Personne(
                "Doe", "Jane", ap2
        );
        // il ne faut pas beaucoup de ligne comparé à d'autres paradigmes
    }
}
