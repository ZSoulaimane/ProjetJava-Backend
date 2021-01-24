package com.ecole.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Administrateur {

    private Long id;
    private String nom;
    private String prenom;
    private String photoUrl;
    private String user;
}
