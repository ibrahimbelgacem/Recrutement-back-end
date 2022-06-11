package com.iway.recrutement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iway.recrutement.model.Etablissement;
@Repository
public interface EtablissementRepository extends JpaRepository<Etablissement, Long> {

	public Etablissement findByNom(String nom);
}
