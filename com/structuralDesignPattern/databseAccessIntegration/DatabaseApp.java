package com.structuralDesignPattern.databseAccessIntegration;

public class DatabaseApp {
    public static void main(String[] args) {
        DatabaseAdapter mySQLAdapter = new MySQLAdapter();
        DatabaseAdapter mongoDBAdapter = new MongoDBAdapter();

        mySQLAdapter.executeQuery("SELECT * FROM users;");
        mongoDBAdapter.executeQuery("db.users.find();");
    }
}

