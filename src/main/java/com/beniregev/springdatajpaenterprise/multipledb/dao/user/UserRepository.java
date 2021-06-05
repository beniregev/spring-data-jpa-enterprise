package com.beniregev.springdatajpaenterprise.multipledb.dao.user;

import com.beniregev.springdatajpaenterprise.boot.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
