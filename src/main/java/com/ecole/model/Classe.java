package com.ecole.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.io.Serializable;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Classe implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String emploiUrl;
    
    @JsonManagedReference(value = "classe")
    @OneToMany(mappedBy = "classe", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;
    
    @ManyToMany(targetEntity = Enseignant.class, cascade = { CascadeType.ALL })
	@JoinTable(name = "classe_enseignant", 
				joinColumns = { @JoinColumn(name = "classe_id") }, 
				inverseJoinColumns = { @JoinColumn(name = "enseignant_id") })
    private Set<Enseignant> enseignants;

}
