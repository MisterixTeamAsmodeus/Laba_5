package org.example.protocol;

import org.example.api.HttpProtocol;

/// Класс для работы put запроса
public class Put implements HttpProtocol {
    @Override
    public String getType() {
        return "Put";
    }
}
