package com.iway.recrutement.model;


import java.io.Serializable;

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
@Table(name = "EVALUATION")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Evaluation implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idEvaluation;
	private double note;
	private String motif;
	private String decision;
//	@ManyToOne(cascade = CascadeType.ALL)
//	private Entretien entretien;
	
}
