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

import com.example.model.Affiche;
import com.example.service.AfficheService;

@CrossOrigin
@RestController
@RequestMapping("api/affiches")
public class AfficheController {
	@Autowired 
	private AfficheService afficheService;
	@GetMapping("")
	public List<Affiche> getAllAffiches()
	{
	return afficheService.getAllAffiches();	
	}
	
	@GetMapping("/{id}")
	public Affiche getAfficheById( @PathVariable Integer id) {
		return afficheService.findById(id);
	}
	
	@PostMapping("")
	public Affiche addAffiche(@RequestBody Affiche affiche) {
		return  afficheService.add(affiche);
	}
	
	@PutMapping("/{id}")
	public Affiche updateAffiche(@PathVariable Integer id, @RequestBody Affiche affiche) {
	  return afficheService.update(affiche);
}
	@DeleteMapping("/{id}")
	public void deleteAffiche(@PathVariable Integer id) {
		afficheService.delete(id);
	}

	
	
	
}
