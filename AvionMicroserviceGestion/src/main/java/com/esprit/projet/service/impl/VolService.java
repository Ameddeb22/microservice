package com.esprit.projet.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.projet.entity.Avion;
import com.esprit.projet.entity.Billet;
import com.esprit.projet.entity.Contrat;
import com.esprit.projet.entity.Employe;
import com.esprit.projet.entity.Hotel;
import com.esprit.projet.entity.Pilote;
import com.esprit.projet.entity.Vol;
import com.esprit.projet.repository.AvionRepository;
import com.esprit.projet.repository.BilletRepository;
import com.esprit.projet.repository.HotelRepository;
import com.esprit.projet.repository.PiloteRepository;
import com.esprit.projet.repository.VolRepository;

@Service
public class VolService {

	@Autowired
	VolRepository volRepository;
	@Autowired
	PiloteRepository piloteRepository;
	@Autowired
	BilletRepository billetRepository;
	@Autowired
	AvionRepository avionRepository;
	
	public List<Vol>getAllVols(){
		System.out.println("Get All Vols...");
		List<Vol> Vols=new ArrayList<>();
		volRepository.findAll().forEach(Vols::add);
		return Vols;
		
	}
	
	public Vol addVol (Vol  vol ) {
		return volRepository.save(vol);
	}
	public Vol updateVol(int id, Vol newVol) {
		if (volRepository.findById(id).isPresent()) {
			Vol existingVol = volRepository.findById(id).get();
			existingVol.setDestination(newVol.getDestination());
			existingVol.setDate_Depart(newVol.getDate_Arrivée());
			existingVol.setDate_Depart(newVol.getDate_Depart());
			return volRepository.save(existingVol);
		} else
			return null;
	}
	public String deleteVol(int id) {
		if (volRepository.findById(id).isPresent()) {
			volRepository.deleteById(id);
			return "vol supprimé";
		} else
			return "vol non supprimé";
	}
	
	
	public void affecterPiloteAuVol(int piloteId, int volId) {
		// TODO Auto-generated method stub
		Pilote piloteEntity = piloteRepository.findById(piloteId).get();
		Vol volEntity = volRepository.findById(volId).get();

		piloteEntity.setVol(volEntity);
		piloteRepository.save(piloteEntity);
	}
	
	public void affecterAvionAuVol(int avionId, int volId) {
		// TODO Auto-generated method stub
		Avion avionEntity = avionRepository.findById(avionId).get();
		Vol volEntity = volRepository.findById(volId).get();

		avionEntity.setVol(volEntity);
		avionRepository.save(avionEntity);
	}
	
	public void affecterBilletAVol(int billetId, int volId) {
		// TODO Auto-generated method stub
		Vol volEntity = volRepository.findById(volId).get();
		Billet billetEntity = billetRepository.findById(billetId).get();

		if(billetEntity.getVol() == null){

			List<Billet> billets = new ArrayList<>();
			billets.add(billetEntity);
			//volEntity.setBillets(billets);
			billetEntity.setVol(volEntity);
		}else{

			billetEntity.setVol(volEntity);
		}

		// à ajouter? 
		billetRepository.save(billetEntity); 
	}
	
}
