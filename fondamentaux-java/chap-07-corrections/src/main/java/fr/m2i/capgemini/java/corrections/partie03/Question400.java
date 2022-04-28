package fr.m2i.capgemini.java.corrections.partie03;

import java.util.Arrays;

import fr.m2i.capgemini.java.corrections.J4lUtils;

/**
 * Classe Question400, créée le 09/08/2021 à 15:40
 *
 * @author Joachim Zadi
 * @version 1.0
 */
public class Question400 {
    // Fusionner deux tableaux déjà triés par ordre croissant.
    public static void main(String[] args) {
        long[] tabUn = J4lUtils.tabAleatoireEntier(12);
        Arrays.sort(tabUn);
        System.out.printf("tabUn = %s%n%n", Arrays.toString(tabUn));

        long[] tabDeux = J4lUtils.tabAleatoireEntier(5);
        Arrays.sort(tabDeux);
        System.out.printf("tabUn = %s%n%n", Arrays.toString(tabDeux));

        long[] tabFusion = new long[tabUn.length + tabDeux.length];
        System.arraycopy(tabUn, 0, tabFusion, 0, tabUn.length);
        System.arraycopy(tabDeux, 0, tabFusion, tabUn.length, tabDeux.length);

        System.out.println("tabFusion = " + Arrays.toString(tabFusion));
    }
}
