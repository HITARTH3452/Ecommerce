package com.geekster.EcommerceProject.Repositories;

import com.geekster.EcommerceProject.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends JpaRepository<Address,Long> {

    Address findByAddressId(Long addressId);
}
