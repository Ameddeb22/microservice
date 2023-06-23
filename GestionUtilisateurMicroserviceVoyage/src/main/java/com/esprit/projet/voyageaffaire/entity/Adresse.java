package com.esprit.projet.voyageaffaire.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Adresse {
	private static final long serialVersionUID = 6711457437559348053L;

	@Id
	@GeneratedValue
	private int id;
	private String nom;
	private long latitude ;
	private long longitude;
	
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy="adresse")
	private Hotel hotel;
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy="adresse")
	private Employe employe;
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
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	public Employe getEmploye() {
		return employe;
	}
	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
	
	
	public long getLatitude() {
		return latitude;
	}
	public void setLatitude(long latitude) {
		this.latitude = latitude;
	}
	public long getLongitude() {
		return longitude;
	}
	public void setLongitude(long longitude) {
		this.longitude = longitude;
	}
	public Adresse() {
	}
	public Adresse(int id, String nom, Hotel hotel, Employe employe) {
		super();
		this.id = id;
		this.nom = nom;
		this.hotel = hotel;
		this.employe = employe;
	}
	
	
	
	
}
