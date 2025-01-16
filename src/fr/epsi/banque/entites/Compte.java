package fr.epsi.banque.entites;

public class Compte {
    private String numeroCompte;
    private double solde;

    public Compte(String numeroCompte, double solde) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "numeroCompte='" + numeroCompte + '\'' +
                ", solde=" + solde +
                '}';
    }

}
