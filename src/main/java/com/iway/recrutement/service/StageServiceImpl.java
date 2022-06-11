package com.iway.recrutement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.iway.recrutement.model.Candidat;
import com.iway.recrutement.model.Stage;
import com.iway.recrutement.repository.StageRepository;

public class StageServiceImpl implements StageService {

	@Autowired 
	StageRepository stageRepository;
	@Override
	public Stage addSatge(Stage stage) {

		return stageRepository.save(stage);
	}

	@Override
	public List<Stage> getAllStages() {
		return stageRepository.findAll();
	}

	@Override
	public Optional<Stage> getStageById(long id) {

		
		return stageRepository.findById(id);
	}

	@Override
	public Stage updateStage(Stage stage) {
		return stageRepository.saveAndFlush(stage);
	}

	@Override
	public void deleteStage(Stage stage) {

		stageRepository.delete(stage);
	}

	@Override
	public List<Stage> getStageByCandidat(Candidat candidat) {
		return stageRepository.findByCandidat(candidat);
	}

}
