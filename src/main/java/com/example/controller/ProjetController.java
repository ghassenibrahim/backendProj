package com.example.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Projet;
import com.example.service.ProjetService;


@CrossOrigin 
@RestController
@RequestMapping("api/projets")
public class ProjetController {
	
	@Autowired 
	private ProjetService projetService;
	
	@GetMapping("")
	public List<Projet> getAllProjets()
	{
	return projetService.getAllProjets();	
	}
	
	@GetMapping("/{id}")
	public Projet getProjetById( @PathVariable Integer id) {
		return projetService.findById(id);
	}
	
	@PostMapping("")
	public Projet addProjet(@RequestBody Projet projet) {
		return  projetService.add(projet);
	}
	
	@PutMapping("/{id}")
	public Projet updateProjet(@PathVariable Integer id, @RequestBody Projet projet) {
	  return projetService.update(projet);
}
	@DeleteMapping("/{id}")
	public void deleteProjet(@PathVariable Integer id) {
		projetService.delete(id);
	}
	}
