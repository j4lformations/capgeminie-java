package fr.m2i.capgemini.java.heritage;

import java.time.LocalDate;

public class StagiaireSalarie extends Stagiaire{

	private int salaire;
	
	public StagiaireSalarie(String prenom, String formation, LocalDate ddn, int salaire) {
		super(prenom, formation, ddn);
		this.salaire = salaire;
	}

	public int getSalaire() {
		return salaire;
	}
	
	@Override
	public String toString() {
		return String.format("%s, perçoit un salaire de %s€", super.toString(), salaire);
	}
}
