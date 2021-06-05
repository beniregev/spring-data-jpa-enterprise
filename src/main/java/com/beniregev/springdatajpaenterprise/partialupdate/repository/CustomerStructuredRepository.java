package com.beniregev.springdatajpaenterprise.partialupdate.repository;

import com.beniregev.springdatajpaenterprise.partialupdate.model.CustomerStructured;
import org.springframework.data.repository.CrudRepository;

public interface CustomerStructuredRepository extends CrudRepository<CustomerStructured, Long> {
    CustomerStructured findById(long id);
}
