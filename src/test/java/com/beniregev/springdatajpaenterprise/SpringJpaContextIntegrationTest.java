package com.beniregev.springdatajpaenterprise;

import com.beniregev.springdatajpaenterprise.boot.Application;
import com.beniregev.springdatajpaenterprise.boot.config.PersistenceConfiguration;
import com.beniregev.springdatajpaenterprise.multipledb.PersistenceProductConfiguration;
import com.beniregev.springdatajpaenterprise.multipledb.PersistenceUserConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 */
@RunWith(SpringRunner.class)
@DataJpaTest(excludeAutoConfiguration = {
        PersistenceConfiguration.class,
        PersistenceUserConfiguration.class,
        PersistenceProductConfiguration.class })
@ContextConfiguration(classes = Application.class)
public class SpringJpaContextIntegrationTest {
    @Test
    public void whenSpringContextIsBootstrapped_thenNoExceptions() {
    }
}
