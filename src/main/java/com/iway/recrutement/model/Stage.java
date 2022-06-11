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
@Table(name = "STAGE")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Stage implements Serializable {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idStage;
	private String titre;
	private String mission;
	private String societe;
	private String technologie;
	private int nbMois;
	@ManyToOne(cascade=CascadeType.ALL)
	private Candidat candidat;
}
