package com.beniregev.springdatajpaenterprise.boot.daos;

import com.beniregev.springdatajpaenterprise.boot.domain.Bar;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;

public interface IBarCrudRepository extends CrudRepository<Bar, Serializable> {
    //
}
