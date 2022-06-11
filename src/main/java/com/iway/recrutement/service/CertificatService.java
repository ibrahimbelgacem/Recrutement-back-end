package com.iway.recrutement.service;

import java.util.List;
import java.util.Optional;

import com.iway.recrutement.model.Certificat;

public interface CertificatService {

	
	public Certificat addCertificat(Certificat certificat);
	public List<Certificat> gettAllCertificat();
	public Optional<Certificat> getCertificatById(long id);
	public Certificat updateCertificat(Certificat certificat);
	public void deleteCertificat(Certificat certificat);
}
