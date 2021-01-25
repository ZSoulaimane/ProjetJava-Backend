package com.ecole.model;

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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 25, nullable = false)
    private String nom;

    @Column(length = 25, nullable = false)
    private String prenom;

    @Column(nullable = false)
    private int age;

    @Column(length = 25, nullable = false)
    private Date dateNaissance;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "parent_id", nullable = false)
    private Parent parent;
    private Long classeId;
    @Column(length = 100)
    private String photoUrl;
    @Column(length = 25)
    private String user;
}
