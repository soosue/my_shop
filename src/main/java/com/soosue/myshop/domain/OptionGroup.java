package com.soosue.myshop.domain;

import org.springframework.util.Assert;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class OptionGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    private Item item;

    @OneToMany
    private List<Option> options = new ArrayList<>();

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

    public void addOption(Option option) {
        option.setOptionGroup(this);
        options.add(option);
    }

    public boolean hasOption(Option option) {
        return options.contains(option);
    }
}
