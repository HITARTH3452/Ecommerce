package com.geekster.EcommerceProject.controllers;

import com.geekster.EcommerceProject.models.Order;
import com.geekster.EcommerceProject.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping(value = "/getOrderById/{id}")
    public List<Order> getOrderById(@PathVariable Long id){
        return orderService.getOrderById(id);
    }
}
