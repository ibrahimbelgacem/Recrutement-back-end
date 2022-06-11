package com.iway.recrutement.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iway.recrutement.model.Candidat;
import com.iway.recrutement.model.Etablissement;
import com.iway.recrutement.repository.CandidatRepository;
import com.iway.recrutement.repository.DiplomeRepository;
@Service
@Transactional
public class CandidatServiceImpl implements CandidatService{

	@Autowired
	CandidatRepository candidatRepository;
	
	@Autowired
	DiplomeRepository diplomeRepository;
	
	@Override
	public Candidat addCandidat(Candidat candidat) {
		return candidatRepository.save(candidat);
	}

	@Override
	public Candidat updateCandidat(Candidat candidat) {
		
		return candidatRepository.saveAndFlush(candidat);
	}

	@Override
	public void removeCandidat(Candidat candidat) {
		
		candidatRepository.delete(candidat);
	}

	@Override
	public List<Candidat> getAllCandidat() {
		return candidatRepository.findAll();
	}

	@Override
	public Optional<Candidat> getCandidatById(long id) {
		return candidatRepository.findById(id);
	}

	@Override
	public List<Candidat> getCandidatsByExperience(int anneeExperience) {
		return candidatRepository.findByExperiences(anneeExperience);
	}

	@Override
	public List<Candidat> getCandidatsByEtablissement(Etablissement etablissement) {
	/*	List<Candidat> candidats = new ArrayList<>();
		
		for (Diplome diplome : diplomeRepository.findByEtablissementId(etablissement.getIdEtablissement())) {
			candidats.addAll(diplome.getDiplomeCandidats())
		}  
		diplomeRepository.findByEtablissementId(etablissement.getIdEtablissement());*/
		return null;//candidatRepository.findByEtablissement(etablissement);
	}

	@Override
	public List<Candidat> getCandidatsByDiplome(String diplome) {
		return candidatRepository.findByDiplomes(diplome);
	}

	@Override
	public List<Candidat> getCandidatsByVille(String ville) {
		return candidatRepository.findByVille(ville);
	}

	@Override
	public List<Candidat> getCandidatsByStatus(String status) {
		return candidatRepository.findByStatus(status);
	}

	@Override
	public List<Candidat> getCandidatsAccepted() {
		
		return candidatRepository.findCandidatsAccepted();
	}

	@Override
	public List<Candidat> getCandidatsBlocked() {
		
		return candidatRepository.findCandidatsNotBlocked();
	}

	@Override
	public void deleteCandidat(long id) {
		candidatRepository.deleteById(id);
		
	}

	



}
