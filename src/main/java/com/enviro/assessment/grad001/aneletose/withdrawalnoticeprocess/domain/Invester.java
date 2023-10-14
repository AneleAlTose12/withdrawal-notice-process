package com.enviro.assessment.grad001.aneletose.withdrawalnoticeprocess.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Invester {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    private String fname;
    private String lname;
    private String username;
    private String pssword;
    private Object Address;
    private String contact;
    private Collection<Product> products = new ArrayList<>();



}
