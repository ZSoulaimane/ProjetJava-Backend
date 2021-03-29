package com.ecole.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

	@Id
    @Column(name = "user_name",unique=true,columnDefinition="VARCHAR(64)")
    private String userName;
    
    @Column(nullable = false)
    private String pass;
    
    @Column(nullable = false)
    private String email;
    
    @Column(nullable = false)
    private String role;
}
