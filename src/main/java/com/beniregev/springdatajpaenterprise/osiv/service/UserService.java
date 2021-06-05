package com.beniregev.springdatajpaenterprise.osiv.service;

import com.beniregev.springdatajpaenterprise.osiv.model.BasicUser;

import java.util.Optional;

public interface UserService {
    Optional<BasicUser> findOne(String username);
}
