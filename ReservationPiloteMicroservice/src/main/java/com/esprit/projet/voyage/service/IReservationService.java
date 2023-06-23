package com.esprit.projet.voyage.service;

import java.util.List;

import com.esprit.projet.voyageaffaire.entity.Reservation;

public interface IReservationService {
	public List<Reservation>getAllReservations();
	public Reservation addReervation(Reservation reservation);
	public Reservation updateReservation(int id, Reservation newReservation);
	public String deleteReservation(int id);

}
