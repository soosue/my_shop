package com.soosue.myshop.domain;

import org.junit.jupiter.api.Test;

import static com.soosue.myshop.domain.ItemFixture.진짜맛있는상품;
import static com.soosue.myshop.domain.MenuFixture.기본메뉴;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class MenuTest {

    @Test
    void 메뉴생성() {
        assertDoesNotThrow(() ->
                new Menu("대박날메뉴")
        );
    }

    @Test
    void 상품등록() {
        기본메뉴.addItem(진짜맛있는상품);
        assertThat(기본메뉴.hasItem(진짜맛있는상품)).isTrue();
    }
}
