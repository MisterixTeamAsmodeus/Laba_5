package org.example.protocol;

import org.example.api.HttpProtocol;

/// Класс для работы post запроса
public class Post implements HttpProtocol {
    @Override
    public String getType() {
        return "Post";
    }
}
