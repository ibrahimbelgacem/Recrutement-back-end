package com.iway.recrutement.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iway.recrutement.model.Entretien;
import com.iway.recrutement.repository.EntretienRepository;
@Transactional
@Service
public class EntretienServiceImpl implements EntretienService {


	@Autowired
	EntretienRepository entretienRepository;
	
	@Override
	public Entretien addEntretien(Entretien entretien) {

		return entretienRepository.save(entretien);
	}

	@Override
	public List<Entretien> gettAllEntretien() {

		return entretienRepository.findAll();
	}

	@Override
	public Optional<Entretien> getEntretienById(long id) {

		return entretienRepository.findById(id);
	}

	@Override
	public Entretien updateEntretien(Entretien entretien) {

		return entretienRepository.saveAndFlush(entretien);
	}

	@Override
	public void deleteEntretien(long id) {

		entretienRepository.deleteById(id);
	}

	@Override
	public List<Entretien> getEntretienCandidat(long id) {
		
		return entretienRepository.findEntretienCandidat(id);
	}

}

