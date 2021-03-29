package com.ecole.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Parent implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String nomMere;
    
    @Column(nullable = false)
    private String nomPere;
    
    @Column(nullable = false)
    private int numTel;
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_name")
    private User user;
}
