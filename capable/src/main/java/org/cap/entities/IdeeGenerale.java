package org.cap.entities;

import java.util.List;

public class IdeeGenerale {

	// ENTITE COLLABORATEUR
	private String id_collaborateur;
	// ENTITE IDEE
	private String idee_titre;
	private String idee_description;
	private String idee_commentaire;
	private double estimation;
	private String complexite;
	private String echeance;
	
	// ENTITE POPULATION
	private List<Integer> tranche1;
	private List<Integer> tranche2;
	private List<String> anciennete;
	private List<String> etat;
	private String population_commentaire;
	
	// ENTITE IMMOBILIER
	private String logistique_commentaire;
	private List<String> immobiliers;
	
	//ENTITE EQUIPE
	private String equipe_titre;
	private List<String> collaborateurs;
	
	
	
	public IdeeGenerale() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IdeeGenerale(String id_collaborateur, String idee_titre, String idee_description, String idee_commentaire,
			double estimation, String complexite, String echeance, List<Integer> tranche1, List<Integer> tranche2,
			List<String> anciennete, List<String> etat, String population_commentaire, String logistique_commentaire,
			List<String> immobiliers, String equipe_titre, List<String> collaborateurs) {
		super();
		this.id_collaborateur = id_collaborateur;
		this.idee_titre = idee_titre;
		this.idee_description = idee_description;
		this.idee_commentaire = idee_commentaire;
		this.estimation = estimation;
		this.complexite = complexite;
		this.echeance = echeance;
		this.tranche1 = tranche1;
		this.tranche2 = tranche2;
		this.anciennete = anciennete;
		this.etat = etat;
		this.population_commentaire = population_commentaire;
		this.logistique_commentaire = logistique_commentaire;
		this.immobiliers = immobiliers;
		this.equipe_titre = equipe_titre;
		this.collaborateurs = collaborateurs;
	}

	public String getId_collaborateur() {
		return id_collaborateur;
	}

	public void setId_collaborateur(String id_collaborateur) {
		this.id_collaborateur = id_collaborateur;
	}

	public String getIdee_titre() {
		return idee_titre;
	}

	public void setIdee_titre(String idee_titre) {
		this.idee_titre = idee_titre;
	}

	public String getIdee_description() {
		return idee_description;
	}

	public void setIdee_description(String idee_description) {
		this.idee_description = idee_description;
	}

	public String getIdee_commentaire() {
		return idee_commentaire;
	}

	public void setIdee_commentaire(String idee_commentaire) {
		this.idee_commentaire = idee_commentaire;
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

	public List<Integer> getTranche1() {
		return tranche1;
	}

	public void setTranche1(List<Integer> tranche1) {
		this.tranche1 = tranche1;
	}

	public List<Integer> getTranche2() {
		return tranche2;
	}

	public void setTranche2(List<Integer> tranche2) {
		this.tranche2 = tranche2;
	}

	public List<String> getAnciennete() {
		return anciennete;
	}

	public void setAnciennete(List<String> anciennete) {
		this.anciennete = anciennete;
	}

	public List<String> getEtat() {
		return etat;
	}

	public void setEtat(List<String> etat) {
		this.etat = etat;
	}

	public String getPopulation_commentaire() {
		return population_commentaire;
	}

	public void setPopulation_commentaire(String population_commentaire) {
		this.population_commentaire = population_commentaire;
	}

	public String getLogistique_commentaire() {
		return logistique_commentaire;
	}

	public void setLogistique_commentaire(String logistique_commentaire) {
		this.logistique_commentaire = logistique_commentaire;
	}

	public List<String> getImmobiliers() {
		return immobiliers;
	}

	public void setImmobiliers(List<String> immobiliers) {
		this.immobiliers = immobiliers;
	}

	public String getEquipe_titre() {
		return equipe_titre;
	}

	public void setEquipe_titre(String equipe_titre) {
		this.equipe_titre = equipe_titre;
	}

	public List<String> getCollaborateurs() {
		return collaborateurs;
	}

	public void setCollaborateurs(List<String> collaborateurs) {
		this.collaborateurs = collaborateurs;
	}
	
	
}
