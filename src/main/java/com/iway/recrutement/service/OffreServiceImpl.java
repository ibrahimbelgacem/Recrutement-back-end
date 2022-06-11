package com.iway.recrutement.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iway.recrutement.model.Offre;
import com.iway.recrutement.repository.OffreRepository;
@Service
@Transactional
public class OffreServiceImpl implements OffreService{
	
	@Autowired
	OffreRepository offreRespository;

	@Override
	public Offre saveOffre(Offre offre) {
		return offreRespository.save(offre);
		
	}

	@Override
	public Offre updateOffre(Offre offre) {
		// TODO Auto-generated method stub
		return offreRespository.saveAndFlush(offre);
	}

	@Override
	public Optional<Offre> getOffre(long id) {
		return offreRespository.findById(id);
	}

	@Override
	public List<Offre> getAllOffres() {
		return offreRespository.findAll();
	}

	@Override
	public void deleteOffre(long id) {
		offreRespository.deleteById(id);
	}

}
