package com.esprit.projet.voyageaffaire.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Facture {

	private static final long serialVersionUID = 6711457437559348053L;
	@Id
	@GeneratedValue
	private int id;
	private int numero;
	private Date date;
	
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy="facture")
	private Reservation reservation;
	@ManyToOne
	private Entreprise enterprisee;
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Reservation getReservation() {
		return reservation;
	}


	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}




	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public Entreprise getEnterprisee() {
		return enterprisee;
	}


	public void setEnterprisee(Entreprise enterprisee) {
		this.enterprisee = enterprisee;
	}


	public Facture(int id, int numero, Date date, Reservation reservation, Entreprise enterprisee) {
		super();
		this.id = id;
		this.numero = numero;
		this.date = date;
		this.reservation = reservation;
		this.enterprisee = enterprisee;
	}
	public Facture() {
		
	}


	@Override
	public String toString() {
		return "Facture [id=" + id + ", numero=" + numero + ", date=" + date + ", reservation=" + reservation
				+ ", enterprisee=" + enterprisee + "]";
	}



	
	
	
}
