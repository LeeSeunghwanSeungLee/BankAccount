package com.naver.line.demo;

import com.naver.line.demo.filter.SampleFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SelfAppConfig {
    /**
     * 생성한 필터 조건을 확인할 수 있음
     */
    @Bean
    public FilterRegistrationBean<SampleFilter> firstFilter() {
        FilterRegistrationBean<SampleFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new SampleFilter()); registrationBean.addUrlPatterns("*");
        registrationBean.setOrder(1);
        registrationBean.setName("first-filter");
        return registrationBean;
    }
}
