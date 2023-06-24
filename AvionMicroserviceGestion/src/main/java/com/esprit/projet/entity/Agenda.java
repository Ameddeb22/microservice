package com.esprit.projet.entity;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Agenda implements Serializable{
	
	private static final long serialVersionUID = 6711457437559348053L;
	@Id
	@GeneratedValue
	private int id;
	
	private String nom;
	private Date dateDebut,dateFin;
	
	@OneToMany(mappedBy = "agenda")
	private List<Voyage> voyages;
	
	@ManyToOne
	private Utilisateur agenda_utilisateur;
	
	public int getId() {
		return id;
	}
	

	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	
	public List<Voyage> getVoyages() {
		return voyages;
	}
	public void setVoyages(List<Voyage> voyages) {
		this.voyages = voyages;
	}
	
	public Utilisateur getAgenda_utilisateur() {
		return agenda_utilisateur;
	}

	public void setAgenda_utilisateur(Utilisateur agenda_utilisateur) {
		this.agenda_utilisateur = agenda_utilisateur;
	}
	
}
