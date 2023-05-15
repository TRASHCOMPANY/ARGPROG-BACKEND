/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyectointegrador.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter @Setter

public class skills {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   
    Long id;
    String skill_name;
    Number percent;
    String description;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public skills() {
    }

    
    public skills(Long id, String skill_name, Number percent, String description) {
        
       
        this.id = id;
        this.skill_name = skill_name;
        this.percent = percent;
        this.description = description;
    
    }
   
      
}
