package com.iway.recrutement.service;

import java.util.List;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iway.recrutement.model.Certificat;
import com.iway.recrutement.repository.CertificatRepository;

@Transactional
@Service
public class CertificatServiceImpl implements CertificatService {
	@Autowired
	CertificatRepository certificatRepository;
	
	@Override
	public Certificat addCertificat(Certificat certificat) {

		return certificatRepository.save(certificat);
	}

	@Override
	public List<Certificat> gettAllCertificat() {

		return certificatRepository.findAll();
	}

	@Override
	public Optional<Certificat> getCertificatById(long id) {

		return certificatRepository.findById(id);
	}

	@Override
	public Certificat updateCertificat(Certificat certificat) {

		return certificatRepository.saveAndFlush(certificat);
	}

	@Override
	public void deleteCertificat(Certificat certificat) {

		certificatRepository.delete(certificat);
	}

}
