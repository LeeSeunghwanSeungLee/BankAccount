package com.naver.line.demo.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SampleDtoTest {
    @Test
    @DisplayName("롬복 테스트")
    public void test_1() {
        SampleDto sampleDto = new SampleDto();
        sampleDto.setId(1);
        sampleDto.setName("name");

        assertThat(sampleDto.getName().equals("name"));
    }
}