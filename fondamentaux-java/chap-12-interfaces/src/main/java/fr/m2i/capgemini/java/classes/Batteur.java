package fr.m2i.capgemini.java.classes;

import java.time.LocalDate;

import fr.m2i.capgemini.java.interfaces.IMusicien;

public class Batteur extends Personne implements IMusicien{

	public Batteur(String prenom, LocalDate ddn) {
		super(prenom, ddn);
	}

	@Override
	public void jouerInstrument() {
		System.out.println("Je joue de la batterie");
	}
}