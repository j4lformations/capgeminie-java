package fr.m2i.capgemini.java.corrections.distributeur;

public class Compte {
	
	private String numero;
	private double solde;

	public Compte(String numero) {
		this.numero = numero;
	}

	public Compte(String numero, double solde) {
		this(numero);
		this.solde = solde;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public void deposer(int somme) {
		if (somme > 0)
			solde += somme;
	}

	public void retirer(int somme) {
		if (somme > 0)
			solde -= somme;
	}

	public String info() {
		return "Compte N°: " + numero + ", Solde : " + solde;
	}

}
