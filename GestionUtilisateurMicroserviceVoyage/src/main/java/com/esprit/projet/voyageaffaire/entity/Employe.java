package com.esprit.projet.voyageaffaire.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.esprit.projet.voyageaffaire.enums.Role;




@Entity
public class Employe implements Serializable{
	
	private static final long serialVersionUID = 6711457437559348053L;
	
	@Id
	@GeneratedValue
	private int id;
	
	private int numtel;
	
	private String nom,cin,email;
	private String password;
	
	@Enumerated(EnumType.STRING)
	private Role role;
	
	@OneToOne(mappedBy="employe")
	private Contrat contrat;
	
	@OneToMany(mappedBy = "employe")
	private List<Invitation> invitation;
	
	@ManyToOne
	private Departement departements;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy="employe")
	
	private Utilisateur utilisateur;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name="employe_adresse")
		private Adresse adresse;
	
	@ManyToOne
	private Chambre employe_chambre;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumtel() {
		return numtel;
	}

	public void setNumtel(int numtel) {
		this.numtel = numtel;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Contrat getContrat() {
		return contrat;
	}

	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}

	public List<Invitation> getInvitation() {
		return invitation;
	}

	public void setInvitation(List<Invitation> invitation) {
		this.invitation = invitation;
	}

	



	public Chambre getEmploye_chambre() {
		return employe_chambre;
	}

	public void setEmploye_chambre(Chambre employe_chambre) {
		this.employe_chambre = employe_chambre;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Employe(int id, int numtel, String nom, String cin, String email, String password, Role role,
			Contrat contrat, List<Invitation> invitation, List<Departement> listDepartement, Utilisateur utilisateur) {
		super();
		this.id = id;
		this.numtel = numtel;
		this.nom = nom;
		this.cin = cin;
		this.email = email;
		this.password = password;
		this.role = role;
		this.contrat = contrat;
		this.invitation = invitation;
		this.utilisateur = utilisateur;
	}

	public Employe() {
	}

	public Departement getDepartements() {
		return departements;
	}

	public void setDepartements(Departement departements) {
		this.departements = departements;
	}
	
	

}
