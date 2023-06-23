package com.esprit.projet.voyageaffaire.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.projet.voyage.service.IPiloteService;
import com.esprit.projet.voyageaffaire.entity.Pilote;
import com.esprit.projet.voyageaffaire.entity.Vol;
import com.esprit.projet.voyageaffaire.repository.PiloteRepository;

@Service
public class PiloteService implements IPiloteService {

	@Autowired
	PiloteRepository piloteRepository;
	
	
	public List<Pilote>getAllPilotes(){
		System.out.println("Get All Pilote...");
		List<Pilote> pilotes=new ArrayList<>();
		piloteRepository.findAll().forEach(pilotes::add);
		return pilotes;
		
	}
	
	public Pilote addPilote (Pilote  pilote ) {
		return piloteRepository.save(pilote);
	}
	public Pilote updatePilote(int id, Pilote newPilote) {
		if (piloteRepository.findById(id).isPresent()) {
			Pilote existingPilote = piloteRepository.findById(id).get();
			existingPilote.setNom(newPilote.getNom());
			existingPilote.setAge(newPilote.getAge());
			existingPilote.setGrade(newPilote.getGrade());
			return piloteRepository.save(existingPilote);
		} else
			return null;
	}
	public String deletePilote(int id) {
		if (piloteRepository.findById(id).isPresent()) {
			piloteRepository.deleteById(id);
			return "Pilote supprimé";
		} else
			return "Pilote non supprimé";
	}
}
