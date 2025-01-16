package entities;

public class Personne {
    private String nom;
    private String prenom;
    private AdressePostale adressePostale;

    public Personne(String nom, String prenom, AdressePostale adressePostale) {
        this.setNom(nom);
        this.setNom(prenom);
        this.setAdressePostale(adressePostale);
    }

    public Personne(String nom, String prenom) {
        this.setNom(nom);
       this.setNom(prenom);
    }

    public void displayNames()   {
        System.out.println("Nom : " + this.nom.toUpperCase() + " Prénom : " + this.prenom);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public AdressePostale getAdressePostale() {
        return adressePostale;
    }

    public void setAdressePostale(AdressePostale adressePostale) {
        this.adressePostale = adressePostale;
    }
}

