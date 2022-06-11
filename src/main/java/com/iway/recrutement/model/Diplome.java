package com.iway.recrutement.model;

import java.io.Serializable;
import java.util.List;

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

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "DIPLOME")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Diplome implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idDiplome;
	private String titre;
	private String specialite;
	@ManyToOne
	private Etablissement etablissement;
	
	@OneToMany
	private List<DiplomeCandidat>diplomeCandidats;

}
