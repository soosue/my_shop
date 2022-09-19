package com.soosue.myshop.domain;

import org.springframework.util.Assert;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class OptionGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    private Item item;

    public OptionGroup() {
    }

    public OptionGroup(String name) {
        validate(name);
        this.name = name;
    }

    private void validate(String name) {
        Assert.notNull(name, "option group name cannot be null.");
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
