package com.iway.recrutement.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "CANDIDAT")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Candidat implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idCandidat;
	private String nom;
	private String prenom;
	private String email;
	private Date dateNaiss;
	private String etatCivil;
	private String profil;
	private int anneeExp;
	private String adresse;
	private String ville;
	private int numTel;
	private String status="en attente";
	
	@OneToMany(fetch = FetchType.EAGER,cascade=CascadeType.ALL)
	private List<Certificat> certificats;
	
	@OneToMany (fetch = FetchType.LAZY,cascade=CascadeType.ALL)
	@JsonIgnore
	private List<Stage> stages;

	@OneToMany(cascade=CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<ExperienceProfessionnelle> experiences;
	
	@OneToMany(cascade=CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Competence>competences;
	
	@OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
	@LazyCollection(LazyCollectionOption.FALSE)
	@JsonIgnore
	private List<Candidature>candidatures;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "idCandidature")
	@JsonIgnore
	private List<CandidatureSpontanee>candidaturesSpontanee;
	
	@OneToMany(cascade=CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.FALSE)
	List<Langue> langues;
	
	@OneToMany(cascade = CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.FALSE)
	@JsonIgnore
	private List<Entretien>entretiens;
	
	@OneToMany(cascade=CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<DiplomeCandidat>diplomes;
}
