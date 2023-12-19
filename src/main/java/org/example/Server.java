package org.example;

import org.example.annotation.AutoInjectable;
import org.example.api.Database;
import org.example.api.HttpProtocol;

public class Server {
    @AutoInjectable
    private HttpProtocol protocol;
    @AutoInjectable
    private Database database;

    public String getDatabaseName() {
        return database.getName();
    }

    public String getProtocolType() {
        return protocol.getType();
    }
}
