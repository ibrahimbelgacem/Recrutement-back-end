package com.iway.recrutement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iway.recrutement.model.CandidatureSpontanee;
@Repository
public interface CandidatureSpontaneeRepository extends JpaRepository<CandidatureSpontanee, Long>{

	List<CandidatureSpontanee> findByStatut(String statut);

}
