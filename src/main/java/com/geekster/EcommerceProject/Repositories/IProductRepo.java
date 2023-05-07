package com.geekster.EcommerceProject.Repositories;

import com.geekster.EcommerceProject.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepo extends CrudRepository<Product,Long> {

}
