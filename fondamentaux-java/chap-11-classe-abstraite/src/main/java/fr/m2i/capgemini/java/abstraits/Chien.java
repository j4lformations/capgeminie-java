package fr.m2i.capgemini.java.abstraits;

public class Chien extends Canin{

	public Chien(String couleur, double poids) {
		super(couleur, poids);
	}

	@Override
	public String crier() {
		return "J'aboie";
	}
}
