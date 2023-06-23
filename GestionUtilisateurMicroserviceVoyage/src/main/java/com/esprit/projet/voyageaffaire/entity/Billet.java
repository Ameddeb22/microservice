package com.esprit.projet.voyageaffaire.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Billet {

	private static final long serialVersionUID = 6711457437559348053L;

	@Id
	@GeneratedValue
	private int id;
	private double prix;
	private Date date;
	private String heure;
	private String nom_Passport;
	
//	@ManyToMany(mappedBy="billets")
//	   private List<Vol>listVol;
	@ManyToOne
	private Vol vol;

	@ManyToOne
	private Entreprise entreprise;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getHeure() {
		return heure;
	}

	public void setHeure(String heure) {
		this.heure = heure;
	}

	public String getNom_Passport() {
		return nom_Passport;
	}

	public void setNom_Passport(String nom_Passport) {
		this.nom_Passport = nom_Passport;
	}

//	public List<Vol> getListVol() {
//		return listVol;
//	}
//
//	public void setListVol(List<Vol> listVol) {
//		this.listVol = listVol;
//	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	public Vol getVol() {
		return vol;
	}

	public void setVol(Vol vol) {
		this.vol = vol;
	}

	public Entreprise getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}



	public Billet(int id, double prix, Date date, String heure, String nom_Passport, Vol vol, Entreprise entreprise) {
		super();
		this.id = id;
		this.prix = prix;
		this.date = date;
		this.heure = heure;
		this.nom_Passport = nom_Passport;
		this.vol = vol;
		this.entreprise = entreprise;
	}

	public Billet() {
	
	}
	
	
}
