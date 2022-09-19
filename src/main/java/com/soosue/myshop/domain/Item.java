package com.soosue.myshop.domain;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Long price;

    @Embedded
    private Stock stock;

    @ManyToOne
    private Menu menu;

    public Item() {
    }

    public Item(String name, Long price, Long stockCount) {
        this.name = name;
        this.price = price;
        this.stock = new Stock(stockCount);
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
