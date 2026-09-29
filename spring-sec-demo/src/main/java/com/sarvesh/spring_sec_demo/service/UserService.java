package com.sarvesh.spring_sec_demo.service;

import com.sarvesh.spring_sec_demo.dao.UserRepo;
import com.sarvesh.spring_sec_demo.model.User;
import org.aspectj.weaver.BCException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserService {
    @Autowired
    private UserRepo repo;
    @Autowired
    private BCryptPasswordEncoder encoder;
//    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);


    public User saveUser(User user){
        user.setPassword(encoder.encode(user.getPassword()));
        System.out.println(user.getPassword());
        return repo.save(user);
    }

}
