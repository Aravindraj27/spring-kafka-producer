package com.gar.wikistream.producer.config;


import com.gar.wikistream.producer.filter.RequestResponseLoggingFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;

@Configuration
public class FilterRegistrationConfig {
    FilterRegistrationBean<RequestResponseLoggingFilter> regitrationBeam() {
        final FilterRegistrationBean<RequestResponseLoggingFilter> responseLoggingFilterFilterRegistrationBean = new FilterRegistrationBean<>();
        responseLoggingFilterFilterRegistrationBean.setFilter(new RequestResponseLoggingFilter());
        responseLoggingFilterFilterRegistrationBean.setOrder(1);
        responseLoggingFilterFilterRegistrationBean.setName("rrFilter");
        responseLoggingFilterFilterRegistrationBean.setUrlPatterns(Collections.singletonList("*/*"));

        return responseLoggingFilterFilterRegistrationBean;
    }
}
