package com.beniregev.springdatajpaenterprise.boot.services.impl;

import com.beniregev.springdatajpaenterprise.boot.daos.IBarCrudRepository;
import com.beniregev.springdatajpaenterprise.boot.domain.Bar;
import com.beniregev.springdatajpaenterprise.boot.services.IBarService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;

public class BarSpringDataJpaService extends AbstractSpringDataJpaService<Bar> implements IBarService {
    @Autowired
    private IBarCrudRepository dao;

    public BarSpringDataJpaService() {
        super();
    }

    @Override
    protected CrudRepository<Bar, Serializable> getDao() {
        return dao;
    }

    @Override
    public Page<Bar> findPaginated(int page, int size) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
