package com.geekster.EcommerceProject.services;

import com.geekster.EcommerceProject.Repositories.IUserRepo;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    IUserRepo userRepo;
    public Optional<User> getUserById(Long id) {
        Optional<User> byId = userRepo.findById(id);
        return byId;
    }
}
