package org.cap.entities;


import java.time.LocalDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="collaborateur")
public class Collaborateur {

	@Id
    private String id;
    private String nom;
    private String prenom;
    private LocalDate date_naissance;
    private LocalDate date_recrutement;
    private String etat_civile;
    private String grade;
    private String intitule;

    
	public Collaborateur() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Collaborateur(String id, String nom, String prenom, LocalDate date_naissance, LocalDate date_recrutement,
			String etat_civile, String grade, String intitule) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.date_naissance = date_naissance;
		this.date_recrutement = date_recrutement;
		this.etat_civile = etat_civile;
		this.grade = grade;
		this.intitule = intitule;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public LocalDate getDate_naissance() {
		return date_naissance;
	}


	public void setDate_naissance(LocalDate date_naissance) {
		this.date_naissance = date_naissance;
	}


	public LocalDate getDate_recrutement() {
		return date_recrutement;
	}


	public void setDate_recrutement(LocalDate date_recrutement) {
		this.date_recrutement = date_recrutement;
	}


	public String getEtat_civile() {
		return etat_civile;
	}


	public void setEtat_civile(String etat_civile) {
		this.etat_civile = etat_civile;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	public String getIntitule() {
		return intitule;
	}


	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	
    
}
