package com.az.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @JsonManagedReference
    @OneToMany( mappedBy = "user",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<UserAddress> userAddressList;


    public UserAddress addUserAddress(UserAddress userAddress){
        this.getUserAddressList().add(userAddress);
        userAddress.setUser(this);
        return userAddress;
    }
}
