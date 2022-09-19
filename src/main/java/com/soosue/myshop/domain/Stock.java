package com.soosue.myshop.domain;

import org.springframework.util.Assert;

import javax.persistence.Embeddable;

@Embeddable
public class Stock {

    private Long count = 0L;

    private Boolean isSoldOut = Boolean.TRUE;

    public Stock() {
    }

    public Stock(Long count) {
        validate(count);
        this.count = count;
        this.isSoldOut = Boolean.FALSE;
    }

    private void validate(Long count) {
        Assert.notNull(count, "stock count cannot be null");
        Assert.state(count >= 0, "stock count is equal or bigger than zero");
    }
}
