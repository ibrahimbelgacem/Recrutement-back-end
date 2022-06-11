package com.iway.recrutement.repository;

import java.util.List;

import com.iway.recrutement.model.Candidat;
import com.iway.recrutement.model.Entretien;

public interface CandidatExplicitRepository {
	
	public List<Candidat> findCandidatsAccepted();
	public List<Candidat> findCandidatsNotBlocked();
	public List<Entretien> findEntretienCandidat(long id);
}
