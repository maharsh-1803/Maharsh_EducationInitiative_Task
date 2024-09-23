package com.structuralDesignPattern.databseAccessIntegration;

public class MongoDBAdapter implements DatabaseAdapter {
    private MongoDBDatabase mongoDBDatabase;

    public MongoDBAdapter() {
        this.mongoDBDatabase = new MongoDBDatabase();
    }

    @Override
    public void executeQuery(String query) {
        mongoDBDatabase.runQuery(query);
    }
}

