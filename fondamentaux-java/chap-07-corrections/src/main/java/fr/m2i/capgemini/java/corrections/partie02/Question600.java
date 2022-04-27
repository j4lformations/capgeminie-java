package fr.m2i.capgemini.java.corrections.partie02;

import java.util.Scanner;

/**
 * Classe Question600, créée le 06/08/2021 à 15:35
 *
 * @author Joachim Zadi
 * @version 1.0
 */
public class Question600 {
    public static void main(String[] args) {
        /*
         * Lire n nombres et en calculer la moyenne.
         */
        Scanner scanner = new Scanner(System.in);

        double somme = 0;

        try {
            for (int i = 1; i < 11; i++) {
                System.out.print("N" + i + " = ");
                double saise = scanner.nextDouble();
                somme += saise;
            }
            System.out.printf("\nMoyenne = %s%n", somme/10);
        } catch (Exception e) {
            System.out.println("Attention à votre saisie, Des nombres sont attendus en saisie");
        }
        scanner.close();
    }
}