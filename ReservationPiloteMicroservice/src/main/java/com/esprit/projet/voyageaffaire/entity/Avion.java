package com.esprit.projet.voyageaffaire.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Avion {

	private static final long serialVersionUID = 6711457437559348053L;

	@Id
	@GeneratedValue
	private int id;
	private int capacité;

	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name="avion_vol")
	private Vol vol;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getCapacité() {
		return capacité;
	}


	public void setCapacité(int capacité) {
		this.capacité = capacité;
	}


	public Vol getVol() {
		return vol;
	}


	public void setVol(Vol vol) {
		this.vol = vol;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public Avion(int id, int capacité, Vol vol) {
		super();
		this.id = id;
		this.capacité = capacité;
		this.vol = vol;
	}


	public Avion() {
		
	}
	
	
	
}
