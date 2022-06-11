package com.iway.recrutement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iway.recrutement.model.CritereEvaluation;

@Repository
public interface CritereEvaluationRepository extends JpaRepository<CritereEvaluation, Long> {

}
