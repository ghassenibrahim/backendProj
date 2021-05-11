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

import com.example.model.Logo;
import com.example.service.LogoService;

@CrossOrigin
@RestController
@RequestMapping("api/logos")
public class LogoController {
	@Autowired 
	private LogoService logoService;
	@GetMapping("")
	public List<Logo> getAllLogos()
	{
	return logoService.getAllLogos();	
	}
	
	@GetMapping("/{id}")
	public Logo getLogoById( @PathVariable Integer id) {
		return logoService.findById(id);
	}
	
	@PostMapping("")
	public Logo addLogo(@RequestBody Logo logo) {
		return  logoService.add(logo);
	}
	
	@PutMapping("/{id}")
	public Logo updateLogo(@PathVariable Integer id, @RequestBody Logo logo) {
	  return logoService.update(logo);
}
	@DeleteMapping("/{id}")
	public void deleteLogo(@PathVariable Integer id) {
		logoService.delete(id);
	}	
}
