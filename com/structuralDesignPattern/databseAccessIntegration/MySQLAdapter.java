package com.structuralDesignPattern.databseAccessIntegration;

public class MySQLAdapter implements DatabaseAdapter {
    private MySQLDatabase mySQLDatabase;

    public MySQLAdapter() {
        this.mySQLDatabase = new MySQLDatabase();
    }

    @Override
    public void executeQuery(String query) {
        mySQLDatabase.runQuery(query);
    }
}

