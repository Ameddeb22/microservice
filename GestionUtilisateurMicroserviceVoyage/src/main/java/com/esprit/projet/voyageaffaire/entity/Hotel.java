package com.esprit.projet.voyageaffaire.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Hotel {
	private static final long serialVersionUID = 6711457437559348053L;

	@Id
	@GeneratedValue
	private int id;
	private String nom;
	

	@OneToMany(mappedBy = "hotel")
	private List<Chambre> chambres;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name="hotel_adresse")
	private Adresse adresse;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name="hotel_voyage")
	private Voyage voyage;

	public Hotel() {
		super();
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

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Chambre> getChambres() {
		return chambres;
	}

	public void setChambres(List<Chambre> chambres) {
		this.chambres = chambres;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Voyage getVoyage() {
		return voyage;
	}

	public void setVoyage(Voyage voyage) {
		this.voyage = voyage;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	public Hotel(int id, String nom, String emplacement, List<Chambre> chambres, Adresse adresse, Voyage voyage) {
		super();
		this.id = id;
		this.nom = nom;
		this.chambres = chambres;
		this.adresse = adresse;
		this.voyage = voyage;
	}

	


	
	
}
