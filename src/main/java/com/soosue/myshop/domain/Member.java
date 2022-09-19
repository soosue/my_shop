package com.soosue.myshop.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Boolean isShopOwner;

    public Member() {
    }

    public Member(String name) {
        this(name, Boolean.FALSE);
    }

    public Member(String name, Boolean isShopOwner) {
        this(null, name, isShopOwner);
    }

    public Member(Long id, String name, Boolean isShopOwner) {
        this.id = id;
        this.name = name;
        this.isShopOwner = isShopOwner;
    }

    public boolean isShopOwner() {
        return isShopOwner;
    }
}
