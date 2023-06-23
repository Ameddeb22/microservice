package com.esprit.projet.voyageaffaire.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.esprit.projet.voyageaffaire.entity.Utilisateur;
import com.esprit.projet.voyageaffaire.repository.UtilisateurRepository;
import com.esprit.projet.voyageaffaire.service.IUtilisateurService;

@Service
public class UtilisateurService implements IUtilisateurService{

	@Autowired
	private UtilisateurRepository utilisateurRepository;

	
	@Override
	public Utilisateur addUtilisateur(Utilisateur utilisateur) {
		return utilisateurRepository.save(utilisateur);
	}
	
	@Override
	public Utilisateur updateUtilisateur(int id, Utilisateur newUtilisateur) {
		if (utilisateurRepository.findById(id).isPresent()) {
			Utilisateur existingUtilisateur = utilisateurRepository.findById(id).get();
			existingUtilisateur.setNom(newUtilisateur.getNom());
			return utilisateurRepository.save(existingUtilisateur);
		} else
			return null;
	}
	
	@Override
	public String deleteUtilisateur(int id) {
		if (utilisateurRepository.findById(id).isPresent()) {
			utilisateurRepository.deleteById(id);
			return "utilisateur supprimé";
		} else
			return "utilisateur non supprimé";
	}
	
	public Utilisateur findUserByUserNameAndPassword(String username, String password) {
		Pageable pageable = null;
		return (Utilisateur) utilisateurRepository.UserByUserNameAndPassword(username, password, pageable);
	}
	
	
}
