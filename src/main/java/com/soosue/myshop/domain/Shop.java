package com.soosue.myshop.domain;

import org.springframework.util.Assert;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    private Member owner;

    @Embedded
    private Address address;

    public Shop() {
    }

    public Shop(String name, Member owner, Address address) {
        validate(name, owner);
        this.name = name;
        this.owner = owner;
        this.address = address;
    }

    private void validate(String name, Member owner) {
        Assert.notNull(name, "shop name cannot be null.");
        Assert.isTrue(owner.isShopOwner(), "shop can be register only by owner member.");
    }
}
