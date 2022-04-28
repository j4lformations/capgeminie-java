package fr.m2i.capgemini.java.corrections.partie03;

import java.util.Arrays;
import java.util.Scanner;

import fr.m2i.capgemini.java.corrections.J4lUtils;

/**
 * Classe Question500, créée le 09/08/2021 à 15:53
 *
 * @author Joachim Zadi
 * @version 1.0
 */
public class Question500 {

    // Dire si une valeur existe dans un tableau trié (séquentiel, dichotomique).
    public static void main(String[] args) {
        try (Scanner saisie = new Scanner(System.in)) {
            System.out.println("Saisir un entier : ");
            long valeurSaisie = saisie.nextLong();
            long[] tableau = J4lUtils.tabAleatoireEntier(11);
            boolean presence = false;
            for (long l : tableau) {
                if (valeurSaisie == l) {
                    presence = true;
                    break;
                }
            }
            System.out.println("tableau = " + Arrays.toString(tableau));
            System.out.println("valeurSaisie = " + valeurSaisie);
            String resultat = presence ? String.format("%s est present dans le tableau", valeurSaisie): String.format("%s n'est pas present dans le tableau", valeurSaisie);
            System.out.println("resultat = " + resultat);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
