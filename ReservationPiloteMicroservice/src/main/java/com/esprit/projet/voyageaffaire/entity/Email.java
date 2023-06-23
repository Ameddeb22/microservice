package com.esprit.projet.voyageaffaire.entity;
import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.esprit.projet.voyageaffaire.enums.InvitationType;

@Entity
public class Email implements Serializable{
	
	private static final long serialVersionUID = 6711457437559348053L;
	
	@Id
	@GeneratedValue
	private int id;
	
	private int idEnvoyeur,idRecepteur;
	
	private String titre,description;

	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy="email")
	private Invitation invitation;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdEnvoyeur() {
		return idEnvoyeur;
	}

	public void setIdEnvoyeur(int idEnvoyeur) {
		this.idEnvoyeur = idEnvoyeur;
	}

	public int getIdRecepteur() {
		return idRecepteur;
	}

	public void setIdRecepteur(int idRecepteur) {
		this.idRecepteur = idRecepteur;
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
	
	public Invitation getInvitation() {
		return invitation;
	}

	public void setInvitation(Invitation invitation) {
		this.invitation = invitation;
	}

}
