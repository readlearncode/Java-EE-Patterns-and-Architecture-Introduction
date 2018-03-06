package com.readlearncode;

import javax.inject.Inject;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@WebFilter(filterName = "log", urlPatterns = "/admins/*", servletNames = "AdminRequestHandler")
public class LogFilter implements Filter {

    @Inject
    private Logger logger;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        logger.info(request.getContentType());

        chain.doFilter(request, response);

        logger.info(response.getContentType());
    }
}