package com.ian.small.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Entity
public class Product implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    @OneToOne
    private Brand brand;
    @NotNull
    private String name;
    @NotNull
    @ManyToOne
    private Catalog catalog;
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Attribute> attrs;
    @OneToMany(fetch = FetchType.LAZY)
    private List<Material> skus;

    public Product() {

    }

    public Product(Brand brand, String name, Catalog catalog) {
        this.brand = brand;
        this.name = name;
        this.catalog = catalog;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    public List<Attribute> getAttrs() {
        return attrs;
    }

    public void setAttrs(List<Attribute> attrs) {
        this.attrs = attrs;
    }

    public List<Material> getSkus() {
        return skus;
    }

    public void setSkus(List<Material> skus) {
        this.skus = skus;
    }
}
