package com.ecole.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecole.dao.ClasseRepository;
import com.ecole.model.Classe;
import com.ecole.model.Etudiant;

@Service
public class ClasseService {
	
	private ClasseRepository classeRepository;
	
	@Autowired
	public ClasseService(ClasseRepository classeRepository) {
		
		this.classeRepository = classeRepository;
	}

	public Set<Etudiant> getAllEtudiants(Long id) {
		return classeRepository.findById(id).get().getEtudiants();
	}

	public List<Classe> getClasses() {
		
		return classeRepository.findAll();
	}

	public Classe putClasse(Classe classe) {
		
		return classeRepository.save(classe);
	}
}
