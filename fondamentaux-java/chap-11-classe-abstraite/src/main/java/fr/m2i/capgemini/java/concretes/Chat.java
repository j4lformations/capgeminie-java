package fr.m2i.capgemini.java.concretes;

import fr.m2i.capgemini.java.abstraits.Felin;

public class Chat extends Felin {

	public Chat(String couleur, double poids) {
		super(couleur, poids);
	}

	@Override
	public String crier() {
		return "Je miaule.";
	}

	@Override
	public String seDeplacer() {
		return "Je suis un grand sollitaire";
	}

}
