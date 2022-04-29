package fr.m2i.capgemini.java.abstraits;

public abstract class Animal {

	private String couleur;
	private double poids;

	public Animal(String couleur, double poids) {
		this.couleur = couleur;
		this.poids = poids;
	}

	public double getPoids() {
		return poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String boire() {
		return "Je bois de l'eau";
	}

	public abstract String manger();

	public abstract String crier();

	public abstract String seDeplacer();

	@Override
	public String toString() {
		return String.format("Je un suis un %s.%nMa couleur est %s.%nJe pèse %s kg.", getClass().getSimpleName(),
				couleur, poids) + "\n" + manger() + "\n" + crier() + "\n" + seDeplacer();

	}
}
