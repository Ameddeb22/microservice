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
public class Voyage implements Serializable{
	private static final long serialVersionUID = 6711457437559348053L;
	
	@Id
	@GeneratedValue
	private int id;
	
	
	private String nom;
	
	private Date dateDebut,dateFin;
	
	@ManyToOne
	private Entreprise enterprise;
	
	@ManyToOne
	private Agenda agenda;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name="voyage_vol")
	private Vol vol;
	
	@ManyToOne
	private Utilisateur voyage_utilisateur;

	@OneToMany(mappedBy = "invitation_voyage")
	private List<Invitation> invitations;
	
	
	public Entreprise getEnterprise() {
		return enterprise;
	}
	public void setEnterprise(Entreprise enterprise) {
		this.enterprise = enterprise;
	}
	public int getId() {
		return id;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getNom() {
		return nom;
	}
	public Voyage() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	public Voyage(int id, String nom, Date dateDebut, Date dateFin, Entreprise enterprise, Agenda agenda, Vol vol,
			Utilisateur voyage_utilisateur, Invitation invitation) {
		super();
		this.id = id;
		this.nom = nom;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.enterprise = enterprise;
		this.agenda = agenda;
		this.vol = vol;
		this.voyage_utilisateur = voyage_utilisateur;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Agenda getAgenda() {
		return agenda;
	}
	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
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
	public Utilisateur getVoyage_utilisateur() {
		return voyage_utilisateur;
	}
	public void setVoyage_utilisateur(Utilisateur voyage_utilisateur) {
		this.voyage_utilisateur = voyage_utilisateur;
	}
	public Vol getVol() {
		return vol;
	}
	public void setVol(Vol vol) {
		this.vol = vol;
	}
	public List<Invitation> getInvitations() {
		return invitations;
	}
	public void setInvitations(List<Invitation> invitations) {
		this.invitations = invitations;
	}
	
	
	
}

