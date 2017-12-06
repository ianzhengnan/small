package com.ian.small.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
public class Account implements Serializable{

    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private Long userId;
    private Long accId;
    private String accType;

    public Account() {
    }

    public Account(Long userId, Long accId, String accType) {
        this.userId = userId;
        this.accId = accId;
        this.accType = accType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getAccId() {
        return accId;
    }

    public void setAccId(Long accId) {
        this.accId = accId;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }
}
