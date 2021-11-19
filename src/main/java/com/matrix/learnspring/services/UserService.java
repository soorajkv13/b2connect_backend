package com.matrix.learnspring.services;

import com.matrix.learnspring.models.User;
import com.matrix.learnspring.interfaces.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<User> listAllUser() {

//        List<User> ss = new ArrayList<>();
//        User user = new User();
//        user.setId(1);
//        user.setFirstName("Sooraj");
//        user.setLastName("Kunhi Valappil");
//        ss.add(user);
//        return  ss;
        List<User> ss = new ArrayList<>();
        try{
            ss =  userRepository.findAll();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return  ss ;

    }

    public void saveUser(User user) {
        try{
            userRepository.save(user);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public User getUser(Integer id) {
        return userRepository.findById(id).get();
    }

    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }

    public void checkUser(User user){

    }
}
