package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.model.Demande;


@Repository
public interface DemandeRepository extends JpaRepository<Demande, Integer>{
	@Query("select d from Demande d where d.user.id=?1")
	public List<Demande> getAllDemandeSent(int id);


}

