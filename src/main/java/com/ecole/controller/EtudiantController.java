package com.ecole.controller;

import com.ecole.model.Etudiant;
import com.ecole.service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("etudiant")
@RestController
public class EtudiantController {

    private EtudiantService etudiantService;

    @Autowired
    public EtudiantController(EtudiantService etudiantService){
        this.etudiantService = etudiantService;
    }

    @GetMapping("{id}")
    public Etudiant EtudiantById(@PathVariable("id") Long id){
        return etudiantService.etudiantsById(id);
    }

    @GetMapping("all")
    public List<Etudiant> afficher(){
        return etudiantService.getEtudiants();
    }

    @PostMapping("save")
    public void ajouterEtudiant(@RequestBody Etudiant etudiant){

        etudiantService.ajouterEtudiant(etudiant);
    }

    @PutMapping("change/{id}")
    public Etudiant modifierEtudiant(@PathVariable("id") Long id,@RequestBody Etudiant etudiant){
        return etudiantService.modifierEtudiant(id,etudiant);
    }

    @DeleteMapping("delete/{id}")
    public void supprimerEtudiant(@PathVariable("id") Long id){
        etudiantService.supprimerEtudiant(id);
    }

}
