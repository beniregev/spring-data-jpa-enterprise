package com.beniregev.springdatajpaenterprise.boot.daos;

//import com.baeldung.util.BaeldungPostgresqlContainer;
import com.beniregev.springdatajpaenterprise.boot.Application;
import com.beniregev.springdatajpaenterprise.boot.domain.User;
import com.beniregev.springdatajpaenterprise.util.BeniRegevPostgresqlContainer;
import org.junit.ClassRule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import org.testcontainers.containers.PostgreSQLContainer;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author binyamin.regev
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@ActiveProfiles({"tc", "tc-auto"})
public class UserRepositoryTCAutoLiveTest extends UserRepositoryCommon {
    @ClassRule
    public static PostgreSQLContainer<BeniRegevPostgresqlContainer> postgreSQLContainer = BeniRegevPostgresqlContainer.getInstance();

    @Test
    @Transactional
    public void givenUsersInDB_WhenUpdateStatusForNameModifyingQueryAnnotationNativePostgres_ThenModifyMatchingUsers() {
        userRepository.save(new User("SAMPLE", LocalDate.now(), USER_EMAIL, ACTIVE_STATUS));
        userRepository.save(new User("SAMPLE1", LocalDate.now(), USER_EMAIL2, ACTIVE_STATUS));
        userRepository.save(new User("SAMPLE", LocalDate.now(), USER_EMAIL3, ACTIVE_STATUS));
        userRepository.save(new User("SAMPLE3", LocalDate.now(), USER_EMAIL4, ACTIVE_STATUS));
        userRepository.flush();

        int updatedUsersSize = userRepository.updateUserSetStatusForNameNativePostgres(INACTIVE_STATUS, "SAMPLE");

        assertThat(updatedUsersSize).isEqualTo(2);
    }
}
