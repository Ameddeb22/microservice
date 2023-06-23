package com.esprit.projet.voyage.service;

import java.util.List;

import com.esprit.projet.voyageaffaire.entity.Pilote;

public interface IPiloteService {
	public List<Pilote>getAllPilotes();
	public Pilote addPilote (Pilote  pilote );
	public Pilote updatePilote(int id, Pilote newPilote);
	public String deletePilote(int id);
	

}
