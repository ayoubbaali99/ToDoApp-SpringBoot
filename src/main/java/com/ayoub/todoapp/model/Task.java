package com.ayoub.todoapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.aot.generate.GeneratedTypeReference;

import javax.annotation.processing.Generated;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id ;

    private String title ;

    private String description ;

    private boolean completed ;
}
