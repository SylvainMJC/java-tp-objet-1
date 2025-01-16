package essais;

import entities.AdressePostale;

public class TestAdressePostale {
    public static void main(String[] args) {
        AdressePostale ap = new AdressePostale(
        5, "Boulay Paty", "Nantes", 44000
        );
        AdressePostale ap2 = new AdressePostale(
                2, "WoottonBasset", "Blain", 44130
        );
    }
}
