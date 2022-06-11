package com.iway.recrutement.service;

import java.util.List;
import java.util.Optional;

import com.iway.recrutement.model.Competence;

public interface CompetenceService {
	
	public Competence addCompetence(Competence competence);
	public List<Competence> getAllCompetence();
	public Optional<Competence> getCompetenceById(long id);
	public Competence updateCompetence(Competence competence);
	public void deleteCompetence(Competence competence);
	

}
