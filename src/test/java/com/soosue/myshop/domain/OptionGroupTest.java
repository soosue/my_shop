package com.soosue.myshop.domain;

import org.junit.jupiter.api.Test;

import static com.soosue.myshop.domain.OptionFixture.달콤한맛;
import static com.soosue.myshop.domain.OptionGroupFixture.맛선택;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class OptionGroupTest {

    @Test
    void 옵션그룹생성() {
        assertDoesNotThrow(() ->
                new OptionGroup("맛선택")
        );
    }

    @Test
    void 옵션항목추가() {
        맛선택.addOption(달콤한맛);
        assertThat(맛선택.hasOption(달콤한맛)).isTrue();
    }
}
