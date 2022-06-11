package com.iway.recrutement.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "LANGUE")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Langue implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idLangue;
	private String nom;
	private String niveau;
	private String attestation;
	//@OneToMany(cascade = CascadeType.ALL)
	//@JsonIgnore
	//private List<NiveauLangue>niveauLangues;
	@ManyToOne(cascade = CascadeType.ALL)
	private Candidat candidat;
	
}
