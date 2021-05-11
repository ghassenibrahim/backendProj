package com.example.service;
import java.util.List;

import com.example.model.Type;


public interface TypeService {
	public List<Type> getAllTypes();
	public Type findById(Integer id);
	public Type update(Type type);
	public Type add(Type type);
	public void delete(Integer id);
	
}
