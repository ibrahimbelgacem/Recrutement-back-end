package com.iway.recrutement.service;

import java.util.List;
import java.util.Optional;

import com.iway.recrutement.model.TestTechnique;

public interface TestTechniqueService {

	
	public TestTechnique addTestTechnique(TestTechnique testTechnique);
	public List<TestTechnique> gettAllTestTechnique();
	public Optional<TestTechnique> getTestTechniqueById(long id);
	public TestTechnique updateTestTechnique(TestTechnique testTechnique);
	public void deleteTestTechnique(TestTechnique testTechnique);
}
