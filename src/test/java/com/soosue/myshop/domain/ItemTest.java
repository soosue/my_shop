package com.soosue.myshop.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class ItemTest {

    @Test
    void 상품생성() {
        assertDoesNotThrow(() ->
                new Item("진짜맛있는상품", 1000L, 10L)
        );
    }
}
