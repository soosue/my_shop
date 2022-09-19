package com.soosue.myshop.domain;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
    private String zipcode;

    public Address(String zipcode) {
        this.zipcode = zipcode;
    }
}
