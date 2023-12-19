package org.example.protocol;

import org.example.api.HttpProtocol;

public class Put implements HttpProtocol {
    @Override
    public String getType() {
        return "Put";
    }
}
