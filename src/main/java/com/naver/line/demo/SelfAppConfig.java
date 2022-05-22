package com.naver.line.demo;

import com.naver.line.demo.filter.SampleFilter;
import com.naver.line.demo.interceptor.SampleInterceptor;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SelfAppConfig implements WebMvcConfigurer {
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

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new SampleInterceptor())
                .order(1)
                .addPathPatterns("/api/sample/**");
//                .excludePathPatterns("/css/**", "/*.ico", "/error");
    }
}
