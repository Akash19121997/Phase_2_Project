package com.dao;
import java.util.List;
import com.dto.User;
public interface UserDAO {
    public Integer addUser(User user);
    
    public List<User> listUsers();
    
   
}
