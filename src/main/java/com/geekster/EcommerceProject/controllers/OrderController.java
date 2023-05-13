package com.geekster.EcommerceProject.controllers;

import com.geekster.EcommerceProject.Repositories.IOrderRepo;
import com.geekster.EcommerceProject.models.Order;
import com.geekster.EcommerceProject.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.List;

@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("addOrder")
    ResponseEntity<String> placeOrder(@RequestBody Order myOrder) {
        String response;
        HttpStatus status;
        try {
            orderService.createOrder(myOrder);
            response = "Your order of "+ myOrder.getProductQuantity() + " was placed....successfully!!!";
            status = HttpStatus.CREATED;
        }
        catch (Exception e){
            response = "Details with your order are invalid !!!...Please check and reorder";
            status = HttpStatus.BAD_REQUEST;
            System.out.println(e);
        }
        return new ResponseEntity<String>(response,status);
    }

    @GetMapping("/{orderId}")
    public Order getOrderById(@PathVariable Long orderId){
        return orderService.fetchOrder(orderId);
    }
}

