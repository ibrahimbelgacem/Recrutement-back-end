package com.iway.recrutement.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iway.recrutement.model.Diplome;
import com.iway.recrutement.repository.DiplomeRepository;

@Transactional
@Service
public class DiplomeServiceImpl implements DiplomeService {

	@Autowired
	DiplomeRepository diplomeRepository;
	
	@Override
	public Diplome addDiplome(Diplome diplome) {

		return diplomeRepository.save(diplome);
	}

	@Override
	public List<Diplome> gettAllDiplome() {

		return diplomeRepository.findAll();
	}

	@Override
	public Optional<Diplome> getDiplomeById(long id) {

		return diplomeRepository.findById(id);
	}

	@Override
	public Diplome updateDiplome(Diplome diplome) {

		return diplomeRepository.saveAndFlush(diplome);
	}

	@Override
	public void deleteDiplome(Diplome diplome) {

		diplomeRepository.delete(diplome);
	}

}
