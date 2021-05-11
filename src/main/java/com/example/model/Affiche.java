package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Affiche {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="AFFICHE_ID")//pour renommer l'attribut au dessous dans la table de BD	
	private Integer id;
	@Column
	private String dimensions;
	@Column
	private Integer nbrimages;	
	@Column
	private String couleurs;
	@Column
	private String support;
	@Column
	private String exemple;
	
	@ManyToOne
	@JoinColumn(name="TYPE_ID")
	private Type type;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDimensions() {
		return dimensions;
	}

	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}

	public Integer getNbrimages() {
		return nbrimages;
	}

	public void setNbrimages(Integer nbrimages) {
		this.nbrimages = nbrimages;
	}

	public String getCouleurs() {
		return couleurs;
	}

	public void setCouleurs(String couleurs) {
		this.couleurs = couleurs;
	}

	public String getSupport() {
		return support;
	}

	public void setSupport(String support) {
		this.support = support;
	}

	public String getExemple() {
		return exemple;
	}

	public void setExemple(String exemple) {
		this.exemple = exemple;
	}



	 
     
}
