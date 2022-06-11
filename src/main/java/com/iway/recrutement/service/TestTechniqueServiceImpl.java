package com.iway.recrutement.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iway.recrutement.model.TestTechnique;
import com.iway.recrutement.repository.TestTechniqueRepository;
@Transactional
@Service
public class TestTechniqueServiceImpl implements TestTechniqueService {

	@Autowired
	TestTechniqueRepository testTechniqueRepository;
	
	@Override
	public TestTechnique addTestTechnique(TestTechnique testTechnique) {

		return testTechniqueRepository.save(testTechnique);
	}

	@Override
	public List<TestTechnique> gettAllTestTechnique() {

		return testTechniqueRepository.findAll();
	}

	@Override
	public Optional<TestTechnique> getTestTechniqueById(long id) {

		return testTechniqueRepository.findById(id);
	}

	@Override
	public TestTechnique updateTestTechnique(TestTechnique testTechnique) {

		return testTechniqueRepository.saveAndFlush(testTechnique);
	}

	@Override
	public void deleteTestTechnique(TestTechnique testTechnique) {

		testTechniqueRepository.delete(testTechnique);
	}

}
