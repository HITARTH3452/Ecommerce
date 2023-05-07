package com.geekster.EcommerceProject.controllers;

import com.geekster.EcommerceProject.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;


}
