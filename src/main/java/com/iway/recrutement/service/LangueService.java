package com.iway.recrutement.service;

import java.util.List;
import java.util.Optional;

import com.iway.recrutement.model.Langue;

public interface LangueService  {

	public Langue addLangue(Langue langue);
	public List<Langue> getAllLangue();
	public Optional<Langue> getLangueById(long id);
	public Langue updateLangue(Langue langue);
	public void deleteLangue(Langue langue);
	
}
