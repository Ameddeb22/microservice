package com.esprit.projet.voyageaffaire.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Vol {

	
	private static final long serialVersionUID = 6711457437559348053L;

	@Id
	@GeneratedValue
	private int id;
	private String destination;
	private Date date_Depart,date_Arrivée;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy="vol")
	private Avion avion;

	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy="vol")
	private Pilote pilote;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy="vol")
	private Voyage voyage;
	
	@OneToMany
	private List<Billet> billets;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getDate_Depart() {
		return date_Depart;
	}

	public void setDate_Depart(Date date_Depart) {
		this.date_Depart = date_Depart;
	}

	public Date getDate_Arrivée() {
		return date_Arrivée;
	}

	public void setDate_Arrivée(Date date_Arrivée) {
		this.date_Arrivée = date_Arrivée;
	}

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	public Pilote getPilote() {
		return pilote;
	}

	public void setPilote(Pilote pilote) {
		this.pilote = pilote;
	}

	public Voyage getVoyage() {
		return voyage;
	}

	public void setVoyage(Voyage voyage) {
		this.voyage = voyage;
	}

	public List<Billet> getBillets() {
		return billets;
	}

	public void setBillets(List<Billet> billets) {
		this.billets = billets;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Vol(int id, String destination, Date date_Depart, Date date_Arrivée, Avion avion, Pilote pilote,
			Voyage voyage, List<Billet> billets) {
		super();
		this.id = id;
		this.destination = destination;
		this.date_Depart = date_Depart;
		this.date_Arrivée = date_Arrivée;
		this.avion = avion;
		this.pilote = pilote;
		this.voyage = voyage;
		this.billets = billets;
	}

	public Vol() {
		
	}
	

	
	
	
}
