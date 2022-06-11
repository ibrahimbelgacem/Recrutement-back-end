package com.iway.recrutement.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.iway.recrutement.model.Candidat;
import com.iway.recrutement.model.Entretien;

public class CandidatExplicitRepositoryImpl implements CandidatExplicitRepository {

	@PersistenceContext
	private EntityManager em;
	@Override
	public List<Candidat> findCandidatsAccepted() {
		
		
		return  (List<Candidat>) em.createQuery("select c from Candidat c where status='Accepted'").getResultList();
				}
	@Override
	public List<Candidat> findCandidatsNotBlocked() {

		return (List<Candidat>) em.createQuery("select c from Candidat c where status!='blocked'").getResultList();
	}
	@Override
	public List<Entretien> findEntretienCandidat(long id) {
		
		return (List<Entretien>) em.createQuery("select e from Entretien e,Candidat c where e.candidat = "+id+"  and e.candidat=c.idCandidat").getResultList();
	}

}
