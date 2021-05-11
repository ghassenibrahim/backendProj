package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Logo;
import com.example.repository.LogoRepository;

@Service
public class LogoServiceImpl  implements LogoService{
	@Autowired
	private LogoRepository logoRepository;

	@Override
	public List<Logo> getAllLogos() {
		
		return logoRepository.findAll();
	}

	@Override
	public Logo findById(Integer id) {
		Optional<Logo>logo=logoRepository.findById(id);
		return logo.isPresent()? logo.get() : null;
		}

	@Override
	public Logo update(Logo logo) {
		
		return logoRepository.save(logo);
	}

	@Override
	public Logo add(Logo logo) {
		return logoRepository.save(logo);
	}

	@Override
	public void delete(Integer id) {
		 logoRepository.deleteById(id);
	}
}
