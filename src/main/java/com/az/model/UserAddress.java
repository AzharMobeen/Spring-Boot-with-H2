package com.az.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;


import javax.persistence.*;

@Data
@Entity
public class UserAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String country;
    private String city;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

}
