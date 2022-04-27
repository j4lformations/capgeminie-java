package fr.m2i.capgemini.java.corrections.partie02;

/**
 * Classe Question200, créée le 06/08/2021 à 14:40
 *
 * @author Joachim Zadi
 * @version 1.0
 */
public class Question200 {
    public static void main(String[] args) {
        // Afficher la somme des nombres de 1 à 10.
        var somme = 0;
        for (int i = 1; i < 11; i++) {
            somme += i;
        }
        System.out.println("somme = " + somme);
    }
}