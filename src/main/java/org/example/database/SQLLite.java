package org.example.database;

import org.example.api.Database;

///Класс для работы с SQLLite
public class SQLLite implements Database {
    @Override
    public String getName() {
        return "SQLLite";
    }
}
