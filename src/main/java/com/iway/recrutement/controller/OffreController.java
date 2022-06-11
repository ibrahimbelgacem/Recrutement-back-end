package com.iway.recrutement.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.bonitasoft.engine.exception.BonitaException;
import org.bonitasoft.engine.identity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iway.recrutement.model.Offre;
import com.iway.recrutement.service.OffreService;
@CrossOrigin(origins = "*")
@RestController()
public class OffreController {
	@Autowired
	OffreService offreService;
	
	@RequestMapping(value = "/offres", method = RequestMethod.POST)
	public Offre addOffre(@RequestBody Offre offre) {
		
//		  try { //User user = app.createUser(); BigInteger id=new
//		  
//		   app.startNewProcessInstance(5775898018607406671); } catch
//		  (BonitaException e) { // TODO Auto-generated catch block e.printStackTrace();
//		  }
		 
		return offreService.saveOffre(offre);
	}
	
	
	@RequestMapping(value = "/offres", method = RequestMethod.GET)
	public List<Offre> listOffres() {
		return offreService.getAllOffres();
	}
	
	
	
	@RequestMapping(value = "/offres_landingPage", method = RequestMethod.GET)
	public List<Offre> listOffresLandingPage() {
		return offreService.getAllOffres();
	}
	@RequestMapping(value = "/offres_candidat", method = RequestMethod.GET)
	public List<Offre> listOffresCandidat() {
		return offreService.getAllOffres();
	}
	@RequestMapping(value = "/offres/{id}", method = RequestMethod.GET)
	public 	Optional<Offre> getbyId(@PathVariable  long id) {
		return offreService.getOffre(id);
	}
	@RequestMapping(value="/offres/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable long id) {	
		offreService.deleteOffre(id);
	}
	
	@RequestMapping(value="/offres", method = RequestMethod.PUT)
	public void update(@Valid @RequestBody Offre offre) {	
		offreService.updateOffre(offre);
	}
	
}
