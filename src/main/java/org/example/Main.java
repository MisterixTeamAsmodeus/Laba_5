package org.example;

import org.example.injector.Injector;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Injector injector = new Injector("implementation.properties");
        Server server = (Server) injector.inject(new Server());

        System.out.println(server.getDatabaseName());
        System.out.println(server.getProtocolType());
    }
}