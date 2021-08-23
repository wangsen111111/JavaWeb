package com.wang.Listener;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SysFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;

        Object user_session = request.getSession().getAttribute("USER_SESSION");

        if(user_session == null){
            response.sendRedirect("/sys/error.jsp");
        }

        chain.doFilter(request,response);
    }
    public void destroy() {

    }
}


