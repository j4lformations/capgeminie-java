package fr.m2i.capgemini.java.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * List représente une collection ordonnée d'éléments. En utilisant des listes,
 * nous pouvons accéder aux éléments par leur index entier (position dans la
 * liste), et rechercher des éléments dans la liste. L'index commence par 0,
 * tout comme dans un tableau.
 */
public class TestList {

	public static void main(String[] args) {

		List<String> prenoms = new ArrayList<>();

		prenoms.add("N'Deye");
		prenoms.add("Paul");
		prenoms.add("N'Deye");
		prenoms.add("Tarek");

		System.out.println(prenoms);
		System.out.println(prenoms.size());
	}
}