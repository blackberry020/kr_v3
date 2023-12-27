package org.example;

public class DBGateForCalculations {

    private DBConnection dbConnection;

    DBGateForCalculations(DBConnection connection) {
        dbConnection = connection;
    }

    public DBConnection getDbConnection() {
        return dbConnection;
    }
}
