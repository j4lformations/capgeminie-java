package fr.m2i.capgemini.java.heritage;

import java.time.LocalDate; 

import fr.m2i.capgemini.java.classes.Personne;

public class Stagiaire extends Personne {

	private String formation;

	public Stagiaire(String prenom, String formation, LocalDate ddn) {
		/*
		 * super fait appel au constructeur de la classe mere super doit etre la
		 * premiere instruction dans le constructeur
		 */
		super(prenom, ddn);
		this.formation = formation;
	}

	public String getFormation() {
		// int age = getAge();
		return formation;
	}

	@Override
	public String toString() {
		return String.format("%s, suit la formation %s", super.toString(), formation);
	}
}

/*
 * Lorsqu'une classe herite d'une autre, elle herite de tout ce qui est public
 * dans la classe mere
 */
