package fr.m2i.capgemini.java.abstraits;

public abstract class Canin extends Animal {

	public Canin(String couleur, double poids) {
		super(couleur, poids);
	}

	@Override
	public String manger() {
		return "Je mange de la viange";
	}

	@Override
	public String seDeplacer() {
		return "Je me deplace en meute";
	}
}
