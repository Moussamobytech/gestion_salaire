package com.heure.Tp_classe;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table
public class Heure {		
		@Id
		@GeneratedValue
		private Long id;
		private String prenom;
		private String nom;
		private String adresse;
		private String heure_Arriver;
		private String heureDepart;
		private String heurePause;
		
		public String getPrenom() {
			return prenom;
		}
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getAdresse() {
			return adresse;
		}
		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}
		
		public String getHeure_Arriver() {
			return heure_Arriver;
		}
		public void setHeure_Arriver(String heure_Arriver) {
			this.heure_Arriver = heure_Arriver;
		}
		
		public String getHeureDepart() {
			return heureDepart;
		}
		public void setHeureDepart(String heureDepart) {
			this.heureDepart = heureDepart;
		}
		public String getHeurePause() {
			return heurePause;
		}
		public void setHeurePause(String heurePause) {
			this.heurePause = heurePause;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		 
	}
