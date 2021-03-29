package com.ecole.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecole.model.Enseignant;

public interface EnseignantRepository extends JpaRepository<Enseignant, Long>{

}
