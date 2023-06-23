package com.esprit.projet.voyageaffaire.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.esprit.projet.voyage.service.IReservationService;
import com.esprit.projet.voyageaffaire.entity.Chambre;
import com.esprit.projet.voyageaffaire.entity.Reservation;
import com.esprit.projet.voyageaffaire.repository.ReservationRepository;

@Service
//http://localhost:8083/API/GestionVoyage/getAll
public class ReservationService implements IReservationService {
	
	@Autowired
	ReservationRepository reservationRepository;
	
	public List<Reservation>getAllReservations(){
		System.out.println("Get All Reservations...");
		List<Reservation> reservations=new ArrayList<>();
		reservationRepository.findAll().forEach(reservations::add);
		return reservations;
		
	}	
	public Reservation addReervation(Reservation reservation) {
		return reservationRepository.save(reservation);
	}
	
	public Reservation updateReservation(int id, Reservation newReservation) {
		if (reservationRepository.findById(id).isPresent()) {
			Reservation existingReservation = reservationRepository.findById(id).get();
			existingReservation.setDate_debut(newReservation.getDate_debut());
			existingReservation.setDate_fin(newReservation.getDate_fin()); 
			return reservationRepository.save(existingReservation);
		} else
			return null;
	}
	
	public String deleteReservation(int id) {
		if (reservationRepository.findById(id).isPresent()) {
			reservationRepository.deleteById(id);
			return "Reservation supprimé";
		} else
			return "Reservation non supprimé";
	}


}
