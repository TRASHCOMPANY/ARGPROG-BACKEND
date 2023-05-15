/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyectointegrador.controller;

import com.example.proyectointegrador.model.skills;
import com.example.proyectointegrador.service.ISkillsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author BURRO
 */
@CrossOrigin(origins="http://localhost:4200")  
@Controller
@RestController


public class skillsController {
    
    @Autowired
   
  public ISkillsService skillsService ;
    
  
    @PostMapping("/user/skills/create")
   
       public void createSkill(@RequestBody skills skill) {
        System.out.println("hola");
        skillsService.setSkill(skill);
    }
       
     @GetMapping("/user/skills")
        public List <skills> getSkills() {
        return skillsService.getAllSkills();
    }
     
        @DeleteMapping("/user/skills/delete/{id}")
   
       public void deleteSkill(@PathVariable Long id){
         skillsService.deleteSkill(id);
    }
}
