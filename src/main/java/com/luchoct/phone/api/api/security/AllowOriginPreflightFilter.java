package com.luchoct.phone.api.api.security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class AllowOriginPreflightFilter implements Filter {

    @Value("${security.cors.origins}")
    private String allowedOrigins;

    @Value("${security.cors.allowCredentials}")
    private String allowCredentials;

    @Value("${security.cors.allowedHeaders}")
    private String allowedHeaders;

    @Value("${security.cors.exposedHeaders}")
    private String exposedHeaders;

    @Value("${security.cors.maxAge}")
    private String maxAge;

    @Value("${security.cors.methods}")
    private String allowedMethods;

    public AllowOriginPreflightFilter() {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) res;
        HttpServletRequest request = (HttpServletRequest) req;
        response.setHeader(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, allowedOrigins);
        response.setHeader(HttpHeaders.ACCESS_CONTROL_ALLOW_CREDENTIALS, allowCredentials);
        response.setHeader(HttpHeaders.ACCESS_CONTROL_EXPOSE_HEADERS, exposedHeaders);
        if (HttpMethod.OPTIONS.name().equalsIgnoreCase(request.getMethod())) {
            response.setHeader(HttpHeaders.ACCESS_CONTROL_MAX_AGE, maxAge);
            response.setHeader(HttpHeaders.ACCESS_CONTROL_ALLOW_HEADERS, allowedHeaders);
            response.setHeader(HttpHeaders.ACCESS_CONTROL_ALLOW_METHODS, allowedMethods);
            response.setStatus(HttpServletResponse.SC_OK);
        } else {
            chain.doFilter(req, res);
        }
    }

    @Override
    public void init(FilterConfig filterConfig) {
    }

    @Override
    public void destroy() {
    }
}
