package com.example.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Logo;

@Repository
public interface LogoRepository extends JpaRepository<Logo, Integer> {

}
