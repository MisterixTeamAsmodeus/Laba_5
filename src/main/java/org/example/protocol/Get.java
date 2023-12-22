package org.example.protocol;

import org.example.api.HttpProtocol;

/// Класс для работы get запроса
public class Get implements HttpProtocol {
    @Override
    public String getType() {
        return "Get";
    }
}
