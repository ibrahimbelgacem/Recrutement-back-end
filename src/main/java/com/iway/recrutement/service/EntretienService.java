package com.iway.recrutement.service;

import java.util.List;
import java.util.Optional;
import com.iway.recrutement.model.Entretien;

public interface EntretienService {

	public Entretien addEntretien(Entretien entretien);
	public List<Entretien> gettAllEntretien();
	public Optional<Entretien> getEntretienById(long id);
	public Entretien updateEntretien(Entretien entretien);
	public void deleteEntretien(long id);
	public List<Entretien> getEntretienCandidat(long id);
}
