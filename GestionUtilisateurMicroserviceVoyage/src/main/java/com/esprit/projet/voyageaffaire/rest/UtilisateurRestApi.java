package com.esprit.projet.voyageaffaire.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.projet.voyageaffaire.entity.Utilisateur;
import com.esprit.projet.voyageaffaire.service.IUtilisateurService;
import com.esprit.projet.voyageaffaire.service.impl.UtilisateurService;;

@RestController
@RequestMapping(value = "API/utilisateurs")
public class UtilisateurRestApi {
	private String title = "Hello, I'm the Utilisateur Microservice";
	@Autowired
	private IUtilisateurService IUtilisateurService;
	
	@RequestMapping("/hello")
	public String sayHello() {
		System.out.println(title);
		return title;
	}
	
	@PostMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Utilisateur> createUtilisateur(@RequestBody Utilisateur utilisateur) {
		return new ResponseEntity<>(IUtilisateurService.addUtilisateur(utilisateur), HttpStatus.OK);
	}
	
	@PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Utilisateur> updateUtilisateur(@PathVariable(value = "id") int id,
    										@RequestBody Utilisateur utilisateur){
		return new ResponseEntity<>(IUtilisateurService.updateUtilisateur(id, utilisateur), HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> deleteUtilisateur(@PathVariable(value = "id") int id){
		return new ResponseEntity<>(IUtilisateurService.deleteUtilisateur(id), HttpStatus.OK);
	}
}

