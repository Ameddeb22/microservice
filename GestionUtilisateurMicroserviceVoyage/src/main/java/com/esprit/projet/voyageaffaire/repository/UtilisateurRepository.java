package com.esprit.projet.voyageaffaire.repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.esprit.projet.voyageaffaire.entity.Utilisateur;


public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
	@Query("select c from Utilisateur c where c.username like :username and c.password like :password")
	public Page<Utilisateur> UserByUserNameAndPassword(@Param("username") String username,@Param("password") String password, Pageable pageable);
	
	
	@Query("select c from Utilisateur c where c.cin like :cin")
	public Utilisateur UserByCin(@Param("cin") String cin);
	
	@Query("select c from Utilisateur c where c.nom like :nom")
	public Utilisateur UserByNom(@Param("nom") String nom);
}
