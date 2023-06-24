package com.esprit.projet.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Pilote {

	private static final long serialVersionUID = 6711457437559348053L;

	@Id
	@GeneratedValue
	private int id;
	private String nom;
	private String age;
	private String grade;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name="pilote_vol")
	private Vol vol;

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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
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

	public Pilote(int id, String nom, String age, String grade, Vol vol) {
		super();
		this.id = id;
		this.nom = nom;
		this.age = age;
		this.grade = grade;
		this.vol = vol;
	}

	public Pilote() {
		
	}
	
	
	
}
