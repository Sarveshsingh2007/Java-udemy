package com.sarvesh.spring_sec_demo.service;

import com.sarvesh.spring_sec_demo.dao.UserRepo;
import com.sarvesh.spring_sec_demo.model.User;
import com.sarvesh.spring_sec_demo.model.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {

        System.out.println("\n========== USER SERVICE DEBUG ==========");
        System.out.println("Searching database for: [" + username + "]");

        User user = repo.findByUsername(username);

        if (user == null) {
            System.out.println("User found: false");
            System.out.println("No user found for username: [" + username + "]");
            System.out.println("========== END USER SERVICE DEBUG ==========\n");

            throw new UsernameNotFoundException(
                    "USER 404 - Username not found: " + username
            );
        }

        System.out.println("User found: true");
        System.out.println("Database username: [" + user.getUsername() + "]");
        System.out.println("========== END USER SERVICE DEBUG ==========\n");

        return new UserPrincipal(user);
    }
}