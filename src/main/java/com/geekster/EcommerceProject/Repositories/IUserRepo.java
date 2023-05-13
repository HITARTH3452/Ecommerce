package com.geekster.EcommerceProject.Repositories;


import com.geekster.EcommerceProject.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<Users,Long> {

    Users findByUserId(Long userId);
}
