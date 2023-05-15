/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyectointegrador.model;


import com.sun.istack.NotNull;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter @Setter

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   
    Long id;
    @NotNull
    String first_name;
    @NotNull
    String last_name;
    @NotNull
    @Column (unique =true)
    String email;
    @NotNull
    String password;
    @NotNull
    @Column (unique =true)
    Number telephone;
    String terms;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<skills> orders;
    
public User() {
      
    }

    public User(Long id, String first_name, String last_name, String email, String password, Number telephone, String terms) {
       
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.password = password;
        this.telephone = telephone;
        this.terms = terms;
    }
    
           
}
