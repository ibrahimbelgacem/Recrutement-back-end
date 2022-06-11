package com.iway.recrutement.service;

import java.util.List;
import java.util.Optional;

import com.iway.recrutement.model.Candidature;
import com.iway.recrutement.model.Offre;

public interface CandidatureService {

	public Candidature addCandidature(Candidature candidature);
	public List<Candidature> getAllCandidatures();
	public Candidature updateCandidature(Candidature candidature);
	public void deleteCandidature(long id);
	public Optional<Candidature> getCandidatureById(long id);
	public List<Candidature> getCandidatureByState(String statut);
	public List<Candidature>getCandidatureByOffre(Optional<Offre> offre);
	public List<Candidature> filtreCandidatureByExperience(int anneeExperience);
	
	
		
	
	
}
