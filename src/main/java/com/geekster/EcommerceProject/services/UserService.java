package com.geekster.EcommerceProject.services;

import com.geekster.EcommerceProject.Repositories.IUserRepo;
import com.geekster.EcommerceProject.models.Users;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    IUserRepo userRepo;

    public Users getUserById(Long id) {
        return userRepo.findByUserId(id);
    }

    public void savethis(Users myUser) {
        userRepo.save(myUser);
    }

    public void save(Users myUser) {

    }
}

