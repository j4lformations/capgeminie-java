package fr.m2i.capgemini.java.jdbc.model;

import java.time.LocalDateTime;

public class Stagiaire {

	private int id;
	private String nom;
	private int age;
	private LocalDateTime created_at;

	public Stagiaire(int id, String nom, int age, LocalDateTime created_at) {
		this.id = id;
		this.nom = nom;
		this.age = age;
		this.created_at = created_at;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public LocalDateTime getCreated_at() {
		return created_at;
	}

	public void setCreated_at(LocalDateTime created_at) {
		this.created_at = created_at;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Stagiaire [id= " + id + ", nom= " + nom + ", age= " + age + " ans, created_at= " + created_at + "]";
	}

}
