package com.gar.wikistream.producer.filter;


import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.Collections;

import static org.springframework.core.Ordered.HIGHEST_PRECEDENCE;

@Component
public class RequestResponseLoggingFilter extends OncePerRequestFilter {
    private final static Logger LOG = LoggerFactory.getLogger(RequestResponseLoggingFilter.class);

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        Collections.list(request.getHeaderNames()).forEach( header ->
        {
            LOG.info("Headers {} : {}", header, request.getHeader(header));
        });
        LOG.info("Beginning transaction for request {}", request.getRequestURI());
        filterChain.doFilter(request, response);
        LOG.info("Completed Transaction for request {}", request.getRequestURI());
    }

    /*
    The commented methods are for the Filter Implementation and since we are extending the OncePerRequestFilter that
    handles the filter for multiple dispatcherservlets

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        LOG.info("init() method has been get invoked");
        LOG.info("Filter name is "+filterConfig.getFilterName());
        LOG.info("ServletContext name is"+filterConfig.getServletContext());
        LOG.info("init() method is ended");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        LOG.info("Beginning transaction for request");
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
    */

}
