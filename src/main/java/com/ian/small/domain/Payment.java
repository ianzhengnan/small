package com.ian.small.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
public class Payment implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String desct;

    public Payment() {

    }

    public Payment(String desc) {
        this.desct = desc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesct() {
        return desct;
    }

    public void setDesct(String desct) {
        this.desct = desct;
    }
}
