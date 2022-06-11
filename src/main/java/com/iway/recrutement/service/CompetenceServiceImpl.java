package com.iway.recrutement.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iway.recrutement.model.Competence;
import com.iway.recrutement.repository.CompetenceRepository;

@Transactional
@Service
public class CompetenceServiceImpl implements CompetenceService {

	@Autowired
	CompetenceRepository competenceRepository;
	@Override
	public Competence addCompetence(Competence competence) {
		return competenceRepository.save(competence);
	}

	@Override
	public List<Competence> getAllCompetence() {
		return competenceRepository.findAll();
	}

	@Override
	public Optional<Competence> getCompetenceById(long id) {

		return competenceRepository.findById(id);
	}

	@Override
	public Competence updateCompetence(Competence competence) {

		return competenceRepository.saveAndFlush(competence);
	}

	@Override
	public void deleteCompetence(Competence competence) {

		competenceRepository.delete(competence);
	}

}
