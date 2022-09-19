package com.soosue.myshop.domain;

import org.springframework.util.Assert;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

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

    @OneToMany(cascade = CascadeType.ALL)
    private List<Menu> menus = new ArrayList<>();

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

    public void addMenu(Menu menu) {
        menu.setShop(this);
        menus.add(menu);
    }

    public boolean containsMenu(Menu menu) {
        return menus.contains(menu);
    }

    public void emptyMenu() {
        menus.clear();
    }
}
