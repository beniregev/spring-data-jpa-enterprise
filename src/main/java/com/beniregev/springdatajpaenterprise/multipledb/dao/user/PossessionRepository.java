package com.beniregev.springdatajpaenterprise.multipledb.dao.user;

import com.beniregev.springdatajpaenterprise.multipledb.model.user.Possession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PossessionRepository extends JpaRepository<Possession, Long> {
}
