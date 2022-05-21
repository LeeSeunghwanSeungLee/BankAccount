package com.naver.line.demo.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SampleEntityTest {

    @Test
    @DisplayName("단순한 엔티티 테스트 진행")
    public void test_1() {
        SampleEntity se = new SampleEntity();

        se.setId(1L);
        se.setName("sample1");

        assertThat(se.getId()).isEqualTo(1L);
        assertThat(se.getName()).isEqualTo("sample1");
    }
}