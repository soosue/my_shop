package com.soosue.myshop.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class OptionTest {

    @Test
    void 옵션생성() {
        assertDoesNotThrow(() ->
                new Option("달콤한맛")
        );
    }
}
