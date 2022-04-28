package fr.m2i.capgemini.java.corrections.partie03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Classe Question300, créée le 09/08/2021 à 14:32
 *
 * @author Joachim Zadi
 * @version 1.0
 */
public class Question300 {
    // Trier un tableau de 10 nombres saisis au clavier, par ordre croissant.
    public static void main(String[] args) {

        try (Scanner saisie = new Scanner(System.in)) {
            int compteur = 0;
            double[] tableau = new double[10];
            do {
                System.out.print("Nb" + (compteur + 1) + " = ");
                tableau[compteur] = saisie.nextDouble();
                compteur++;
            } while (compteur < 10);

            System.out.println("tableau = " + Arrays.toString(tableau));

            Arrays.sort(tableau);

            System.out.println("tableauTrie = " + Arrays.toString(tableau));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}