package fr.m2i.capgemini.java.classes;

import java.time.LocalDate;
import java.time.Period;

public class Personne {

	// Attributs d'instance
	private String prenom;
	private LocalDate ddn;
	private Personne conjoint;
	
	
	// Attirbut de classe
	public static int compteur;

	public Personne(String prenom, LocalDate ddn) {
		this.prenom = prenom;
		this.ddn = ddn;
		compteur++;
	}

	// Methodes d'instances
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public LocalDate getDdn() {
		return ddn;
	}

	public Personne getConjoint() {
		return conjoint;
	}

	private int getAge() {
		LocalDate aujourdhui = LocalDate.now(); // Retourne la date courante
		Period ecart = ddn.until(aujourdhui); // calcul la period entre 2 dates
		return ecart.getYears(); // La periode en années
	}

	public void seMarier(Personne p) {
		if ((getAge() >= 18 && p.getAge() >= 18) && (conjoint == null && p.conjoint == null)) {
			conjoint = p;
			p.conjoint = this;
		}
	}

	/**
	 * Permet de decrire textuellement l'objet courant
	 * 
	 * Affiche le prenom et l'age d'une personne
	 * 
	 * Affiche le prenom et l'age du cojoint s'il existe
	 * 
	 * @return
	 */
	public String affiche() {
		String affichage = String.format("%s, %s ans", prenom, getAge());
		if (conjoint != null) {
			affichage += String.format(" a pour conjoint %s, %s ans", conjoint.prenom, conjoint.getAge());
		}
		return affichage;
	}
}
