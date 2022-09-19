package com.soosue.myshop.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.soosue.myshop.domain.MemberFixture.사장님;
import static com.soosue.myshop.domain.MemberFixture.일반인;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class ShopTest {

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
}
