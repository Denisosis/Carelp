package ru.sfedu.carelp.entity;

import com.opencsv.bean.CsvBindByName;
import ru.sfedu.carelp.ConstantsValues;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Objects;

/**
 * Класс, наследующий объект InfoCard. Используется для добавления визитной карты пользователя
 */
@XmlRootElement
public class BusinessCard extends InfoCard{
    @CsvBindByName(column = ConstantsValues.INFO_CARD_PHONE_NUMBER)
    String phoneNumber;
    @CsvBindByName(column = ConstantsValues.INFO_CARD_ADDRESS)
    String address;
    @CsvBindByName(column = ConstantsValues.INFO_CARD_EMAIL)
    String email;
    @CsvBindByName(column = ConstantsValues.INFO_CARD_SITE)
    String site;

    /**
     * Конструктор для создания объекта визитной карты
     * @param company Наименование компании. Параметр, переданный от родительского класса
     * @param description Описание к инфокарте. Передан из родительского класса
     * @param phoneNumber Номер телефона
     * @param address Адрес предоставления услуг
     * @param email Электронная почта
     * @param site Веб-сайт организации
     */
    public BusinessCard(String company, String description, String phoneNumber, String address, String email, String site) {
        super(company, description);
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
        this.site = site;
    }

    public BusinessCard() {
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    @Override
    public String toString() {
        return "BusinessCard{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", site='" + site + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BusinessCard that = (BusinessCard) o;
        return Objects.equals(phoneNumber, that.phoneNumber) && Objects.equals(address, that.address) && Objects.equals(email, that.email) && Objects.equals(site, that.site);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber, address, email, site);
    }

}
