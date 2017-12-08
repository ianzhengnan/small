package com.ian.small.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
public class Cart implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private Integer itemId;
    @NotNull
    private User user;
    @NotNull
    private Material sku;
    @NotNull
    private Integer quantity;

    public Cart() {

    }

    public Cart(Integer itemId, User user, Material sku, Integer quantity) {
        this.itemId = itemId;
        this.user = user;
        this.sku = sku;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Material getSku() {
        return sku;
    }

    public void setSku(Material sku) {
        this.sku = sku;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
