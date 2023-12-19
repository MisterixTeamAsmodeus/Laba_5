package org.example.protocol;

import org.example.api.HttpProtocol;

public class Get implements HttpProtocol {
    @Override
    public String getType() {
        return "Get";
    }
}
