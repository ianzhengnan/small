package com.ian.small.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Entity
public class Order implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private Payment payment;
    private String shipment;
    // should refactor
    private String invoiceType;
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Material> skus;
    private BigDecimal totalAmount;
    private BigDecimal shipAmount;
    private String status;


}
