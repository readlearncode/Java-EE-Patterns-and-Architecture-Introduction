package com.readlearncode;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@WebFilter(filterName = "authentication", urlPatterns = "/admins/*", servletNames = "AdminRequestHandler")
public class AuthenticationFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest httpRequest = (HttpServletRequest) request;

        if (httpRequest.getSession().getAttribute("USER_TYPE").equals("ADMIN")) {
            chain.doFilter(httpRequest, response);
        } else {
            ((HttpServletResponse) response).sendRedirect("/admin-login.html");
        }

        // After calling the servlet process flows back to the filter and the response object
        // can be inspected.

    }
}