package com.beniregev.springdatajpaenterprise.partialupdate.util;

import com.beniregev.springdatajpaenterprise.partialupdate.model.Customer;
import com.beniregev.springdatajpaenterprise.partialupdate.model.CustomerDto;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateCustomerFromDto(CustomerDto dto, @MappingTarget Customer entity);
}
