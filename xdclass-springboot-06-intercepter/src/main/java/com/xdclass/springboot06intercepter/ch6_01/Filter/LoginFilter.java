package com.xdclass.springboot06intercepter.ch6_01.Filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 **/
@WebFilter(urlPatterns = "/api/*",filterName = "loginFilter")
public  class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init loginFilter");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("doFilter loginFilter");

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String username = request.getParameter("username");

        if ("xdclass".equals(username)){
            filterChain.doFilter(servletRequest,servletResponse);
        }else {
            response.sendRedirect("/index.html");
            return;
        }
    }

    @Override
    public void destroy() {
        System.out.println("destory loginFilter");
    }
}
