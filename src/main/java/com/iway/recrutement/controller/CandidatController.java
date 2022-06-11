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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.iway.recrutement.mailing.EnvoieEmail;
import com.iway.recrutement.model.Candidat;
import com.iway.recrutement.model.Candidature;
import com.iway.recrutement.model.Email;
import com.iway.recrutement.service.CandidatService;

@CrossOrigin(origins = "*")
@RestController()
public class CandidatController {
	
	@Autowired
	CandidatService candidatService;
	@Autowired
	EnvoieEmail email;
	@RequestMapping(value = "/candidats", method = RequestMethod.POST)
	public Candidat addCandidat(@RequestBody Candidat candidat) {
		return candidatService.addCandidat(candidat);
	}
	
	@RequestMapping(value="/candidats", method =RequestMethod.GET)
	public List<Candidat> listCandidat() {
		return candidatService.getAllCandidat();
	}
	@RequestMapping(value = "/candidats",method = RequestMethod.PUT)
	public Candidat updateCandidature(@Valid @RequestBody Candidat candidat) {
	 //final EnvoieEmail email=new EnvoieEmail();
		//email.send();
		return candidatService.updateCandidat(candidat);
	}
	@RequestMapping(value="/candidats/not_blocked", method =RequestMethod.GET)
	public List<Candidat> listCandidatNotBlocked() {
		return candidatService.getCandidatsBlocked();
	}
	
	@RequestMapping(value="/candidats/{id}", method =RequestMethod.GET)
	public Optional<Candidat> getCandidatById(@PathVariable long id) {
		return candidatService.getCandidatById(id);
	}
	
	@RequestMapping(value="/candidats/etablissement/{etablissement}", method =RequestMethod.GET)
	public List<Candidat> getCandidatsByEtablissement(@PathVariable String etablissement){
		return null;// candidatService.getCandidatsByEtablissement(etablissement);
	}
	
	
	@RequestMapping(value="/candidats/status/{status}", method =RequestMethod.GET)
	public List<Candidat> getCandidatsByStatus(@PathVariable String status){
		return candidatService.getCandidatsByStatus(status);
	}
	@RequestMapping(value="/candidats/accepted", method =RequestMethod.GET)
	public List<Candidat> getCandidatsAccepted(){
		return candidatService.getCandidatsAccepted();
	}
	
	@RequestMapping(value = "/candidats/{id}",method = RequestMethod.DELETE)
	public void deleteCandidat(@PathVariable long id) {
		candidatService.deleteCandidat(id);
	}
	@RequestMapping(value = "/candidats/notifier", method = RequestMethod.POST)
	public void notifier(@RequestBody Email email) {
		final EnvoieEmail envoieEmail=new EnvoieEmail();
		//envoieEmail.send(email.getReceiver(),email.getSubject(),email.getText());
	}
}
