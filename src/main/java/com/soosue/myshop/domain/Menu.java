package com.soosue.myshop.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    private Shop shop;

    @OneToMany
    private List<Item> items = new ArrayList<>();

    public Menu() {
    }

    public Menu(String name) {
        this.name = name;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public void addItem(Item item) {
        item.setMenu(this);
        items.add(item);
    }

    public boolean hasItem(Item item) {
        return items.contains(item);
    }
}
