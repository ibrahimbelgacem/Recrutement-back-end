package com.iway.recrutement.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.iway.recrutement.model.Candidat;
import com.iway.recrutement.model.Offre;

@Repository
public interface CandidatRepository extends CandidatExplicitRepository, JpaRepository<Candidat, Long> {

	@Query("select c from Candidat c where anneeExperience >= :experience")
	public List<Candidat> findByExperiences(@Param("experience") int experience);

	@Query("select c from Candidat c where ville = :ville")
	public List<Candidat> findByVille(@Param("ville") String ville);

	@Query("select c from Candidat,DiplomeCandidat,Diplome c,dc,d where"
			+ " c.idCandidat=dc.idDiplomeCandidat and dc.idDiplome=d.idDiplome and d.titre = :diplome")
	public List<Candidat> findByDiplomes(@Param("diplome") String diplome);

	public List<Candidat> findByStatus(String statut);
	

}
