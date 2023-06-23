package com.esprit.projet.voyageaffaire.service;

import com.esprit.projet.voyageaffaire.entity.Utilisateur;

public interface IUtilisateurService {
	
	public Utilisateur addUtilisateur(Utilisateur utilisateur);
	public Utilisateur updateUtilisateur(int id, Utilisateur newUtilisateur);
	public String deleteUtilisateur(int id);

}
