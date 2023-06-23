package com.esprit.projet.voyageaffaire.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Reservation {
	

	private static final long serialVersionUID = 6711457437559348053L;
	@Id
	@GeneratedValue
	private int id;
	private Date Date_debut;
	private Date Date_fin;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy="reservation")
	private Chambre chambre;
	
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name="reservation_facture")
	private Facture facture;
	
	public Reservation(int id, Date date_debut, Date date_fin, Chambre chambre) {
		this.id = id;
		Date_debut = date_debut;
		Date_fin = date_fin;
	}


	public Reservation() {
	
	}

	public int getId() {
		return id;
	}




	public Chambre getChambre() {
		return chambre;
	}




	public void setChambre(Chambre chambre) {
		this.chambre = chambre;
	}




	public Facture getFacture() {
		return facture;
	}




	public void setFacture(Facture facture) {
		this.facture = facture;
	}




	public void setId(int id) {
		this.id = id;
	}




	public Date getDate_debut() {
		return Date_debut;
	}




	public void setDate_debut(Date date_debut) {
		Date_debut = date_debut;
	}




	public Date getDate_fin() {
		return Date_fin;
	}




	public void setDate_fin(Date date_fin) {
		Date_fin = date_fin;
	}




	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "Reservation [id=" + id + ", Date_debut=" + Date_debut + ", Date_fin=" + Date_fin + ", chambre="
				+ chambre + ", facture=" + facture + "]";
	}




}
