package org.cap.entities;

import java.util.List;

import org.springframework.data.annotation.Id;


public class Logistique {

    @Id
    private String id;
	private String commentaire;
	
	private List<String> immobiliers;
	
	public Logistique() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Logistique(String id, String commentaire, List<String> immobiliers) {
		super();
		this.id = id;
		this.commentaire = commentaire;
		this.immobiliers = immobiliers;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public List<String> getImmobiliers() {
		return immobiliers;
	}

	public void setImmobiliers(List<String> immobiliers) {
		this.immobiliers = immobiliers;
	}

	
}
