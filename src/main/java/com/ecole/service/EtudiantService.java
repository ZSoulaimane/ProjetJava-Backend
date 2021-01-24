package com.ecole.service;

import com.ecole.dao.EtudiantRepository;
import com.ecole.model.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.Null;
import java.util.List;
import java.util.Optional;

@Service
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

    public Etudiant modifierEtudiant(Long id, Etudiant etudiant) {
        Optional<Etudiant> etOp = etudiantRepository.findById(id);
        if(etOp.isPresent()){
            etudiant.setId(id);
            return etudiantRepository.save(etudiant);
        }else return etOp.get();
    }

    public Etudiant etudiantsById(Long id) {
        return etudiantRepository.findById(id).get();
    }

    public void supprimerEtudiant(Long id) {
        etudiantRepository.deleteById(id);
    }
}
