package com.beniregev.springdatajpaenterprise.osiv.service;

import java.util.Optional;

import com.beniregev.springdatajpaenterprise.osiv.model.BasicUser;
import com.beniregev.springdatajpaenterprise.osiv.repository.BasicUserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SimpleUserService implements UserService {
    private final BasicUserRepository userRepository;

    public SimpleUserService(BasicUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<BasicUser> findOne(String username) {
        return userRepository.findDetailedByUsername(username);
    }
}
