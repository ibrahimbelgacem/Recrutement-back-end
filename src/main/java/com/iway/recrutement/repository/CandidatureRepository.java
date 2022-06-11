package com.iway.recrutement.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iway.recrutement.model.Candidature;
import com.iway.recrutement.model.Offre;

@Repository
public interface CandidatureRepository extends JpaRepository<Candidature, Long>{

	public List<Candidature> findCandidatureByStatut(String statut);
	public List<Candidature>findByOffre(Optional<Offre> offre);
	
}
