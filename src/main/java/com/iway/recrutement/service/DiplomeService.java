package com.iway.recrutement.service;

import java.util.List;
import java.util.Optional;

import com.iway.recrutement.model.Diplome;

public interface DiplomeService {
	
	public Diplome addDiplome(Diplome diplome);
	public List<Diplome> gettAllDiplome();
	public Optional<Diplome> getDiplomeById(long id);
	public Diplome updateDiplome(Diplome diplome);
	public void deleteDiplome(Diplome diplome);

}
