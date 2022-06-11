package com.iway.recrutement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.iway.recrutement.model.Entretien;
import com.iway.recrutement.service.EntretienService;

@CrossOrigin(origins = "*")
@RestController()
public class EntretienController {

	@Autowired
	EntretienService entretienService;
	
	@RequestMapping(value = "/entretiens/{idCandidat}",method = RequestMethod.GET)
		public List<Entretien> getEntretiens(@PathVariable long idCandidat){
		return entretienService.getEntretienCandidat(idCandidat);
	}
	@RequestMapping(value = "/entretiens",method = RequestMethod.POST)
	public Entretien addEntretien(@RequestBody Entretien entretien) {
		return entretienService.addEntretien(entretien);
	}
	@RequestMapping(value = "/entretiens",method = RequestMethod.PUT)
	public Entretien updateEntretien(@RequestBody Entretien entretien) {
		return entretienService.updateEntretien(entretien);
	}
	@RequestMapping(value = "/entretiens/{id}",method = RequestMethod.DELETE)
	public void deleteEntretien(@PathVariable long id) {
		entretienService.deleteEntretien(id);
	}
}
