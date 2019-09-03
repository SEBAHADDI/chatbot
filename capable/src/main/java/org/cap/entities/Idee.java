package org.cap.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="idee")
public class Idee {

    @Id
    private String id;
	private String titre;
	private String description;
	private String commentaire;
	private double estimation;
	private String complexite;
	private String echeance;
	private int nbvotes;
	
	private String id_population;
	private String id_logistique;
	private String id_equipe;
	private String id_collaborateur;
	
	public Idee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Idee(String id, String titre, String description, String commentaire, double estimation, String complexite,
			String echeance, int nbvotes, String id_population, String id_logistique, String id_equipe,
			String id_collaborateur) {
		super();
		this.id = id;
		this.titre = titre;
		this.description = description;
		this.commentaire = commentaire;
		this.estimation = estimation;
		this.complexite = complexite;
		this.echeance = echeance;
		this.nbvotes = nbvotes;
		this.id_population = id_population;
		this.id_logistique = id_logistique;
		this.id_equipe = id_equipe;
		this.id_collaborateur = id_collaborateur;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public double getEstimation() {
		return estimation;
	}

	public void setEstimation(double estimation) {
		this.estimation = estimation;
	}

	public String getComplexite() {
		return complexite;
	}

	public void setComplexite(String complexite) {
		this.complexite = complexite;
	}

	public String getEcheance() {
		return echeance;
	}

	public void setEcheance(String echeance) {
		this.echeance = echeance;
	}

	public int getNbvotes() {
		return nbvotes;
	}

	public void setNbvotes(int nbvotes) {
		this.nbvotes = nbvotes;
	}

	public String getId_population() {
		return id_population;
	}

	public void setId_population(String id_population) {
		this.id_population = id_population;
	}

	public String getId_logistique() {
		return id_logistique;
	}

	public void setId_logistique(String id_logistique) {
		this.id_logistique = id_logistique;
	}

	public String getId_equipe() {
		return id_equipe;
	}

	public void setId_equipe(String id_equipe) {
		this.id_equipe = id_equipe;
	}

	public String getId_collaborateur() {
		return id_collaborateur;
	}

	public void setId_collaborateur(String id_collaborateur) {
		this.id_collaborateur = id_collaborateur;
	}

} 
