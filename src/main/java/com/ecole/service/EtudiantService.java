package com.ecole.service;

import com.ecole.dao.EtudiantRepository;
import com.ecole.model.Etudiant;
import com.ecole.model.Parent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EtudiantService {

    private EtudiantRepository etudiantRepository;

    @Autowired
    public EtudiantService(EtudiantRepository etudiantRepository){
        this.etudiantRepository = etudiantRepository;
    }

    public void ajouterEtudiant(Etudiant etudiant){

            etudiantRepository.save(etudiant);
    }

    public List<Etudiant> getEtudiants(){
        return etudiantRepository.findAll();
    }

    public Etudiant modifierEtudiant(Etudiant etudiant) {
    	return etudiantRepository.save(etudiant);
    }

    public Parent getParent(Long id){
        Etudiant et = etudiantRepository.findById(id).get();
        return et.getParent();
    }

    public Etudiant etudiantsById(Long id) {
        return etudiantRepository.findById(id).get();
    }

    public void supprimerEtudiant(Long id) {
        etudiantRepository.deleteById(id);
    }
}
