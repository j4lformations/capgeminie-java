package fr.m2i.capgemini.java.corrections.pokemon.concretes;

import fr.m2i.capgemini.java.corrections.pokemon.abstraits.PokemonTerrestre;

public class PokemonSportif extends PokemonTerrestre {

	private int frequenceCardiaque;

	public PokemonSportif(String nom, double poids, int nbPatte, double taille, int frequenceCardiaque) {
		super(nom, poids, nbPatte, taille);
		this.frequenceCardiaque = frequenceCardiaque;
	}

	public int getFrequenceCardiaque() {
		return frequenceCardiaque;
	}

	public void setFrequenceCardiaque(int frequenceCardiaque) {
		this.frequenceCardiaque = frequenceCardiaque;
	}

	@Override
	public String toString() {
		String description = "\nMa frequence cardiaque est " + frequenceCardiaque + " pulsations à la minute.";
		return super.toString() + description;
	}
}
