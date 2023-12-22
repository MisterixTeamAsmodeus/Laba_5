package org.example;

import org.example.annotation.AutoInjectable;
import org.example.api.Database;
import org.example.api.HttpProtocol;

///Класс для работы с сервером и получения информации о нём
public class Server {

    ///Информация о протоколе сервера
    @AutoInjectable
    private HttpProtocol protocol;
    //Информация о базе данных сервера
    @AutoInjectable
    private Database database;

    /**
     * Получение информации о базе данных
     *
     * @return Возвращает информацию о базе данных
     */
    public String getDatabaseName() {
        return database.getName();
    }

    /**
     * Получение информации о протоколе сервера
     *
     * @return Возвращает информации о протоколе сервера
     */
    public String getProtocolType() {
        return protocol.getType();
    }
}
