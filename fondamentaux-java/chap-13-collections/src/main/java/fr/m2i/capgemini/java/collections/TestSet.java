package fr.m2i.capgemini.java.collections;

import java.util.HashSet;
import java.util.Set;

/**
 * Sets représente une collection d'éléments triés. Les ensembles ne permettent
 * pas les éléments en double. L'interface Set ne fournit aucune garantie de
 * renvoyer les éléments dans un ordre prévisible; bien que certaines
 * implémentations de Set stockent les éléments dans leur ordre naturel et
 * garantissent cet ordre.
 */
public class TestSet {

	public static void main(String[] args) {

		Set<String> prenoms = new HashSet<>();

		prenoms.add("N'Deye");
		prenoms.add("Paul");
		prenoms.add("N'Deye");
		prenoms.add("Tarek");

		System.out.println(prenoms);
		System.out.println(prenoms.size());
	}

}
