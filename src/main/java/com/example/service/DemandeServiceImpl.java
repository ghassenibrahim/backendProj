package com.example.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Demande;
import com.example.repository.DemandeRepository;

@Service
public class DemandeServiceImpl implements DemandeService {
	@Autowired
private DemandeRepository demandeRepository;
	@Override
	public List<Demande> getAllDemandes() {
		
		return demandeRepository.findAll();
	}

	@Override
	public Demande findById(Integer id) {
		Optional<Demande>demande=demandeRepository.findById(id);
		return demande.isPresent()? demande.get() : null;
		
	}

	@Override
	public Demande update(Demande demande) {
		
		return demandeRepository.save(demande);
	}

	@Override
	public Demande add(Demande demande) {
		return demandeRepository.save(demande);
	}

	@Override
	public void delete(Integer id) {
		 demandeRepository.deleteById(id);
	}

	@Override
	public List<Demande> getDemandesSent(int id) {
		return demandeRepository.getAllDemandeSent(id);

	}

	

}
