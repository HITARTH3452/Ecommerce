package com.geekster.EcommerceProject.services;

import com.geekster.EcommerceProject.Repositories.IAddressRepo;
import com.geekster.EcommerceProject.models.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    IAddressRepo addressRepo;

    public void savethis(Address myAddress) {
        addressRepo.save(myAddress);
    }

    public Address getAddressById(Long id) {
        return addressRepo.findByAddressId(id);
    }
}
