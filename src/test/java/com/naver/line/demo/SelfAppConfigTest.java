package com.naver.line.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

class SelfAppConfigTest {
    @Test
    @DisplayName("빈 생성 확인을 위한 테스트 입니다")
    public void BeanEnrollCheck() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class, SelfAppConfig.class);
        String sampleBeanName = "helloBean";
        String[] beans = ac.getBeanDefinitionNames();
        assertThat(checkContains(sampleBeanName, beans)).isTrue();
    }

    private boolean checkContains(String beanNames, String[] beans) {

        return Arrays.stream(beans)
                .anyMatch(beanNames::equals);
    }

    @Configuration
    public static class AppConfig {
        @Bean
        public Object helloBean() {
            return new Object();
        }
    }
}