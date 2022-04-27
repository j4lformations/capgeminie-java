package fr.m2i.capgemini.java.corrections.partie02;

import java.util.Scanner;

/**
 * Classe Question314, créée le 06/08/2021 à 14:49
 *
 * @author Joachim Zadi
 * @version 1.0
 */
public class Question314 {
    public static void main(String[] args) {
        // Saisir au clavier les entiers n et m
        // Dans le cas où n est supérieur à m,
        // Afficher la somme des nombres pairs de n à m.

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
            var somme = 0;
            for (long i = n; i >= m; i--) {
                if (i % 2 == 0)
                    somme += i;
            }
            System.out.printf("somme = %s ", somme);
        }
        saisie.close();
    }
}