package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Affiche;
import com.example.repository.AfficheRepository;

@Service
public class AfficheServiceImpl implements AfficheService {

	@Autowired
	private AfficheRepository afficheRepository;

	@Override
	public List<Affiche> getAllAffiches() {
		
		return afficheRepository.findAll();
	}

	@Override
	public Affiche findById(Integer id) {
		Optional<Affiche>affiche=afficheRepository.findById(id);
		return affiche.isPresent()? affiche.get() : null;
		}

	@Override
	public Affiche update(Affiche affiche) {
		
		return afficheRepository.save(affiche);
	}

	@Override
	public Affiche add(Affiche affiche) {
		return afficheRepository.save(affiche);
	}

	@Override
	public void delete(Integer id) {
		 afficheRepository.deleteById(id);
	}
}
