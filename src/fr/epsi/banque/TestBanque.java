package fr.epsi.banque;

import fr.epsi.banque.entites.Compte;

public class TestBanque {
    public static void main(String[] args) {
        Compte compte = new Compte("123456789", 1000.50);
        System.out.println(compte);
        // c'est l'adresse mémoire de l'objet qui est affichée (après tp 6 , ce n'est plus le cas)
    }

}
