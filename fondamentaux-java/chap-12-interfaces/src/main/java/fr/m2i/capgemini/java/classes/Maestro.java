package fr.m2i.capgemini.java.classes;

import java.time.LocalDate;

import fr.m2i.capgemini.java.interfaces.IMusicienCompositeur;

public class Maestro extends Personne implements /* IMusicien, ICompositeur */ IMusicienCompositeur {

	public Maestro(String prenom, LocalDate ddn) {
		super(prenom, ddn);
	}

	@Override
	public void ecrirePartition() {
		System.out.println("J'ecris des partions");
	}

	@Override
	public void jouerInstrument() {
		System.out.println("Je joue du piano");
	}

	@Override
	public void getAgeLegal() {
		System.out.println("J'ai au moins 60 ans");
	}
}