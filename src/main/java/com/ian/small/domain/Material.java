package com.ian.small.domain;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Entity
public class Material implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    @ManyToOne
    private Product spu;
    @OneToMany
    private List<Attribute> saleAttrs;
    @NotNull
    private Integer quantity;
    @NotNull
    private BigDecimal price;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Type(type = "text")
    private String detail;

    public Material() {

    }

    public Material(Product spu, Integer quantity, BigDecimal price) {
        this.spu = spu;
        this.quantity = quantity;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getSpu() {
        return spu;
    }

    public void setSpu(Product spu) {
        this.spu = spu;
    }

    public List<Attribute> getSaleAttrs() {
        return saleAttrs;
    }

    public void setSaleAttrs(List<Attribute> saleAttrs) {
        this.saleAttrs = saleAttrs;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
