package entities;

public class AdressePostale {
    public int numeroDeRue;
    public int codePostale;
    public String ville;
    public String libelleRue;

    public AdressePostale(int numeroDeRue, String libelleRue, String ville, int codePostale) {
        this.numeroDeRue = numeroDeRue;
        this.libelleRue = libelleRue;
        this.ville = ville;
        this.codePostale = codePostale;
    }
}
