package com.iway.recrutement.service;

import java.util.List;
import java.util.Optional;

import com.iway.recrutement.model.Etablissement;

public interface EtablissementService {
	public List<Etablissement> getAllEtablissements();
	public Etablissement saveEtablissement(Etablissement etablissement);
	public Optional<Etablissement> getEtablissementById(long id);
	public Etablissement getEtablissementByNom(String nom);

}
