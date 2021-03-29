package com.ecole.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import org.hibernate.annotations.ForeignKey;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.io.Serializable;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Enseignant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String nom;
    
    @Column(nullable = false)
    private String prenom;
    
    @Column(nullable = false)
    private String matier;
    
    @Column
    private int nbrAbs;
    
    @Column(nullable = false)
    private String photoUrl;
    
    
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_name")
    private User user;
}
