package fr.m2i.capgemini.java.classes;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Personne{

	// Attributs d'instance
	private String prenom;
	private LocalDate ddn;
	private Personne conjoint;
	
	// Attirbut de classe
	private static int compteur;

	public Personne(String prenom, LocalDate ddn) {
		this.prenom = prenom;
		this.ddn = ddn;
		compteur++;
	}
	
	public String plus(Personne p) {
		// Ici le code de votre ajout
		return "a + b";
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

	public static int getCompteur() {
		return compteur;
	}

	// Visibilité à destination des enfants
	protected int getAge() {
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

	@Override
	public int hashCode() {
		return Objects.hash(prenom);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personne other = (Personne) obj;
		return prenom.equalsIgnoreCase(other.prenom);
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
	@Override
	public String toString() {
		String affichage = String.format("%s, %s ans", prenom, getAge());
		if (conjoint != null) {
			affichage += String.format(" a pour conjoint %s, %s ans", conjoint.prenom, conjoint.getAge());
		}
		return affichage;
	}
}
