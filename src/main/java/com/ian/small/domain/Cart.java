package com.ian.small.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Entity
public class Cart implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private Integer itemId;
    @NotNull
    @OneToOne
    private User user;
    @NotNull
    @ManyToMany
    private List<Material> skus;

    public Cart() {

    }

    public Cart(Integer itemId, User user, List<Material> skus) {
        this.itemId = itemId;
        this.user = user;
        this.skus = skus;
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

    public List<Material> getSkus() {
        return skus;
    }

    public void setSkus(List<Material> skus) {
        this.skus = skus;
    }

}
