package com.ecole.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecole.dao.EnseignantRepository;
import com.ecole.model.Enseignant;
import com.ecole.model.Etudiant;

@Service
public class EnseignantService {
	
	private EnseignantRepository enseignantRepository;
	
	@Autowired
	public EnseignantService(EnseignantRepository enseignantRepository) {
		
		this.enseignantRepository = enseignantRepository;
	}

	public List<Enseignant> getEnseignants() {
		
		return enseignantRepository.findAll();
	}

	public Enseignant modifierEnseignant(Enseignant enseignant) {
		
		return enseignantRepository.save(enseignant);
	}

	public void ajouterEnseignant(Enseignant enseignant) {
		
		enseignantRepository.save(enseignant);
	}

	public void supprimerEnseignant(Long id) {
		
		enseignantRepository.deleteById(id);
	}
	
	

}
