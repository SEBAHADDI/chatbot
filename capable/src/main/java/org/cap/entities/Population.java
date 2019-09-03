package org.cap.entities;

import java.util.List;

import org.springframework.data.annotation.Id;

public class Population {

    @Id
    private String id;
	private List<Integer> tranche1;
	private List<Integer> tranche2;
	private List<String> anciennete;
	private List<String> etat;
	private String commentaire;
	
	public Population() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Population(String id, List<Integer> tranche1, List<Integer> tranche2, List<String> anciennete,
			List<String> etat, String commentaire) {
		super();
		this.id = id;
		this.tranche1 = tranche1;
		this.tranche2 = tranche2;
		this.anciennete = anciennete;
		this.etat = etat;
		this.commentaire = commentaire;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	
	
	
}
