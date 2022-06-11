package com.iway.recrutement.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "NIVEAU_LANGUE")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class NiveauLangue implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idNiveauLangue;
	private String niveau;
	private String attesation;
	private String langue;
	//@ManyToOne(cascade=CascadeType.ALL)
	//private Langue langue;
	//@ManyToOne
//	@JsonIgnore
//	private Candidat candidat;
}
