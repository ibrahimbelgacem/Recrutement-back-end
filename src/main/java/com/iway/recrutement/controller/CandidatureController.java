package com.iway.recrutement.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iway.recrutement.model.Candidature;
import com.iway.recrutement.model.Offre;
import com.iway.recrutement.service.CandidatureService;
import com.iway.recrutement.service.OffreService;

@CrossOrigin(origins = "*")
@RestController()
public class CandidatureController {

	@Autowired
	CandidatureService candidatureService;
	@Autowired
	OffreService offreService;
	
	@RequestMapping(value = "/candidatures",method = RequestMethod.GET)
	public List<Candidature> listCandidature(){
		return candidatureService.getAllCandidatures();
	}
	
	@RequestMapping(value = "/candidatures",method = RequestMethod.POST)
	public Candidature addCandidature(@RequestBody Candidature candidature) {
		return candidatureService.addCandidature(candidature);
	}
	
	@RequestMapping(value = "/candidatures/{id}",method = RequestMethod.GET)
	public Optional<Candidature> getCandidatureById(@PathVariable long id) {
		return candidatureService.getCandidatureById(id);
	}
	
	
	@RequestMapping(value = "/candidatures/statut/{statut}",method = RequestMethod.GET)
	
	public List<Candidature> listCandidatureByEtat(@PathVariable String statut){
		return candidatureService.getCandidatureByState(statut	);
	}
	@RequestMapping(value = "/candidatures",method = RequestMethod.PUT)
	public Candidature updateCandidature(@Valid @RequestBody Candidature candidature) {
		return candidatureService.updateCandidature(candidature);
	}
	@RequestMapping(value = "/candidatures/offre/{id}",method = RequestMethod.GET)
	public List<Candidature> listCandidatureByOffre(@PathVariable long id) {
		Optional<Offre> offre = null;
		
			offre = offreService.getOffre(id);
		if (offre != null)
			return candidatureService.getCandidatureByOffre(offre);
		return null;
	}
	
	@RequestMapping(value = "/candidatures/{id}",method = RequestMethod.DELETE)
	public void deleteCandidature(@PathVariable long id) {
		candidatureService.deleteCandidature(id);
	}
}
