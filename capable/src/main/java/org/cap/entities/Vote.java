package org.cap.entities;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="vote")
public class Vote {

	 @Id
	    private String id;
		private LocalDate date_debut;
		private LocalDate date_fin;
		private List<String> idees;
		public Vote() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Vote(String id, LocalDate date_debut, LocalDate date_fin, List<String> idees) {
			super();
			this.id = id;
			this.date_debut = date_debut;
			this.date_fin = date_fin;
			this.idees = idees;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public LocalDate getDate_debut() {
			return date_debut;
		}
		public void setDate_debut(LocalDate date_debut) {
			this.date_debut = date_debut;
		}
		public LocalDate getDate_fin() {
			return date_fin;
		}
		public void setDate_fin(LocalDate date_fin) {
			this.date_fin = date_fin;
		}
		public List<String> getIdees() {
			return idees;
		}
		public void setIdees(List<String> idees) {
			this.idees = idees;
		} 
				
}
