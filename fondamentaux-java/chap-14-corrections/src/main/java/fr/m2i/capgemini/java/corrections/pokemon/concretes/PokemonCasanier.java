package fr.m2i.capgemini.java.corrections.pokemon.concretes;

import fr.m2i.capgemini.java.corrections.pokemon.abstraits.PokemonTerrestre;

public class PokemonCasanier extends PokemonTerrestre {

	private int nbHeure;

	public PokemonCasanier(String nom, double poids, int nbPatte, double taille, int nbHeure) {
		super(nom, poids, nbPatte, taille);
		this.nbHeure = nbHeure;
	}

	public int getNbHeure() {
		return nbHeure;
	}

	public void setNbHeure(int nbHeure) {
		this.nbHeure = nbHeure;
	}

	@Override
	public String toString() {
		String description = "\nJe regarde la télé " + nbHeure + "h par jour.";
		return super.toString() + description;
	}
}
