package com.esprit.projet.rest;

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

import com.esprit.projet.entity.Avion;
import com.esprit.projet.entity.Vol;
import com.esprit.projet.service.impl.AvionService;
import com.esprit.projet.service.impl.VolService;

@RestController
@RequestMapping(value = "/api/avions")
public class AvionRestApi {
	
	@Autowired
	private AvionService avionService;
	
	//http://localhost:8083/api/avions/
	@GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Avion>> getAllAvions(){
		return new ResponseEntity<>(avionService.getAllAvions(), HttpStatus.OK);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Avion> createAvion(@RequestBody Avion avion) {
		return new ResponseEntity<>(avionService.addAvion(avion), HttpStatus.OK);
	}
	
	//http://localhost:8083/api/avions/1
	@PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Avion> updateAvion(@PathVariable(value = "id") int id,
    										@RequestBody Avion avion){
		return new ResponseEntity<>(avionService.updateAvion(id, avion), HttpStatus.OK);
	}
	
	//http://localhost:8083/api/avions/1
	@DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> deleteAvion(@PathVariable(value = "id") int id){
		return new ResponseEntity<>(avionService.deleteAvion(id), HttpStatus.OK);
	}
	

}
