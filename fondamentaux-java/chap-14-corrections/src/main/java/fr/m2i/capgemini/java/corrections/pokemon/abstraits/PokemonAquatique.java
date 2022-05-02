package fr.m2i.capgemini.java.corrections.pokemon.abstraits;

public abstract class PokemonAquatique extends Pokemon {
	
	private int nbNageoire;

	public PokemonAquatique(String nom, double poids, int nbNageoire) {
		super(nom, poids);
		this.nbNageoire = nbNageoire;
	}


    public int getNbNageoire() {
        return nbNageoire;
    }

    public void setNbNageoire(int nbNageoire) {
        this.nbNageoire = nbNageoire;
    }

    @Override
    public String toString() {
        String description = "\nJ'ai " + nbNageoire + " nageoires.";
        return super.toString() + description;
    }

}
