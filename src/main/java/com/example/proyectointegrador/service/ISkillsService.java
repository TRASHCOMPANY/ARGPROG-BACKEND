/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.proyectointegrador.service;

import com.example.proyectointegrador.model.skills;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author BURRO
 */
public interface ISkillsService {
    
      public List<skills> getAllSkills();
         
      public Optional<skills> getSkill(Long id);
  
      public void setSkill(skills skill);
   
      public void deleteSkill(Long id);
    

}
