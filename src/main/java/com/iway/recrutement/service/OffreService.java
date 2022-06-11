package com.iway.recrutement.service;

import java.util.List;
import java.util.Optional;

import com.iway.recrutement.model.Offre;

public interface OffreService {

	
	public Offre saveOffre(Offre offre);
	public Offre updateOffre(Offre offre);
	public Optional<Offre> getOffre(long id);
	public List<Offre> getAllOffres();
	public void deleteOffre(long id);
}
