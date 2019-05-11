package be.businesstraining.managedbeans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Personne {
	
	private String nom;
	private int age;
	private String email;
	
	public Personne() {
	}

	public Personne(String nom, int age, String email) {
		super();
		this.nom = nom;
		this.age = age;
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
