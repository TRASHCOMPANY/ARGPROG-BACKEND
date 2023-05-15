package com.example.proyectointegrador.service;

import com.example.proyectointegrador.repository.UserRepository;
import com.example.proyectointegrador.model.User;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service

public class UserService implements IUserService {
 
 @Autowired
 
  public UserRepository userRepoMethods;
     
    @Override
    
    public List<User> getUsers() {
       return (List<User>) userRepoMethods.findAll();
    }

    @Override
    public User createUser(User user) {
       return  userRepoMethods.save(user);
    }

    @Override
   
    public void deleteUser(Long id){
       userRepoMethods.deleteById(id);
    }
     @Override
  
     @Async
    public void updateUser(User user, Long userId){
         
        System.out.println("por aca paso");
//      
       Optional<User> userFindIt =  this.userRepoMethods.findById(userId);
        User usuario = userFindIt.get();
        System.out.println("por aca paso" + userFindIt.get());
        usuario.setFirst_name(user.getFirst_name());
        usuario.setLast_name(user.getLast_name());
        usuario.setEmail(user.getEmail());
         
          if(!usuario.getPassword().isEmpty()){
            usuario.setPassword(BCrypt.hashpw(user.getPassword(),BCrypt.gensalt()));
      
        }
          
        usuario.setTelephone(user.getTelephone());
        usuario.setTerms(user.getTerms());
//      
      System.out.println("por aca paso" + usuario);
    CompletableFuture.completedFuture(this.userRepoMethods.save(usuario));
    }

    @Override
    
      @Transactional(readOnly = true)
    public User findUser(Long id) {
      return (User) userRepoMethods.findById(id).orElse(null);
    }
    
   
       
    
            
}