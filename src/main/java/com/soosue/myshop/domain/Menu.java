package com.soosue.myshop.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    private Shop shop;

    public Menu() {
    }

    public Menu(String name) {
        this.name = name;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }
}
