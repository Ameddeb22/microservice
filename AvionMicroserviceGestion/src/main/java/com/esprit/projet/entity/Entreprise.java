package com.esprit.projet.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;


@Entity
public class Entreprise implements Serializable{
	
	private static final long serialVersionUID = 6711457437559348053L;
	
	@Id
	@GeneratedValue
	private int id;
	
	private String nom;
	@OneToMany(mappedBy="entreprise", 
			cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, 
			fetch=FetchType.EAGER)
	private List<Departement> departements = new ArrayList<>();
	
	

	public List<Departement> getDepartements() {
		return departements;
	}

	public void setDepartements(List<Departement> departements) {
		this.departements = departements;
	}
	@OneToMany(mappedBy = "enterprise")
	private List<Voyage> voyages;
	
	@OneToMany(mappedBy = "enterprisee")
	private List<Invitation> invitations;
	
	@OneToMany(mappedBy = "entreprise")
	private List<Billet> billets;
	
	@OneToMany(mappedBy = "utilisateur_entreprise")
	private List<Utilisateur> utilisateurs;
	
	
	
	public Entreprise() {
		
		
	}
	

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	@Override
	public String toString() {
		return "enterprise [id=" + id + ", nom=" + nom + "]";
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public List<Invitation> getInvitations() {
		return invitations;
	}
	public void setInvitations(List<Invitation> invitations) {
		this.invitations = invitations;
	}
	public void setVoyages(List<Voyage> voyages) {
		this.voyages = voyages;
	}
	public List<Voyage> getVoyages() {
		return voyages;
	}
	

	public List<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}

	public void setUtilisateurs(List<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

	public List<Billet> getBillets() {
		return billets;
	}

	public void setBillets(List<Billet> billets) {
		this.billets = billets;
	}

	public Entreprise(int id, String nom, List<Departement> departements, List<Voyage> voyages,
			List<Invitation> invitations, List<Billet> billets, List<Utilisateur> utilisateurs) {
		super();
		this.id = id;
		this.nom = nom;
		this.departements = departements;
		this.voyages = voyages;
		this.invitations = invitations;
		this.billets = billets;
		this.utilisateurs = utilisateurs;
	}
	
	
	
}
