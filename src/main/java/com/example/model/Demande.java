package com.example.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Demande {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="DEMANDE_ID")//pour renommer l'attribut au dessous dans la table de BD
	private Integer id;
	@Column
	private String libelle;
	@Column
	private String sujet;
	@Column
	private String date;
	@Column
	private String description;
	@Column
	private String type;
	@OneToMany(mappedBy="demande")
	private List<Type> types;
	
	@ManyToOne
	@JoinColumn(name="USER_ID")
	private User user;	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getSujet() {
		return sujet;
	}
	public void setSujet(String sujet) {
		this.sujet = sujet;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}

