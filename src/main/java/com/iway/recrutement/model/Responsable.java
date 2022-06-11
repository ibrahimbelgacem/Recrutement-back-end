package com.iway.recrutement.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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
@Table(name = "RESPONSABLE")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Responsable implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idResponsable;
	private String nomEtPrenom;
	private String email;
	private String mdp;
	private String poste;
	private int numTel;
	@OneToMany
	List<Entretien> entretien;

}
