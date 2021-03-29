package com.ecole.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecole.model.Enseignant;
import com.ecole.service.EnseignantService;

@RestController
@RequestMapping("enseignant")
public class EnseignantController {
	
	private EnseignantService enseignantService;
	
	@Autowired
	public EnseignantController(EnseignantService enseignantService) {
		
		this.enseignantService = enseignantService;
	}

    @GetMapping("all")
    public List<Enseignant> afficher(){
        return enseignantService.getEnseignants();
    }

    @PostMapping("save")
    public void ajouterEnseignant(@RequestBody Enseignant enseignant){

    	enseignantService.ajouterEnseignant(enseignant);
    }

    @PutMapping("change")
    public Enseignant modifierEnseignant(@RequestBody Enseignant enseignant){
        return enseignantService.modifierEnseignant(enseignant);
    }

    @DeleteMapping("{id}")
    public void supprimerEnseignant(@PathVariable("id") Long id){
    	enseignantService.supprimerEnseignant(id);
    }
}
