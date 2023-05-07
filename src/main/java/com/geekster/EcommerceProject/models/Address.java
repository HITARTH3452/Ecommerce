package com.geekster.EcommerceProject.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String name;
    private String lendmark;
    private String phoneNumber;
    private String zipcode;
    private String state;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_user_userid")
    private User user;
}
