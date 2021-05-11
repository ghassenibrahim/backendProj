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

@Entity
public class Type {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="TYPE_ID")//pour renommer l'attribut au dessous dans la table de BD
	private Integer id;
	@Column
	private String libelle;
	@Column
	private String description;
	
	@ManyToOne
	@JoinColumn(name="DEMANDE_ID")
	private Demande demande;
	@OneToMany(mappedBy="type")
	private List<Video> videos;
	@OneToMany(mappedBy="type")
	private List<Logo> logos;
	@OneToMany(mappedBy="type")
	private List<Affiche> affiches;
	
	
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	}	
	

