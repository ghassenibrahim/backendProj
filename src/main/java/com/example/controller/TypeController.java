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
import com.example.model.Type;
import com.example.service.TypeService;

@CrossOrigin
@RestController
@RequestMapping("api/types")

public class TypeController {
	
	@Autowired 
	private TypeService typeService;
	
	@GetMapping("")
	public List<Type> getAllTypes()
	{
	return typeService.getAllTypes();	
	}
	
	@GetMapping("/{id}")
	public Type getTypeById( @PathVariable Integer id) {
		return typeService.findById(id);
	}
	
	@PostMapping("")
	public Type addType(@RequestBody Type type) {
		return  typeService.add(type);
	}
	
	@PutMapping("/{id}")
	public Type updateType(@PathVariable Integer id, @RequestBody Type type) {
	  return typeService.update(type);
}
	@DeleteMapping("/{id}")
	public void deleteType(@PathVariable Integer id) {
		typeService.delete(id);
	}
	}