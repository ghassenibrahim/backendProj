package com.example.service;

import java.util.List;

import com.example.model.Logo;

public interface LogoService {
	public List<Logo> getAllLogos();
	public Logo findById(Integer id);
	public Logo update(Logo logo);
	public Logo add(Logo logo);
	public void delete(Integer id);	
}
