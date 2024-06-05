package com.example.bec_prework.product.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Getter
@ToString
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private String productId;

    @Enumerated(EnumType.STRING)
    private ProStat pst;


    @Column(length = 20, nullable = false)
    private String productName;


    private int productPrice;

}
