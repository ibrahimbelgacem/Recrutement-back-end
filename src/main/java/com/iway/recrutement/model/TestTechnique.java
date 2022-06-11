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
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "TEST_TECHNIQUE")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TestTechnique implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idTestTechnique;
	private Date jour;
	@Column(name="heure",unique=true)
	private Date heure;
	private double note;
	@ManyToOne
	private Candidat candidat;
}
