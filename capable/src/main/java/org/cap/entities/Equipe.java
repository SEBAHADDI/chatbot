package org.cap.entities;

import java.util.List;

import org.springframework.data.annotation.Id;

public class Equipe {

    @Id
    private String id;
	private String titre;
	private List<String> collaborateurs;
	
	public Equipe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Equipe(String id, String titre, List<String> collaborateurs) {
		super();
		this.id = id;
		this.titre = titre;
		this.collaborateurs = collaborateurs;
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

	public List<String> getCollaborateurs() {
		return collaborateurs;
	}

	public void setCollaborateurs(List<String> collaborateurs) {
		this.collaborateurs = collaborateurs;
	}

	
}
