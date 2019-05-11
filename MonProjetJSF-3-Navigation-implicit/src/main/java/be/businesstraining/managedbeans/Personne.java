package be.businesstraining.managedbeans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Personne {
	
	private String nom;
	private int age;
	
	public Personne() {
	}

	public Personne(String nom, int age) {
		super();
		this.nom = nom;
		this.age = age;
	}

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
	
	// Méthode "métier"
	
	public String estMajeur()
	{
		return (age >=18)? "majeur" : "mineur";
	}

}
