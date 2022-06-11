package com.iway.recrutement.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iway.recrutement.model.Entretien;

@Repository
public interface EntretienRepository extends CandidatExplicitRepository, JpaRepository<Entretien, Long> {
	
	
	@Query("select e from Entretien e,Candidat c where e.candidat = ?1  and e.candidat=c.idCandidat ")
	
	public List<Entretien> findByCandidat(long idCandidat);

}
