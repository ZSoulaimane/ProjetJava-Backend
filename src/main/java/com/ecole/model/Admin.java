package com.ecole.model;

import java.io.Serializable;

import javax.persistence.*;

import javassist.tools.framedump;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Admin implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(nullable = false)
    private String nom;
	
	@Column(nullable = false)
    private String prenom;
	
	@Column(nullable = false)
    private String photoUrl;
    
	@OneToOne(fetch = FetchType.EAGER,cascade=CascadeType.ALL)
    @JoinColumn(name = "user_name")
    private User user;
}
