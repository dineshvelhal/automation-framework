package com.dineshv.af.config;

public class EnvironmentConfig {
    // Define test environment specific constants here

    // JDBC connection string for application DB
    public static final String DB_CONNECT_STRING = "";

    // If Jenkins publishes any specific Env attributes they can be set to local constants here
    public static final String GIT_URL = System.getProperty("<git url system property>");
    public static final String GIT_BRANCH = System.getProperty("<git branch system property>");
}
