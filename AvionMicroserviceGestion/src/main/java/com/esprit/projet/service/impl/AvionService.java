package com.esprit.projet.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.projet.entity.Avion;
import com.esprit.projet.entity.Vol;
import com.esprit.projet.repository.AvionRepository;
import com.esprit.projet.repository.HotelRepository;

@Service
public class AvionService {

	@Autowired
	AvionRepository avionRepository;
	
	
	public List<Avion>getAllAvions(){
		System.out.println("Get All Avions...");
		List<Avion> avions=new ArrayList<>();
		avionRepository.findAll().forEach(avions::add);
		return avions;
		
	}
	
	public Avion addAvion (Avion  avion ) {
		return avionRepository.save(avion);
	}
	public Avion updateAvion(int id, Avion newAvion) {
		if (avionRepository.findById(id).isPresent()) {
			Avion existingAvion = avionRepository.findById(id).get();
			existingAvion.setCapacité(newAvion.getCapacité());
			return avionRepository.save(existingAvion);
		} else
			return null;
	}
	public String deleteAvion(int id) {
		if (avionRepository.findById(id).isPresent()) {
			avionRepository.deleteById(id);
			return "Avion supprimé";
		} else
			return "Avion non supprimé";
	}
	
	
}
