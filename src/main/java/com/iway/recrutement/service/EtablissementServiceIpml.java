package com.iway.recrutement.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iway.recrutement.model.Etablissement;
import com.iway.recrutement.repository.EtablissementRepository;
@Service
@Transactional
public class EtablissementServiceIpml implements EtablissementService {

	@Autowired
	EtablissementRepository etablissementRepository;
	@Override
	public List<Etablissement> getAllEtablissements() {
		return etablissementRepository.findAll();
	}

	@Override
	public Etablissement saveEtablissement(Etablissement etablissement) {
		return etablissementRepository.save(etablissement);
	}

	@Override
	public Optional<Etablissement> getEtablissementById(long id) {
		return etablissementRepository.findById(id);
	}

	@Override
	public Etablissement getEtablissementByNom(String nom) {
		return etablissementRepository.findByNom(nom);
	}

}
