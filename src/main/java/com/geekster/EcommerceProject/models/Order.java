package com.geekster.EcommerceProject.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    @ManyToOne(cascade = CascadeType.ALL)
    private Users orderUser;

    @ManyToOne(cascade = CascadeType.ALL)
    private Product orderProduct;

    @ManyToOne(cascade = CascadeType.ALL)
    private Address orderAddress;

    private Integer productQuantity;
}
