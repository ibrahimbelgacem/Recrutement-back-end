package com.iway.recrutement.service;

import java.util.List;
import java.util.Optional;

import com.iway.recrutement.model.CandidatureSpontanee;

public interface CandidatureSpontaneeService {

	public CandidatureSpontanee addCandidatureSpontanee(CandidatureSpontanee candidatureSpontanee);
	public List<CandidatureSpontanee> getAllCandidatureSpontanee();
	public List<CandidatureSpontanee> getCandidatureSpontaneeByStaut(String statut);
	public Optional<CandidatureSpontanee> getCandidatureSpontaneeById(long id);
	public CandidatureSpontanee updateCandidatureSpontanee(CandidatureSpontanee candidatureSpontanee);
	public void deleteCandidatureSpontanee(CandidatureSpontanee candidatureSpontanee);
	public void deleteCandidatureSpontanee(long id);
}
