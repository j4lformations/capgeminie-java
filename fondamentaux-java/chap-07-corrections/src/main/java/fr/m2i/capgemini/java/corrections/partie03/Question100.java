package fr.m2i.capgemini.java.corrections.partie03;

import java.util.Arrays;

import fr.m2i.capgemini.java.corrections.J4lUtils;

/**
 * Classe Question100, créée le 09/08/2021 à 13:29
 *
 * @author Joachim Zadi
 * @version 1.0
 */
public class Question100 {

    // Dans un tableau de 10 entiers initialisé avec des valeurs aléatoires,
    // trouver les rangs et les valeurs du plus petit et du plus grand élément,
    // et les afficher dans la console.

    public static void main(String[] args) {

        double plusPetit = Double.POSITIVE_INFINITY;
        int rangPlusPetit = 0;
        double plusGrand = Double.NEGATIVE_INFINITY;
        int rangPlusGrand = 0;

        long[] tableau = J4lUtils.tabAleatoireEntier(10);

        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] < plusPetit) {
                plusPetit = tableau[i];
                rangPlusPetit = i;
            }

            if (tableau[i] > plusGrand) {
                plusGrand = tableau[i];
                rangPlusGrand = i;
            }
        }
        System.out.println("tableau = " + Arrays.toString(tableau));
        System.out.println("plusGrand = " + plusGrand);
        System.out.printf("rangPlusGrand = %s%n%n", rangPlusGrand);
        System.out.println("plusPetit = " + plusPetit);
        System.out.println("rangPlusPetit = " + rangPlusPetit);
    }
}
