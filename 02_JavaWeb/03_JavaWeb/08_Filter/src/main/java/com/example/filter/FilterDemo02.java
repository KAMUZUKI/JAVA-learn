package com.example.filter;

import javax.servlet.*;
import java.io.IOException;

public class FilterDemo02 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("对象初始化成功...");

        //获取过滤器名称
        String filterName = filterConfig.getFilterName();
        System.out.println(filterName);

        //根据name获取value
        String username = filterConfig.getInitParameter("username");
        System.out.println(username);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("filterDemo02执行了...");

        response.setContentType("text/html;charset=UTF-8");

        chain.doFilter(request, response);
    }
}
