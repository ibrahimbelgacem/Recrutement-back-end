package com.iway.recrutement.service;

import java.util.List;
import java.util.Optional;

import com.iway.recrutement.model.Candidat;
import com.iway.recrutement.model.Etablissement;

public interface CandidatService {
	public Candidat addCandidat(Candidat candidat);
	public Candidat updateCandidat(Candidat candidat);
	public void removeCandidat(Candidat candidat);
	public List<Candidat> getAllCandidat();
	public List<Candidat> getCandidatsBlocked();
	public Optional<Candidat> getCandidatById(long id);
	public List<Candidat> getCandidatsByExperience(int anneeExperience);
	public List<Candidat> getCandidatsByEtablissement(Etablissement etablissement);
	public List<Candidat> getCandidatsByDiplome(String diplome);
	public List<Candidat> getCandidatsByVille(String ville);
	public List<Candidat> getCandidatsByStatus(String status);
	public List<Candidat> getCandidatsAccepted();
	public void deleteCandidat(long id);
	//public void notifier(String email);
}
