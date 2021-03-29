package com.ecole.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Etudiant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 25, nullable = false)
    private String nom;

    @Column(length = 25, nullable = false)
    private String prenom;

    @Column
    private int nbrAbs;
    
    @Column
    private Double noteS1;
    
    @Column
    private Double noteS2;
    
    @Column
    private Double noteTotal;
    
    @Column(length = 25, nullable = false)
    private Date dateNaissance;
    
    @Column(length = 100)
    private String photoUrl;
    
    @JsonBackReference(value = "parent")
    @ManyToOne(fetch = FetchType.EAGER, optional = false,cascade = CascadeType.ALL)
    @JoinColumn(name = "parent_id")
    private Parent parent;
    
    @JsonBackReference(value = "classe")
    @ManyToOne(fetch = FetchType.LAZY, optional = false,cascade = CascadeType.ALL)
    @JoinColumn(name = "classe_id")
    private Classe classe;
    
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_name")
    private User user;
    
}
