package fr.m2i.capgemini.java.corrections.pokemon.test;

import fr.m2i.capgemini.java.corrections.pokemon.abstraits.Pokemon;
import fr.m2i.capgemini.java.corrections.pokemon.concretes.CollectionPokemons;
import fr.m2i.capgemini.java.corrections.pokemon.concretes.PokemonCasanier;
import fr.m2i.capgemini.java.corrections.pokemon.concretes.PokemonCroisiere;
import fr.m2i.capgemini.java.corrections.pokemon.concretes.PokemonMer;
import fr.m2i.capgemini.java.corrections.pokemon.concretes.PokemonSportif;

public class Main {

	public static void main(String[] args) {

		CollectionPokemons pokemons = new CollectionPokemons();

		Pokemon bulbizarre = new PokemonCroisiere("Bulbizarre", 15, 3);
		pokemons.insertPokemon(bulbizarre);

		Pokemon rondoudou = new PokemonMer("Rondoudou", 45, 2);
		pokemons.insertPokemon(rondoudou);

		Pokemon pikachu = new PokemonSportif("Pikachu", 18, 2, 0.85, 120);
		pokemons.insertPokemon(pikachu);

		Pokemon bolt = new PokemonSportif("Bolt", 66, 2, 1.7, 120);
		pokemons.insertPokemon(bolt);

		Pokemon salameche = new PokemonCasanier("Salameche", 12, 2, 0.65, 8);
		pokemons.insertPokemon(salameche);
		
		System.out.println(pokemons);
		
		System.out.println("VitesseMoyenne = " + pokemons.getVitesseMoyenne() + " km/h");
		System.out.println("VitesseMoyenneSportif = " + pokemons.getVitesseMoyenneSportif()+ " km/h");
	}
}
