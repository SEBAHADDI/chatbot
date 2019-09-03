package org.cap.entities;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="immobilier")
public class Immobilier {

    @Id
    private String id;
	private String designation;
	private float prix;
	
	public Immobilier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Immobilier(String id, String designation, float prix) {
		super();
		this.id = id;
		this.designation = designation;
		this.prix = prix;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	
}
