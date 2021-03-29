package com.ecole.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecole.model.Classe;
import com.ecole.model.Etudiant;
import com.ecole.service.ClasseService;

@RestController
@RequestMapping("classe")
public class ClasseController {
	
	private ClasseService classeService;
	
	@Autowired
	public ClasseController(ClasseService classeService) {
		
		this.classeService = classeService;
	}
	
	@GetMapping("{id}/etudiants")
	public Set<Etudiant> getAllEtudiants(@PathVariable Long id){
		
		return classeService.getAllEtudiants(id);
	}
	
	@GetMapping("all")
	public List<Classe> getClasses(){
		
		return classeService.getClasses();
	}
	
	@PutMapping("change")
	public Classe putClasse(@RequestBody Classe classe) {
		
		return classeService.putClasse(classe);
	}
}
