package fr.m2i.capgemini.java.concretes;

import fr.m2i.capgemini.java.abstraits.Felin;

public class Lion extends Felin{

	public Lion(String couleur, double poids) {
		super(couleur, poids);
	}

	@Override
	public String crier() {
		return "Je rugis.";
	}

	@Override
	public String seDeplacer() {
		return "Je me deplace en bande.";
	}
}
