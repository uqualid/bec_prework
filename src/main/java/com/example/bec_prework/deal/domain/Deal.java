package com.example.bec_prework.deal.domain;

import com.example.bec_prework.product.domain.ProStat;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Getter
@ToString
public class Deal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private String dealId;

    @Enumerated(EnumType.STRING)
    private ProStat dst;

}
