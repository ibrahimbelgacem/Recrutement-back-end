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
@Table(name = "DIPLOMECANDIDAT")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DiplomeCandidat  implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idDiplomeCandidat;
	private Date dateObtention;
	private String mention;
	@ManyToOne(cascade=CascadeType.ALL)
	private Candidat candidat;
	@ManyToOne
	private Diplome diplome;
	@ManyToOne(cascade=CascadeType.ALL)
	private Etablissement etablissement;

}
