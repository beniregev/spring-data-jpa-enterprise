package com.beniregev.springdatajpaenterprise;

import com.beniregev.springdatajpaenterprise.boot.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
class SpringDataJpaEnterpriseApplicationTests {

    @Test
    public void whenSpringContextIsBootstrapped_thenNoExceptions() {
    }
}
