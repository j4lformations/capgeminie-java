package fr.m2i.capgemini.java.classes;

/**
 * Creer une classe revient creer un nouveau type
 * 
 * @author Joachim
 *
 */
public class Compte {
	/*
	 * Les attributs de la classes On a vocation à les encapsuler avec le mot clé
	 * private d'apres la POO
	 */
	private String numero;
	private double solde;

	/*
	 * Un constructeur est une methode speciale qui porte le meme nom que la classe
	 * C'est une methode qui n'a pas de valeur de retour, meme pas void
	 */
	public Compte(String num) {
		numero = num;
	}

	public Compte(String n, double s) {
		numero = n;
		solde = s;
	}

	/*
	 * Acces en lecture ==> getter
	 */
	public String getNumero() {
		return numero;
	}

	public double getSolde() {
		return solde;
	}

	/*
	 * Un acces en ecriture ==> setter
	 */
	public void setSolde(double montant) {
		if (montant > 0)
			solde = montant;
	}

	public void crediter(double montant) {
		if (montant > 0)
			solde += montant;
	}

	public boolean debiter(double montant) {
		if (montant > solde) {
			return false;
		} else {
			solde -= montant;
			return true;
		}
	}
	
	public String affiche() {
		return String.format("Compte[N°: %s, Solde: %s €]", numero, solde);
	}
}
