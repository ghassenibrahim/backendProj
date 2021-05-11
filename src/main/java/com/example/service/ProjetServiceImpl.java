package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Projet;
import com.example.repository.ProjetRepository;

@Service
public class ProjetServiceImpl implements ProjetService {
	@Autowired
private ProjetRepository projetRepository;
	@Override
	public List<Projet> getAllProjets() {
		
		return projetRepository.findAll();
	}

	@Override
	public Projet findById(Integer id) {
		Optional<Projet>projet=projetRepository.findById(id);
		return projet.isPresent()? projet.get() : null;
		
	}

	@Override
	public Projet update(Projet projet) {
		
		return projetRepository.save(projet);
	}

	@Override
	public Projet add(Projet projet) {
		return projetRepository.save(projet);
	}

	@Override
	public void delete(Integer id) {
		 projetRepository.deleteById(id);
	}

}
