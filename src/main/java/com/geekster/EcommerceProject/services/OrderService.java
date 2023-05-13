package com.geekster.EcommerceProject.services;

import com.geekster.EcommerceProject.Repositories.IAddressRepo;
import com.geekster.EcommerceProject.Repositories.IOrderRepo;
import com.geekster.EcommerceProject.Repositories.IProductRepo;
import com.geekster.EcommerceProject.Repositories.IUserRepo;
import com.geekster.EcommerceProject.models.Address;
import com.geekster.EcommerceProject.models.Order;
import com.geekster.EcommerceProject.models.Product;
import com.geekster.EcommerceProject.models.Users;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private IOrderRepo orderRepo;

    @Autowired
    private IAddressRepo addressRepo;

    @Autowired
    private IProductRepo productRepo;

    @Autowired
    private IUserRepo userRepo;

    public void createOrder(Order myOrder) {
        Long addressId = myOrder.getOrderAddress().getAddressId();
        Address myAddress  = addressRepo.findByAddressId(addressId);

        Long productId = myOrder.getOrderProduct().getProductId();
        Product myProduct = productRepo.findByProductId(productId);

        Long userId = myOrder.getOrderUser().getUserId();
        Users myUser = userRepo.findByUserId(userId);

        if(myOrder != null && myAddress != null && myUser != null) {
            myOrder.setOrderAddress(myAddress);
            myOrder.setOrderProduct(myProduct);
            myOrder.setOrderUser((Users) myUser);

            orderRepo.save(myOrder);
        }
        else{
            throw new IllegalStateException("Id's for order creation is not valid...");
        }
    }

    public Order fetchOrder(Long orderId) {
        return orderRepo.findByOrderId(orderId);
    }
}
