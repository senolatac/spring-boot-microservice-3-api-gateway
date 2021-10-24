package com.sha.springbootmicroservice3apigateway.request;

import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author sa
 * @date 10.10.2021
 * @time 13:06
 */
@Configuration
public class FeignConfiguration
{
    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor(
            @Value("${service.security-secure-key-username}") String username,
            @Value("${service.security-secure-key-password}") String password)
    {
        return new BasicAuthRequestInterceptor(username, password);
    }
}
