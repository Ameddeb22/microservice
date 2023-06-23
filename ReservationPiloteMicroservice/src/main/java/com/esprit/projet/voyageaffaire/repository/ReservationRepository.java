package com.esprit.projet.voyageaffaire.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.esprit.projet.voyageaffaire.entity.Reservation;



public interface ReservationRepository extends JpaRepository<Reservation, Integer>{
	
//	@Query("SELECT count(*) FROM Reservation r where r.chambre_reservation >0 ")
//    public int countemp();

	
//	@Query("SELECT e FROM Employe e WHERE e.email=:email and e.password=:password")
//	public Employe getEmployeByEmailAndPassword(@Param("email")String login, @Param("password")String password);
}
