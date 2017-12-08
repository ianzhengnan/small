package com.ian.small.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Entity
public class StaredProduct implements Serializable{

    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private User user;
    @NotNull
    private Product product;
    private boolean notify;
    private Date starAt;

    public StaredProduct() {

    }

    public StaredProduct(User user, Product product) {
        this.user = user;
        this.product = product;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public boolean isNotify() {
        return notify;
    }

    public void setNotify(boolean notify) {
        this.notify = notify;
    }

    public Date getStarAt() {
        return starAt;
    }

    public void setStarAt(Date starAt) {
        this.starAt = starAt;
    }
}
