package com.geekster.EcommerceProject.Repositories;

import com.geekster.EcommerceProject.models.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepo extends JpaRepository<Order,Long> {


    Order findByOrderId(Long orderId);
}


