package com.esprit.projet.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.esprit.projet.entity.Hotel;


import com.esprit.projet.entity.Adresse;
import com.esprit.projet.entity.Employe;
import com.esprit.projet.entity.Entreprise;




public interface HotelRepository extends JpaRepository<Hotel, Integer> {
	

	 
	   @Query("select a.nom from Hotel a join a.adresse h where a.id=:adrid")
	    public List<String> getAllHotelByAdresse(@Param("adrid")int adrid);
	   

}

