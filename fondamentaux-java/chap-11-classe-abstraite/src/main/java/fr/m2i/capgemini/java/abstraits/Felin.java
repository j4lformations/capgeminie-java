package fr.m2i.capgemini.java.abstraits;

public abstract class Felin extends Animal {

	public Felin(String couleur, double poids) {
		super(couleur, poids);
	}

	@Override
	public String manger() {
		return "Je mange de la viande.";
	}
}
