package org.example.injector;

import org.example.annotation.AutoInjectable;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

/// Класс для автоматической инициализации полей в классах
public class Injector {
    ///Таблица реализаций для заданных интерфейсов
    private final Properties properties;

    public Injector(String propertiesFile) throws IOException {
        properties = new Properties();
        loadProperties(propertiesFile);
    }

    public Injector() {
        properties = new Properties();
    }

    /**
     * Метода для загрузки или обновления таблицы реализаций
     *
     * @param propertiesFile Путь до файла настроек
     * @throws IOException Выбрасывается в случае отсутствия файла
     */
    public void loadProperties(String propertiesFile) throws IOException {
        properties.load(new FileReader(propertiesFile));
    }

    /**
     * Метода для автоматической инициализации полей класса помеченных {@link AutoInjectable}
     *
     * @param injectable Объект который необходимо проинициализировать
     * @return Возвращает проинициализированный объект
     */
    public Object inject(Object injectable) {
        Class<?> injectableClass = injectable.getClass();

        for (Field field : injectableClass.getDeclaredFields()) {
            if (field.getAnnotation(AutoInjectable.class) == null) continue;

            try {
                Class<?> implementation = Class.forName(getImplementation(field));
                Object instance = implementation.getDeclaredConstructor().newInstance();

                field.setAccessible(true);
                field.set(injectable, instance);
            } catch (ClassNotFoundException e) {
                System.out.println("Не найдена реализация для " + field.getType());
            } catch (InvocationTargetException | InstantiationException | IllegalAccessException |
                     NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
        }

        return injectable;
    }

    /**
     * Получение имя класса реализации для заданного
     *
     * @param field Поле для которого необходимо найти реализацию
     * @return Название класса реализации
     */
    private String getImplementation(Field field) {
        String className = field.getType().toString().split(" ")[1];
        return properties.getProperty(className);
    }
}
