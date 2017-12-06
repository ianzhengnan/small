package com.ian.small.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Account {

    @Id
    @GeneratedValue
    private Long id;
    private Long user_id;
    private Long acc_id;
    private String acc_type;
}
