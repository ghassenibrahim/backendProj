package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Logo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="LOGO_ID")//pour renommer l'attribut au dessous dans la table de BD
	private Integer id;
	@Column
	private String dimensions;
	@Column
	private String couleurs;
	@Column
	private String  support;
	@Column
	private String  version;
	@Column
	private String  typel  ;
	@Column
	private String  exemple;
	
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

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getTypel() {
		return typel;
	}

	public void setTypel(String typel) {
		this.typel = typel;
	}

	

}
