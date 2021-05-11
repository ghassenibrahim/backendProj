package com.example.service;

import java.util.List;
import com.example.model.Projet;

public interface ProjetService {
	public List<Projet> getAllProjets();
	public Projet findById(Integer id);
	public Projet update(Projet projet);
	public Projet add(Projet projet);
	public void delete(Integer id);
	
}
