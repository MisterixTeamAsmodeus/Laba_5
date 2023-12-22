package org.example.database;

import org.example.api.Database;

///Класс для работы с MySQL
public class MySQL implements Database {
    @Override
    public String getName() {
        return "MySQL";
    }
}
