package com.iway.recrutement.service;

import com.iway.recrutement.model.Evaluation;

public interface EvaluationService {
	public Evaluation add(Evaluation evaluation);
	public Evaluation getEvaluation(long id);
	public Evaluation updateEvaluation(long id);
	public void deleteEvaluation(long id);

}
