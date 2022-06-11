package com.iway.recrutement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iway.recrutement.model.Candidature;
import com.iway.recrutement.model.CandidatureSpontanee;
import com.iway.recrutement.repository.CandidatureSpontaneeRepository;
import com.iway.recrutement.service.CandidatureSpontaneeService;

@CrossOrigin(origins = "*")
@RestController()
public class CandidatureSpontaneeController {

	@Autowired
	CandidatureSpontaneeService candidatureSpontaneeService;
	
	@RequestMapping(value = "/candidature_Spontanees", method = RequestMethod.POST)
	public CandidatureSpontanee addCandidatureSpontanee(@RequestBody CandidatureSpontanee candidaureSpontanee) {
		return candidatureSpontaneeService.addCandidatureSpontanee(candidaureSpontanee);
	}
	
	@RequestMapping(value = "/candidature_Spontanees", method = RequestMethod.GET)
	public List<CandidatureSpontanee> getAllCandidatureSpontanee() {
		return candidatureSpontaneeService.getAllCandidatureSpontanee();
	}
	@RequestMapping(value = "/candidature_Spontanees/{id}",method = RequestMethod.DELETE)
	public void deleteCandidature(@PathVariable long id) {
		candidatureSpontaneeService.deleteCandidatureSpontanee(id);
	}
	
	@RequestMapping(value = "/candidature_Spontanees/{id}",method = RequestMethod.GET)
	public Optional<CandidatureSpontanee> getCandidatureById(@PathVariable long id) {
		return candidatureSpontaneeService.getCandidatureSpontaneeById(id);
	}
}
