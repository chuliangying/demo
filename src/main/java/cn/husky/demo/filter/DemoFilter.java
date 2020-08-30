package cn.husky.demo.filter;


import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Component
public class DemoFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    public void destroy() {

    }
}
