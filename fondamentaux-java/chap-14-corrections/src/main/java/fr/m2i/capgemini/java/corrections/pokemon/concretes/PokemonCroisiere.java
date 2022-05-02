package fr.m2i.capgemini.java.corrections.pokemon.concretes;

import fr.m2i.capgemini.java.corrections.pokemon.abstraits.PokemonAquatique;

public class PokemonCroisiere extends PokemonAquatique {

	public PokemonCroisiere(String nom, double poids, int nbNageoire) {
		super(nom, poids, nbNageoire);
	}

	@Override
	public double getVitesse() {
		return (getPoids() / 25 * getNbNageoire()) / 2;
	}
}
