package fr.m2i.capgemini.java.corrections.partie02;

import java.util.Scanner;

/**
 * Classe Question311, créée le 06/08/2021 à 14:49
 *
 * @author Joachim Zadi
 * @version 1.0
 */
public class Question311 {
    public static void main(String[] args) {
        // Saisir au clavier les entiers n et m et les afficher de n à m
        // Dans le cas où n est supérieur à m, Afficher un message d'erreur et arrêter le programme.

        Scanner saisie = new Scanner(System.in);

        long n = 0, m = 0;

        System.out.print("n = ");

        if (!saisie.hasNextLong()) {
            System.out.println("Vous devez saisir un entier");
            System.exit(0);
        } else {
            n = saisie.nextLong();
        }

        System.out.print("m = ");
        if (!saisie.hasNextLong()) {
            System.out.println("Vous devez saisir un entier");
            System.exit(0);
        } else {
            m = saisie.nextLong();
        }

        if (n > m) {
            System.out.println("Attention, n doit être inferieur à m");
            System.exit(0);
        }
        saisie.close();
    }
}
