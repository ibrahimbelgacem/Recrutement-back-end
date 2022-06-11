package com.iway.recrutement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iway.recrutement.model.Competence;
@Repository
public interface CompetenceRepository extends JpaRepository<Competence, Long> {

}
