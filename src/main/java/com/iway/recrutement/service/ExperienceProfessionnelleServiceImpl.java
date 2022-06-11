package com.iway.recrutement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.iway.recrutement.model.ExperienceProfessionnelle;
import com.iway.recrutement.repository.ExperienceProfessionnelleRepository;

public class ExperienceProfessionnelleServiceImpl implements ExperienceProfessionnelleService {

	@Autowired
	ExperienceProfessionnelleRepository experienceRepository;
	@Override
	public ExperienceProfessionnelle addExperience(ExperienceProfessionnelle experience) {
		return experienceRepository.save(experience);
	}

	@Override
	public List<ExperienceProfessionnelle> getAllExperiences() {

		return experienceRepository.findAll();
	}

	@Override
	public Optional<ExperienceProfessionnelle> getExperienceById(long id) {

		return experienceRepository.findById(id);
	}

	@Override
	public ExperienceProfessionnelle updateExperience(ExperienceProfessionnelle experience) {

		return experienceRepository.saveAndFlush(experience);
	}

	@Override
	public void deleteExperience(ExperienceProfessionnelle experience) {

		experienceRepository.delete(experience);
	}

}
