package com.soosue.myshop.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class OptionGroupTest {

    @Test
    void 옵션그룹생성() {
        assertDoesNotThrow(() ->
                new OptionGroup("맛선택")
        );
    }
}
