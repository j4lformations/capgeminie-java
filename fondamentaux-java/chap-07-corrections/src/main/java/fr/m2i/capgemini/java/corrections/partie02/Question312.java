package fr.m2i.capgemini.java.corrections.partie02;

import java.util.Scanner;

/**
 * Classe Question312, créée le 06/08/2021 à 14:49
 *
 * @author Joachim Zadi
 * @version 1.0
 */
public class Question312 {
    public static void main(String[] args) {
        // Saisir au clavier les entiers n et m et les afficher de n à m
        // Dans le cas où n est supérieur à m, Permuter n et m, puis continuer.

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
            long temp = n;
            n = m;
            m = temp;

            for (long i = n; i <= m; i++) {
                System.out.printf("%s ",i);
            }
        }        
        saisie.close();
    }
}
