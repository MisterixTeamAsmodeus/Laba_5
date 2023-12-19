package org.example.protocol;

import org.example.api.HttpProtocol;

public class Post implements HttpProtocol {
    @Override
    public String getType() {
        return "Post";
    }
}
