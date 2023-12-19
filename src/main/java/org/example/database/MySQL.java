package org.example.database;

import org.example.api.Database;

public class MySQL implements Database {
    @Override
    public String getName() {
        return "MySQL";
    }
}
