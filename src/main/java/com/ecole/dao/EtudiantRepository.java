package com.ecole.dao;

import com.ecole.model.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
    
}
