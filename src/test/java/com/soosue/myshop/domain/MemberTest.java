package com.soosue.myshop.domain;

import org.junit.jupiter.api.Test;

import static com.soosue.myshop.domain.MemberFixture.사장님;
import static com.soosue.myshop.domain.MemberFixture.일반인;
import static org.assertj.core.api.Assertions.assertThat;

class MemberTest {

    @Test
    void 사장님_여부() {
        assertThat(사장님.isShopOwner()).isTrue();
    }

    @Test
    void 일반인_여부() {
        assertThat(일반인.isShopOwner()).isFalse();
    }
}
