package com.ecole.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Enseignant {

    private Long id;
    private String nom;
    private String prenom;
    private Long matierId;
    private String photoUrl;
    private Long classeEnseignantId;
    private String user;
}
