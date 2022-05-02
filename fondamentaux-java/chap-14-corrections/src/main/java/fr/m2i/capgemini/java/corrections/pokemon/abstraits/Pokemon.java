package fr.m2i.capgemini.java.corrections.pokemon.abstraits;

/**
 * 
 * @author Joachim
 *
 */
public abstract class Pokemon {
	
	private String nom;
	private double poids;

	public Pokemon(String nom, double poids) {
		this.nom = nom;
		this.poids = poids;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPoids() {
		return poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}

	public void seDeplacer() {
		System.out.println("Je me deplace à la vitesse de " + getVitesse());
	}

	public abstract double getVitesse();

	@Override
	public String toString() {
		String description = "Je suis le pokemon " + nom + ".\nMon poids est de " + poids + " kg."
				+ "\nMa vitesse est de  " + getVitesse() + " km/h.";
		return description;
	}
}
