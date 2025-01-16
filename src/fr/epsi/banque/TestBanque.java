package fr.epsi.banque;

import fr.epsi.banque.entites.Compte;
import fr.epsi.banque.entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {
        Compte compte = new Compte("123456789", 1000.50);
        System.out.println(compte);
        // c'est l'adresse mémoire de l'objet qui est affichée (après tp 6 , ce n'est plus le cas)

        Compte[] comptes = new Compte[2];
        comptes[0] = new Compte("123456789", 1000.50);
        comptes[1] = new CompteTaux("987654321", 2000.75, 1.5);

        for (Compte c : comptes) {
            System.out.println(c);
        }

    }

}
