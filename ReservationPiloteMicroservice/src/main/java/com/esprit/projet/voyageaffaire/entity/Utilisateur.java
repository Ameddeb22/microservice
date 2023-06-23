package com.esprit.projet.voyageaffaire.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.esprit.projet.voyageaffaire.enums.UserType;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;

@Entity
public class Utilisateur implements Serializable{
	
	private static final long serialVersionUID = 6711457437559348053L;
	
	@Id
	@GeneratedValue
	private int id;

	private String nom,prenom,email,username,password,cin;

	private UserType type;


	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name="related_employe")
	private Employe employe;
	
	@ManyToOne
	private Entreprise utilisateur_entreprise;

	@OneToMany(mappedBy = "agenda_utilisateur")
	private List<Agenda> agendas;
	
	@OneToMany(mappedBy = "voyage_utilisateur")
	private List<Voyage> voyages;
	
	@OneToMany(mappedBy = "id_envoyeur")
	private List<Invitation> invitations_envoyes;
	
	@OneToMany(mappedBy = "id_recepteur")
	private List<Invitation> invitations_recu;
	
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

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}
	
	public UserType getType() {
		return type;
	}

	public void setType(UserType type) {
		this.type = type;
	}
	
	

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	public Entreprise getUtilisateur_entreprise() {
		return utilisateur_entreprise;
	}

	public void setUtilisateur_entreprise(Entreprise utilisateur_entreprise) {
		this.utilisateur_entreprise = utilisateur_entreprise;
	}
	
	public List<Agenda> getAgendas() {
		return agendas;
	}

	public void setAgendas(List<Agenda> agendas) {
		this.agendas = agendas;
	}

	public List<Voyage> getVoyages() {
		return voyages;
	}

	public void setVoyages(List<Voyage> voyages) {
		this.voyages = voyages;
	}

	public void addVoyage(Voyage voyage) {
		this.voyages.add(voyage);
	}

	public List<Invitation> getInvitations_envoyes() {
		return invitations_envoyes;
	}

	public void setInvitations_envoyes(List<Invitation> invitations_envoyes) {
		this.invitations_envoyes = invitations_envoyes;
	}

	public List<Invitation> getInvitations_recu() {
		return invitations_recu;
	}

	public void setInvitations_recu(List<Invitation> invitations_recu) {
		this.invitations_recu = invitations_recu;
	}
	
	
	
}
