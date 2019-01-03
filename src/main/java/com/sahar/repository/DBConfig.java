package com.sahar.repository;

public class DBConfig {
    private static final String DB_HOST = "localhost";
    private static final String DB_PORT = "3306";
    private static final String DB_NAME = "warehouseOfFlowers";
    private static final String DB_OPTIONS = "verifyServerCertificate=false&useSSL=true";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "oleg1994";
    public static final String CLASSFORNAME = "com.mysql.jdbc.Driver";

    public static String getConnectionURL() {
        return String.format("Jdbc:mysql://%s:%s/%s?%s", DB_HOST, DB_PORT, DB_NAME, DB_OPTIONS);
    }
}
