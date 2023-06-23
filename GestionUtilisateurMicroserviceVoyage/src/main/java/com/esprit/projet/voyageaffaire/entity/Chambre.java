package com.esprit.projet.voyageaffaire.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Chambre {
	private static final long serialVersionUID = 6711457437559348053L;

	@Id
	@GeneratedValue
	private int id;
	private int etage;
	private int numero;
	
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name="chambre_reservation")
	private Reservation reservation;
	
	@ManyToOne
	private Hotel hotel;
	
	@OneToMany(mappedBy = "employe_chambre")
	private List<Employe> employes;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEtage() {
		return etage;
	}

	public void setEtage(int etage) {
		this.etage = etage;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public Chambre(int id, int etage, int numero, Reservation reservation, Hotel hotel) {
		this.id = id;
		this.etage = etage;
		this.numero = numero;
		this.reservation = reservation;
		this.hotel = hotel;
	}
	
	
	public List<Employe> getEmploye() {
		return employes;
	}

	public void setEmploye(List<Employe> employes) {
		this.employes = employes;
	}

	public Chambre() {
		
	}

	@Override
	public String toString() {
		return "Chambre [id=" + id + ", etage=" + etage + ", numero=" + numero + ", reservation=" + reservation
				+ ", hotel=" + hotel + "]";
	}
	
	
	
	
}
