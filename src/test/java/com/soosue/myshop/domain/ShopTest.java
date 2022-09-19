package com.soosue.myshop.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.soosue.myshop.domain.MemberFixture.사장님;
import static com.soosue.myshop.domain.MemberFixture.일반인;
import static com.soosue.myshop.domain.MenuFixture.기본메뉴;
import static com.soosue.myshop.domain.ShopFixture.가게;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class ShopTest {

    @BeforeEach
    void init() {
        가게.emptyMenu();
        기본메뉴.setShop(null);
    }

    @DisplayName("가게 등록은 사장님만 가능하다")
    @Test
    void 가게_등록() {
        assertDoesNotThrow(() ->
                new Shop("대박성공", 사장님, new Address("111111"))
        );
    }

    @DisplayName("가게 등록은 사장님만 가능하다")
    @Test
    void 가게_등록_실패() {
        assertThatThrownBy(() ->
                new Shop("대박성공", 일반인, new Address("111111"))
        ).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 메뉴등록() {
        가게.addMenu(기본메뉴);
        assertThat(가게.containsMenu(기본메뉴)).isTrue();
    }
}
