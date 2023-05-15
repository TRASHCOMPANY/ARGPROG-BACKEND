/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyectointegrador.service;

import com.example.proyectointegrador.model.skills;
import com.example.proyectointegrador.repository.SkillsRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author BURRO
 */
@Service

public class SkillsService implements ISkillsService{
    
    @Autowired
   
            SkillsRepository rskills;
    
       @Override   
    public List<skills> getAllSkills(){
        return rskills.findAll();
    }
      @Override
      public Optional<skills> getSkill(Long id){
        return rskills.findById(id);
    }
        @Override
        public void setSkill(skills skill){
         rskills.save(skill);
    }
          @Override
          public void deleteSkill(Long id){
         rskills.deleteById(id);
    }
}
