package com.geekster.EcommerceProject.services;

import com.geekster.EcommerceProject.Repositories.IOrderRepo;
import com.geekster.EcommerceProject.models.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private IOrderRepo orderRepo;
    public List<Order> getOrderById(Long id) {
        Order order = orderRepo.findById(id).get();
        return (List<Order>) order;
    }
}
