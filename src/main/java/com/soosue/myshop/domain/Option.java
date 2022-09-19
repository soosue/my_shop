package com.soosue.myshop.domain;

import org.springframework.util.Assert;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Option {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Long price;

    @ManyToOne
    private OptionGroup optionGroup;

    public Option() {
    }

    public Option(String name) {
        this(name, 0L);
    }

    public Option(String name, Long price) {
        validate(name);
        this.name = name;
        this.price = price;
    }

    private void validate(String name) {
        Assert.notNull(name, "option group name cannot be null.");
    }

    public void setOptionGroup(OptionGroup optionGroup) {
        this.optionGroup = optionGroup;
    }
}
