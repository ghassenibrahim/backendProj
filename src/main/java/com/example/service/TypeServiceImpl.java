package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Type;
import com.example.repository.TypeRepository;

@Service
public class TypeServiceImpl implements TypeService {
	@Autowired
private TypeRepository typeRepository;
	@Override
	public List<Type> getAllTypes() {
		
		return typeRepository.findAll();
	}

	@Override
	public Type findById(Integer id) {
		Optional<Type>type=typeRepository.findById(id);
		return type.isPresent()? type.get() : null;
		
	}

	@Override
	public Type update(Type type) {
		
		return typeRepository.save(type);
	}

	@Override
	public Type add(Type type) {
		return typeRepository.save(type);
	}

	@Override
	public void delete(Integer id) {
		 typeRepository.deleteById(id);
	}

}
