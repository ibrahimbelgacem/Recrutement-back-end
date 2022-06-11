package com.iway.recrutement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iway.recrutement.model.Candidat;
import com.iway.recrutement.model.Stage;

@Repository
public interface StageRepository extends JpaRepository<Stage, Long>{

	List<Stage> findByCandidat(Candidat candidat);

}
