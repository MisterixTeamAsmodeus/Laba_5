package org.example.injector;

import org.example.Server;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class InjectorTest {
    Injector injector;

    @Before
    public void setUp() throws IOException {
        injector = new Injector("test_properties.properties");
    }

    @Test
    public void inject() {
        Server server = (Server) injector.inject(new Server());

        Assert.assertEquals(server.getDatabaseName(), "MySQL");
        Assert.assertEquals(server.getProtocolType(), "Get");
    }
}