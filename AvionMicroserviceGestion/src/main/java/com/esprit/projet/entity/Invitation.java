package com.esprit.projet.entity;
import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.esprit.projet.enums.InvitationType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Invitation implements Serializable{
	

	private static final long serialVersionUID = 6711457437559348053L;
	
	@Id
	@GeneratedValue
	private int id;
	
	
	

	private String titre,description,file;
	private InvitationType type;
	
	
	private boolean statut;

	@ManyToOne
	private Employe employe;
	
	
	@ManyToOne
	private Entreprise enterprisee;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name="invitation_email")
	private Email email;
	
	
	@ManyToOne
	private Voyage invitation_voyage;

	
	
	@ManyToOne
	private Utilisateur id_envoyeur;
	
	@ManyToOne
	private Utilisateur id_recepteur;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public InvitationType getType() {
		return type;
	}

	public void setType(InvitationType type) {
		this.type = type;
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}
	
	

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
	
	public Entreprise getEnterprise() {
		return enterprisee;
	}

	public void setEnterprise(Entreprise enterprise) {
		this.enterprisee = enterprise;
	}
	
	public boolean isStatut() {
		return statut;
	}

	public void setStatut(boolean statut) {
		this.statut = statut;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public Utilisateur getId_envoyeur() {
		return id_envoyeur;
	}

	public void setId_envoyeur(Utilisateur id_envoyeur) {
		this.id_envoyeur = id_envoyeur;
	}

	public Utilisateur getId_recepteur() {
		return id_recepteur;
	}

	public void setId_recepteur(Utilisateur id_recepteur) {
		this.id_recepteur = id_recepteur;
	}

	public Voyage getInvitation_voyage() {
		return invitation_voyage;
	}

	public void setInvitation_voyage(Voyage invitation_voyage) {
		this.invitation_voyage = invitation_voyage;
	}

	

}
