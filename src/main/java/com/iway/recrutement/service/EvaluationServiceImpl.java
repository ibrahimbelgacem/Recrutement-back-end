package com.iway.recrutement.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iway.recrutement.model.Evaluation;
import com.iway.recrutement.repository.EvaluationRepository;
@Service
@Transactional
public class EvaluationServiceImpl implements EvaluationService {

	@Autowired
	EvaluationRepository evaluationRepository;
	@Override
	public Evaluation add(Evaluation evaluation) {
		return evaluationRepository.save(evaluation);
	}

	@Override
	public Evaluation getEvaluation(long id) {
		return null;
	}

	@Override
	public Evaluation updateEvaluation(long id) {
		return null;
	}

	@Override
	public void deleteEvaluation(long id) {
		// TODO Auto-generated method stub

	}

}
