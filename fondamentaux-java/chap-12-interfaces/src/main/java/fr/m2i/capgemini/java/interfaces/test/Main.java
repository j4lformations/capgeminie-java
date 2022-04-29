package fr.m2i.capgemini.java.interfaces.test;

import java.time.LocalDate;

import fr.m2i.capgemini.java.classes.Batteur;
import fr.m2i.capgemini.java.classes.Maestro;
import fr.m2i.capgemini.java.classes.Personne;
import fr.m2i.capgemini.java.interfaces.ICompositeur;
import fr.m2i.capgemini.java.interfaces.IMusicien;
import fr.m2i.capgemini.java.interfaces.IMusicienCompositeur;

public class Main {

	public static void main(String[] args) {

		ICompositeur compositeur;
		IMusicien musicien;
		IMusicienCompositeur musicienCompositeur;

		Batteur philColins = new Batteur("Phil Colins", LocalDate.of(1960, 01, 01));

		musicien = philColins;
		musicien.jouerInstrument();

		philColins.getPrenom();
		philColins.jouerInstrument();

		Personne personne = new Personne("Phil Colins", LocalDate.of(1960, 01, 01));

		personne = philColins;
		personne.getDdn();

		musicienCompositeur = new Maestro("Pavarota", LocalDate.of(1960, 01, 01));
		musicienCompositeur.getAgeLegal();

//		musicien = musicienCompositeur;

	}
}