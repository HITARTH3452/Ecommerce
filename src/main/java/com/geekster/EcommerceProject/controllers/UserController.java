package com.geekster.EcommerceProject.controllers;

import com.geekster.EcommerceProject.Repositories.IUserRepo;
import com.geekster.EcommerceProject.models.Address;
import com.geekster.EcommerceProject.models.Users;
import com.geekster.EcommerceProject.services.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("addUser")
    void addUser(@RequestBody Users myUser)
    {

        List<Address> Addresses = myUser.getUserAddress();
        for (Address add : Addresses)
        {
            add.setUser(myUser);
        }
        userService.save(myUser);
    }
}
