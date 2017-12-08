package com.ian.small.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "sorder")
public class Order implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    @OneToOne
    @NotNull
    private Payment payment;
    // replace with enum
    private String shipment;
    // should refactor
    private String invoiceType;
    @ManyToMany
    private List<Material> skus;
    private BigDecimal totalAmount;
    private BigDecimal shipAmount;
    private String status;

    public Order() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public String getShipment() {
        return shipment;
    }

    public void setShipment(String shipment) {
        this.shipment = shipment;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public List<Material> getSkus() {
        return skus;
    }

    public void setSkus(List<Material> skus) {
        this.skus = skus;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getShipAmount() {
        return shipAmount;
    }

    public void setShipAmount(BigDecimal shipAmount) {
        this.shipAmount = shipAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
