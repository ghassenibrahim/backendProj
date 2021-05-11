package com.example.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Projet {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PROJET_ID")//pour renommer l'attribut au dessous dans la table de BD
	private Integer id;
	@Column
	private String code;
	@Column
	private String libelle;
	@Column
	private String description;
	@Column
	private String datedebut;
	@Column
	private String datefin;
	@Column
	private String etat;
	
	@OneToOne 
	@JoinColumn(name="DEMANDE_ID")
	private Demande demande;	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
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
	public String getDatedebut() {
		return datedebut;
	}
	public void setDatedebut(String datedebut) {
		this.datedebut = datedebut;
	}
	public String getDatefin() {
		return datefin;
	}
	public void setDatefin(String datefin) {
		this.datefin = datefin;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	
}