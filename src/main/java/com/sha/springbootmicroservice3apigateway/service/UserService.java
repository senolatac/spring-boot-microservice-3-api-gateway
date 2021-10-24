package com.sha.springbootmicroservice3apigateway.service;

import com.sha.springbootmicroservice3apigateway.model.Role;
import com.sha.springbootmicroservice3apigateway.model.User;

import java.util.Optional;

/**
 * @author sa
 * @date 10.10.2021
 * @time 11:31
 */
public interface UserService
{
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void changeRole(Role newRole, String username);
}
