package com.iway.recrutement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iway.recrutement.model.Offre;
@Repository
public interface OffreRepository extends JpaRepository<Offre, Long> {

}
