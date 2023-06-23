package com.esprit.projet.voyageaffaire.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.projet.voyageaffaire.entity.Facture;
import com.esprit.projet.voyageaffaire.entity.Reservation;
import com.esprit.projet.voyageaffaire.errors.ApiRequestException;
//import com.esprit.projet.voyageaffaire.repository.FactureRepository;
import com.esprit.projet.voyageaffaire.repository.ReservationRepository;
import com.esprit.projet.voyageaffaire.service.impl.ReservationService;

@RestController
@RequestMapping(value = "/api/reservations")
public class ReservationRestApi {

	@Autowired
	private ReservationService reservationService;
	@Autowired
	private ReservationRepository reservationrepository;
	

	@GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Reservation>> getAllReservations(){
		return new ResponseEntity<>(reservationService.getAllReservations(), HttpStatus.OK);
	}
	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Reservation> getFactureById(@PathVariable(value = "id") int ReservationId)
    throws ApiRequestException{
		Reservation reservation =reservationrepository.findById(ReservationId).orElseThrow(()->
		new ApiRequestException("Reservation non existe"+ReservationId));
		return ResponseEntity.ok().body(reservation);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Reservation> createReservation(@RequestBody Reservation reservation) {
		return new ResponseEntity<>(reservationService.addReervation(reservation), HttpStatus.OK);
	}

	
	@PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Reservation> updateReservation(@PathVariable(value = "id") int id,
    										@RequestBody Reservation reservation){
		return new ResponseEntity<>(reservationService.updateReservation(id, reservation), HttpStatus.OK);
	}
	@DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> deleteReservation(@PathVariable(value = "id") int id){
		return new ResponseEntity<>(reservationService.deleteReservation(id), HttpStatus.OK);
	}
//	
//	   @GetMapping(value = "getNombreReservationVide")
//	    @ResponseBody
//		public int getNombreReservationVide() {
//			
//			return reservationService.getNombreReservationVide();
//		}

	
}
