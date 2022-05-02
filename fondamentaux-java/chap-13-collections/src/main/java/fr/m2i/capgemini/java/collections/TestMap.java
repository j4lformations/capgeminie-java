package fr.m2i.capgemini.java.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * L'interface Map nous permet de stocker des données dans des paires clé-valeur
 * (les clés doivent être immuables). Une Map ne peut pas contenir de clés en
 * double; chaque clé peut correspondre à au plus une valeur.
 */
public class TestMap {

	public static void main(String[] args) {
		Map<Integer, String> dictionnaire = new HashMap<>();

		dictionnaire.put(4, "Micheline");
		dictionnaire.put(1, "Victor");
		dictionnaire.put(2, "Kim");
		dictionnaire.put(3, "Victor");
		dictionnaire.put(1, "Power");
		dictionnaire.put(3, "Kim");

		System.out.println(dictionnaire.size());
		System.out.println(dictionnaire);
	}
}
