/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyectointegrador.controller;


import com.example.proyectointegrador.model.User;
import com.example.proyectointegrador.service.IUserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class controller {

   @Autowired
   
   private IUserService UserService;
    
  
    @PostMapping("/user/create")
   
    
    public void create (@RequestBody User user) {
        System.out.println("hola");
        UserService.createUser(user);
    }
             
    @GetMapping("/users")
    @ResponseBody
    public List <User>getAll(){
    return UserService.getUsers() ;
    }
    
    @GetMapping("/user/{id}")
    @ResponseBody
    
    public User getById(@PathVariable Long id){
         System.out.println("get user controller");
    return UserService.findUser(id);
    }
  
    @PutMapping("/user/update/{id}")
     public void update(@RequestBody User user, @PathVariable Long id) {
        System.out.println("Update user controller: ");
         UserService.updateUser(user,id);
        
    }
    
      @DeleteMapping("/user/delete/{id}")
      public void delete (@PathVariable Long id){
     UserService.deleteUser(id);
    }
      
    
      @PostMapping("/user/login")
    
     public void login (@RequestBody String login) {
        System.out.println(login);
       
     }
    
}
