package ru.sfedu.carelp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Сервис для учёта автомобильных характеристик
 * @author Олег Панченко
 * Главный класс приложения
 */
public class CarelpMain {
    private static final Logger logger = LogManager.getLogger(CarelpMain.class);

    /**
     * Главный метод
     * @param args параметр для ввода строковых аргументов (если потребуется)
     */
    public static void main( String[] args ) {
        logger.info(ConstantsValues.HELLO_WORLD);
    }
}
