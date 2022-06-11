package com.iway.recrutement.service;

import java.util.List;
import java.util.Optional;

import com.iway.recrutement.model.ExperienceProfessionnelle;

public interface ExperienceProfessionnelleService {
	
	public ExperienceProfessionnelle addExperience(ExperienceProfessionnelle experience);
	public List<ExperienceProfessionnelle>  getAllExperiences();
	public Optional<ExperienceProfessionnelle>  getExperienceById(long id);
	public ExperienceProfessionnelle updateExperience(ExperienceProfessionnelle experience);
	public void deleteExperience(ExperienceProfessionnelle experience);

}
