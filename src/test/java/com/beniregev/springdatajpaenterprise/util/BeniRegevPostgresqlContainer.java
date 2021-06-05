package com.beniregev.springdatajpaenterprise.util;

import org.testcontainers.containers.PostgreSQLContainer;

public class BeniRegevPostgresqlContainer extends PostgreSQLContainer<BeniRegevPostgresqlContainer> {
    private static final String IMAGE_VERSION = "postgres:11.1";

    private static BeniRegevPostgresqlContainer container;


    private BeniRegevPostgresqlContainer() {
        super(IMAGE_VERSION);
    }

    public static BeniRegevPostgresqlContainer getInstance() {
        if (container == null) {
            container = new BeniRegevPostgresqlContainer();
        }
        return container;
    }

    @Override
    public void start() {
        super.start();
        System.setProperty("DB_URL", container.getJdbcUrl());
        System.setProperty("DB_USERNAME", container.getUsername());
        System.setProperty("DB_PASSWORD", container.getPassword());
    }

    @Override
    public void stop() {
        //do nothing, JVM handles shut down
    }

}
