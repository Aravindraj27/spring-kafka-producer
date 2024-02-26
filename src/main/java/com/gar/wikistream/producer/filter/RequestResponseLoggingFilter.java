package com.gar.wikistream.producer.filter;


import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

@Component
public class RequestResponseLoggingFilter implements  Filter{
    private final static Logger LOG = LoggerFactory.getLogger(RequestResponseLoggingFilter.class);


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        LOG.info("init() method has been get invoked");
        LOG.info("Filter name is "+filterConfig.getFilterName());
        LOG.info("ServletContext name is"+filterConfig.getServletContext());
        LOG.info("init() method is ended");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        LOG.info("Begining transaction for request");
        HttpServletRequest httpServletRequest = (HttpServletRequest)servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse)servletResponse;
        LOG.info("Beginning transaction for request {}", httpServletRequest.getRequestURI());
        filterChain.doFilter(httpServletRequest, httpServletResponse);
        LOG.info("Completing transaction for request {}", httpServletRequest.getRequestURI());
    }

    @Override
    public void destroy() {
        LOG.info("Destructing filter :{}", this);
    }
}
