package org.example.api;

///Api для получения информации о базе данных
public interface Database {
    /**
     * Получение имени базы данных
     *
     * @return Название базы данных
     */
    String getName();
}
