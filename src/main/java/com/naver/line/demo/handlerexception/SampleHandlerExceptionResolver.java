package com.naver.line.demo.handlerexception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SampleHandlerExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        try {
            if (ex instanceof IllegalArgumentException) {
                response.sendError(HttpServletResponse.SC_BAD_REQUEST,
                        ex.getMessage());
                return new ModelAndView();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}

/**
 * 1. ExceptionHandlerExceptionResolver -> ExceptionHandler를 Contorller에 구현해서, 자동으로 해당 컨트롤러 매핑
 * 2. StatusHandlerExceptionResolver -> 컨트롤러나 서비스에 HttpStatus annotaion
 * 3. DefaultHandlerExceptionResolver -> 자동 타입 변환 // 가장 자주 사용할 수 있을 것 같음
 */