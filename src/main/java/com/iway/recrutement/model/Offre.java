package com.iway.recrutement.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 
 * 
 * table offre 
 *
 *
 */
@Entity
@Table(name = "OFFRE")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Offre implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idOffre;
	private String titre;
	private String descriptionBesoin;
	private String descriptionOffre;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date dateSoumission;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date dateCloture;
	private boolean annuler;
	private String profilCherche;
	private String competencesRequises;
	private boolean validationResponsable;
	private String service;
	@OneToMany(fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Candidature> candidatures;

	
}
