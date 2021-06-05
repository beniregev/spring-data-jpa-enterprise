package com.beniregev.springdatajpaenterprise.boot.config;

import com.beniregev.springdatajpaenterprise.boot.services.IBarService;
import com.beniregev.springdatajpaenterprise.boot.services.impl.BarSpringDataJpaService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@Profile("!tc")
@EnableTransactionManagement
@EnableJpaAuditing
public class PersistenceConfiguration {

    @Bean
    public IBarService barSpringDataJpaService() {
        return new BarSpringDataJpaService();
    }

}
