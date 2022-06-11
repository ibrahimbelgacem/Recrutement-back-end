package com.iway.recrutement.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "EXPERIENCEPROFESSIONNELLE")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class ExperienceProfessionnelle implements Serializable {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idExperienceProfessionnelle;
	private String societe;
	private String poste;
	private String mission;
	private Date dateSortie;
	private Date dateEntree;
	@ManyToOne(cascade=CascadeType.ALL)
	private Candidat candidat;
}
