package fr.m2i.capgemini.java.corrections.pokemon.abstraits;

public abstract class PokemonTerrestre extends Pokemon {

	private int nbPatte;
	private double taille;

	public PokemonTerrestre(String nom, double poids, int nbPatte, double taille) {
		super(nom, poids);
		this.nbPatte = nbPatte;
		this.taille = taille;
	}

	public int getNbPatte() {
		return nbPatte;
	}

	public void setNbPatte(int nbPatte) {
		this.nbPatte = nbPatte;
	}

	public double getTaille() {
		return taille;
	}

	public void setTaille(double taille) {
		this.taille = taille;
	}

	@Override
	public double getVitesse() {
		return nbPatte * taille * 3;
	}

	@Override
	public String toString() {
		String description = "\nJ'ai " + nbPatte + " pattes.\nMa taille est de " + taille + " m.";
		return super.toString() + description;
	}
}
