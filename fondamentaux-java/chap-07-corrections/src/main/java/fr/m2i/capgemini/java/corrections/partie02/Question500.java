package fr.m2i.capgemini.java.corrections.partie02;

import java.text.MessageFormat;
import java.util.Scanner;

/**
 * Classe Question500, créée le 06/08/2021 à 15:31
 *
 * @author Joachim Zadi
 * @version 1.0
 */
public class Question500 {
    public static void main(String[] args) {
        /*
         * Lire 10 nombres et trouver le plus petit et son rang.
         */
        Scanner scanner = new Scanner(System.in);

        double min = Double.POSITIVE_INFINITY;
        int indice = 1;

        try {
            for (int i = 1; i < 11; i++) {
                System.out.print("N" + i + " = ");
                double saise = scanner.nextDouble();
                if (min > saise) {
                    indice = i;
                }
                min = Math.min(min, saise);
            }
            System.out.println(MessageFormat.format("\nMin = {0}", min));
            System.out.printf("\nIndice = %d%n", indice);
        } catch (Exception e) {
            System.out.println("Attention à votre saisie, Des nombres sont attendus en saisie");
        }
        scanner.close();
    }
}
