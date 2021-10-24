package com.sha.springbootmicroservice3apigateway.service;

import com.sha.springbootmicroservice3apigateway.model.User;

/**
 * @author sa
 * @date 10.10.2021
 * @time 12:31
 */
public interface AuthenticationService
{
    User signInAndReturnJWT(User signInRequest);
}
