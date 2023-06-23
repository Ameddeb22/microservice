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
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.projet.voyageaffaire.entity.Pilote;
import com.esprit.projet.voyageaffaire.entity.Vol;
import com.esprit.projet.voyageaffaire.service.impl.PiloteService;
;

@RestController
@RequestMapping(value = "/api/pilotes")
public class PiloteRestApi {

	
	@Autowired
	private PiloteService piloteService;
	
	@GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Pilote>> getAllPilotes(){
		return new ResponseEntity<>(piloteService.getAllPilotes(), HttpStatus.OK);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Pilote> createPilote(@RequestBody Pilote pilote) {
		return new ResponseEntity<>(piloteService.addPilote(pilote), HttpStatus.OK);
	}
	@PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Pilote> updatePilote(@PathVariable(value = "id") int id,
    										@RequestBody Pilote pilote){
		return new ResponseEntity<>(piloteService.updatePilote(id, pilote), HttpStatus.OK);
	}
	@DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> deletePilote(@PathVariable(value = "id") int id){
		return new ResponseEntity<>(piloteService.deletePilote(id), HttpStatus.OK);
	}
	
	
}
