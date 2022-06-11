package com.iway.recrutement.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iway.recrutement.model.Candidature;
import com.iway.recrutement.model.Offre;
import com.iway.recrutement.repository.CandidatureRepository;
@Service
@Transactional
public class CandidatureServiceImpl implements CandidatureService {

	@Autowired
	CandidatureRepository candidatureRepository;
	
	@Override
	public Candidature addCandidature(Candidature candidature) {
		return candidatureRepository.save(candidature);
	}

	@Override
	public List<Candidature> getAllCandidatures() {
		return candidatureRepository.findAll();
	}

	@Override
	public Candidature updateCandidature(Candidature candidature) {
		return candidatureRepository.saveAndFlush(candidature);
	}

	@Override
	public void deleteCandidature(long id) {
		
		candidatureRepository.deleteById(id);
	}

	@Override
	public List<Candidature> getCandidatureByState(String statut) {
		return candidatureRepository.findCandidatureByStatut(statut);
	}

	@Override
	public List<Candidature> getCandidatureByOffre(Optional<Offre> offre) {
		return candidatureRepository.findByOffre(offre);
	}


	@Override
	public Optional<Candidature> getCandidatureById(long id) {
		return candidatureRepository.findById(id);
	}

	@Override
	public List<Candidature> filtreCandidatureByExperience(int anneeExperience) {
		// TODO Auto-generated method stub
		return null;
	}

}
