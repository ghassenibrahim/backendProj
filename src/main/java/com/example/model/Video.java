package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Video {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="VIDEO_ID")//pour renommer l'attribut au dessous dans la table de BD
	private Integer id;
	@Column
	private String duree;
	@Column
	private Integer nbrimages;	
	@Column
	private String dimensions;
	@Column
	private String version;
	@Column
	private String couleurs;
	
	@ManyToOne
	@JoinColumn(name="TYPE_ID")
	private Type type;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDuree() {
		return duree;
	}
	public void setDuree(String duree) {
		this.duree = duree;
	}
	public Integer getNbrimages() {
		return nbrimages;
	}
	public void setNbrimages(Integer nbrimages) {
		this.nbrimages = nbrimages;
	}
	public String getDimensions() {
		return dimensions;
	}
	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getCouleurs() {
		return couleurs;
	}
	public void setCouleurs(String couleurs) {
		this.couleurs = couleurs;
	}

}
