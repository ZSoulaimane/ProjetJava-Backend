package com.ecole.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecole.model.Classe;

public interface ClasseRepository extends JpaRepository<Classe, Long> {

}
