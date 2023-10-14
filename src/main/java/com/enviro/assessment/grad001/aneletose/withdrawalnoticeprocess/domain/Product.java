package com.enviro.assessment.grad001.aneletose.withdrawalnoticeprocess.domain;

import lombok.AllArgsConstructor;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long prodId;
    private String prodType;
    private String prodName;
    private Long currentBalance;
}
