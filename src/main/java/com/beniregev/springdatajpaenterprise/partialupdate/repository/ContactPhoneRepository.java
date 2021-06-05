package com.beniregev.springdatajpaenterprise.partialupdate.repository;

import com.beniregev.springdatajpaenterprise.partialupdate.model.ContactPhone;
import org.springframework.data.repository.CrudRepository;

public interface ContactPhoneRepository extends CrudRepository<ContactPhone, Long> {
    ContactPhone findById(long id);
    ContactPhone findByCustomerId(long id);
}
