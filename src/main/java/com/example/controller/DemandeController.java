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

import com.example.model.Demande;
import com.example.service.DemandeService;




@CrossOrigin
@RestController
@RequestMapping("api/demandes")

public class DemandeController {
	
	@Autowired 
	private DemandeService demandeService;
	
	@GetMapping("")
	public List<Demande> getAllDemandes()
	{
	return demandeService.getAllDemandes();	
	}
	
	@GetMapping("/{id}")
	public Demande getDemandeById( @PathVariable Integer id) {
		return demandeService.findById(id);
	}
	@GetMapping("/demande/{id}")
	public List<Demande> get1(@PathVariable("id") int id){
		return demandeService.getDemandesSent(id);
	}	
	@PostMapping("")
	public Demande addDemande(@RequestBody Demande demande) {
		return  demandeService.add(demande);
	}
	
	@PutMapping("/{id}")
	public Demande updateDemande(@PathVariable Integer id, @RequestBody Demande demande) {
	  return demandeService.update(demande);
}
	@DeleteMapping("/{id}")
	public void deleteDemande(@PathVariable Integer id) {
		demandeService.delete(id);
	}
		
	}
