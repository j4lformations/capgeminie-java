package fr.m2i.capgemini.java.corrections;

import java.util.Random;

/**
 * Classe J4lUtils, créée le 09/08/2021 à 13:30
 *
 * @author Joachim Zadi
 * @version 1.0
 */
public class J4lUtils {
    /**
     * Permet de generer un tableau d'entier aleatoirement
     * @param taille, la taille du bleau
     * @return le tableau rempli d'entiers
     */
    public static long[] tabAleatoireEntier(int taille) {
        Random generator = new Random();
        //long nb = generator.nextInt(10);
        long[] tab = new long[taille];
        for (int i = 0; i < taille; i++) {
            tab[i]= generator.nextInt(1000);
        }
        return tab;
    }
}
