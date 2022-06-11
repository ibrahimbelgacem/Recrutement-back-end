package com.iway.recrutement.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iway.recrutement.model.Langue;
import com.iway.recrutement.repository.LangueRepository;

@Transactional
@Service
public class LangueServiceImpl implements LangueService {

	@Autowired
	LangueRepository langueRepository;
	@Override
	public Langue addLangue(Langue langue) {

		return langueRepository.save(langue);
	}

	@Override
	public List<Langue> getAllLangue() {

		return langueRepository.findAll();
	}

	@Override
	public Optional<Langue> getLangueById(long id) {

		return langueRepository.findById(id);
	}

	@Override
	public Langue updateLangue(Langue langue) {

		return langueRepository.saveAndFlush(langue);
	}

	@Override
	public void deleteLangue(Langue langue) {

		langueRepository.delete(langue);
	}

}
