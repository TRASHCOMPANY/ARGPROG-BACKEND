
package com.example.proyectointegrador.service;

import com.example.proyectointegrador.model.User;
import java.util.List;

public interface IUserService {
  
     public List<User> getUsers();
     public User createUser(User user);
     public void updateUser(User user,Long userId);
     public void deleteUser(Long id);
     public User findUser(Long id); 
}

