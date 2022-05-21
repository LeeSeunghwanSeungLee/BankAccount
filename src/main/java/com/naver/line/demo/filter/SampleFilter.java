package com.naver.line.demo.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class SampleFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String userId = request.getHeader("X-USER-ID");
        if (userId == null) {
            throw new ServletException ("Unauthorized access, unable to forward to login page");
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
