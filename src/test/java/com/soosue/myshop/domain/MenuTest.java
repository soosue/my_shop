package com.soosue.myshop.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class MenuTest {

    @Test
    void 메뉴생성() {
        assertDoesNotThrow(() ->
                new Menu("대박날메뉴")
        );
    }
}
