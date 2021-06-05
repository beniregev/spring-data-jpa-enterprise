package com.beniregev.springdatajpaenterprise.boot.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.beniregev.springdatajpaenterprise.boot.domain.Foo;

public interface IFooService extends IOperations<Foo> {
    Foo retrieveByName(String name);

    Page<Foo> findPaginated(Pageable pageable);
}
