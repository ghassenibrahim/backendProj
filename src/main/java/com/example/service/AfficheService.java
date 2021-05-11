package com.example.service;

import java.util.List;

import com.example.model.Affiche;

public interface AfficheService {
	
	public List<Affiche> getAllAffiches();
	public Affiche findById(Integer id);
	public Affiche update(Affiche affiche);
	public Affiche add(Affiche affiche);
	public void delete(Integer id);
	
}
