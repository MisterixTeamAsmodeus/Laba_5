package org.example.database;

import org.example.api.Database;

public class SQLLite implements Database {
    @Override
    public String getName() {
        return "SQLLite";
    }
}
