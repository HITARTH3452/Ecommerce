package com.geekster.EcommerceProject.controllers;

import com.geekster.EcommerceProject.Repositories.IAddressRepo;
import com.geekster.EcommerceProject.models.Address;
import com.geekster.EcommerceProject.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping("addAddress")
    void addAddress(@RequestBody Address myAddress)
    {
        addressService.savethis(myAddress);
    }

    @GetMapping("/{addressId}")
    Address getAddressById(@PathVariable Long id){
        return addressService.getAddressById(id);
    }

}
