package com.beniregev.springdatajpaenterprise.multipledb.dao.user;

import com.beniregev.springdatajpaenterprise.boot.domain.Possession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PossessionRepository extends JpaRepository<Possession, Long> {
}
