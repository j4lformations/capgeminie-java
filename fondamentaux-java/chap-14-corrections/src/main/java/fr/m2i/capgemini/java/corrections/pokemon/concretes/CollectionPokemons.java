package fr.m2i.capgemini.java.corrections.pokemon.concretes;

import java.util.ArrayList;

import fr.m2i.capgemini.java.corrections.pokemon.abstraits.Pokemon;

public class CollectionPokemons {

	private ArrayList<Pokemon> pokemons;

	public CollectionPokemons() {
		pokemons = new ArrayList<>();
	}

	public ArrayList<Pokemon> getPokemons() {
		return pokemons;
	}

	public void setPokemons(ArrayList<Pokemon> pokemons) {
		this.pokemons = pokemons;
	}

	public void insertPokemon(Pokemon pokemon) {
		getPokemons().add(pokemon);
	}

	public double getVitesseMoyenne() {
		double vitesseMoyenne = 0;
		for (Pokemon pokemon : getPokemons()) {
			vitesseMoyenne += pokemon.getVitesse();
		}

		vitesseMoyenne /= getPokemons().size();
		return vitesseMoyenne;
	}

	public double getVitesseMoyenneSportif() {
		double vitesseMoyenne = 0;
		int j = 0;
		for (Pokemon pokemon : pokemons) {
			if (pokemon instanceof PokemonSportif) {
				vitesseMoyenne += pokemon.getVitesse();
				j++;
			}
		}
		vitesseMoyenne /= j;
		return vitesseMoyenne;
	}

	@Override
	public String toString() {
		StringBuilder affiche = new StringBuilder();
		for (Pokemon pokemon : pokemons) {
			affiche.append(pokemon.toString()).append("\n\n");
		}
		return affiche.toString();
	}
}
