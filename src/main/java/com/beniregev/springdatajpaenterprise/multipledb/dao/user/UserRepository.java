package com.beniregev.springdatajpaenterprise.multipledb.dao.user;

import com.beniregev.springdatajpaenterprise.multipledb.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
