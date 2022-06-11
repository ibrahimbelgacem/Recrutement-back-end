package com.iway.recrutement.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iway.recrutement.model.CandidatureSpontanee;
import com.iway.recrutement.repository.CandidatureSpontaneeRepository;

@Transactional
@Service
public class CandidatureSpontaneeServiceImpl implements CandidatureSpontaneeService {
	@Autowired
	CandidatureSpontaneeRepository candidatureSpontaneeRepository;
	
	@Override
	public CandidatureSpontanee addCandidatureSpontanee(CandidatureSpontanee candidatureSpontanee) {

		return candidatureSpontaneeRepository.save(candidatureSpontanee);
	}

	@Override
	public List<CandidatureSpontanee> getAllCandidatureSpontanee() {

		return candidatureSpontaneeRepository.findAll();
	}

	@Override
	public Optional<CandidatureSpontanee> getCandidatureSpontaneeById(long id) {

		return candidatureSpontaneeRepository.findById(id);
	}

	@Override
	public CandidatureSpontanee updateCandidatureSpontanee(CandidatureSpontanee candidatureSpontanee) {

		return candidatureSpontaneeRepository.saveAndFlush(candidatureSpontanee);
	}

	@Override
	public void deleteCandidatureSpontanee(CandidatureSpontanee candidatureSpontanee) {

		candidatureSpontaneeRepository.delete(candidatureSpontanee);
	}

	@Override
	public List<CandidatureSpontanee> getCandidatureSpontaneeByStaut(String statut) {
		
		return candidatureSpontaneeRepository.findByStatut(statut);
	}

	@Override
	public void deleteCandidatureSpontanee(long id) {
		candidatureSpontaneeRepository.deleteById(id);
		
	}

}
