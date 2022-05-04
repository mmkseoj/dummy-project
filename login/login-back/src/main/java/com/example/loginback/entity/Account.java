package com.example.loginback.entity;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
public class Account {

    @Id
    private Long idx;

    private String id;

    private String password;

    private String email;

    private Long phoneNumber;
}
