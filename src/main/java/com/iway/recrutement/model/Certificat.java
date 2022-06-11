package com.iway.recrutement.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "CERTIFICAT")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Certificat implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idCertificat;
	private String titre;
	private Date dateObtention;
	private String organisme;
	private String technologie;
	@ManyToOne(cascade=CascadeType.ALL)
	Candidat candidat;

}
