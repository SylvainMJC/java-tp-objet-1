package fr.epsi.banque.entites;


public class CompteTaux extends Compte {
    private double tauxRemuneration;

    public CompteTaux(String numeroCompte, double solde, double tauxRemuneration) {
        super(numeroCompte, solde);
        this.tauxRemuneration = tauxRemuneration;
    }

    @Override
    public String toString() {
        return super.toString() + ", tauxRemuneration=" + tauxRemuneration + "%";
    }
}