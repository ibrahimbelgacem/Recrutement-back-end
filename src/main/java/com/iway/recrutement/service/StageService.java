package com.iway.recrutement.service;

import java.util.List;
import java.util.Optional;

import com.iway.recrutement.model.Candidat;
import com.iway.recrutement.model.Stage;

public interface StageService {
	
	public Stage addSatge(Stage stage);
	public List<Stage> getAllStages();
	public Optional<Stage> getStageById(long id);
	public Stage updateStage(Stage stage);
	public void deleteStage(Stage stage);
	public List<Stage> getStageByCandidat(Candidat candidat);

}
