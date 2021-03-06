package com.ecole.controller;

import com.ecole.model.Etudiant;
import com.ecole.model.Parent;
import com.ecole.service.EtudiantService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("etudiant")
@RestController
public class EtudiantController {

    private EtudiantService etudiantService;

    //@Autowired
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
    
    @PostMapping("save/parent/{id}")
    public void ajouterEtudiant2(@RequestBody Etudiant etudiant){

        etudiantService.ajouterEtudiant(etudiant);
    }

    @PutMapping("change")
    public Etudiant modifierEtudiant(@RequestBody Etudiant etudiant){
        return etudiantService.modifierEtudiant(etudiant);
    }

    @DeleteMapping("{id}")
    public void supprimerEtudiant(@PathVariable("id") Long id){
        etudiantService.supprimerEtudiant(id);
    }

    @GetMapping("parent/{id}")
    public Parent getParent(@PathVariable("id") Long id){
        return etudiantService.getParent(id);
    }
}
