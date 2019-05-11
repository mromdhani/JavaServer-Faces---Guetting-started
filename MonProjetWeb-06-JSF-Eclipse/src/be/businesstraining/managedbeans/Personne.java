package be.businesstraining.managedbeans;

import javax.faces.bean.ManagedBean;


@ManagedBean
public class Personne {
	private String nom;
	private int age;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public boolean isJeune() {
		return age < 18;
	}
	
	public String eventHandler() {
		return isJeune() ? "jeune" : "adulte";
	}
	

}
