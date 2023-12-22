package org.example.database;

import org.example.api.Database;

///Класс для работы с PostgresSQL
public class PostgresSQL implements Database {
    @Override
    public String getName() {
        return "PostgresSQL";
    }
}
