package com.soosue.myshop.domain;

import org.junit.jupiter.api.Test;

import static com.soosue.myshop.domain.ItemFixture.진짜맛있는상품;
import static com.soosue.myshop.domain.OptionGroupFixture.맛선택;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class ItemTest {

    @Test
    void 상품생성() {
        assertDoesNotThrow(() ->
                new Item("진짜맛있는상품", 1000L, 10L)
        );
    }

    @Test
    void 옵션그룹추가() {
        진짜맛있는상품.addOptionGroup(맛선택);
        assertThat(진짜맛있는상품.hasOptionGroup(맛선택)).isTrue();
    }
}
