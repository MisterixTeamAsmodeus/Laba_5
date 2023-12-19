package org.example.database;

import org.example.api.Database;

public class PostgresSQL implements Database {
    @Override
    public String getName() {
        return "PostgresSQL";
    }
}
