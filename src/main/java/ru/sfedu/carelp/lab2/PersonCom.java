package ru.sfedu.carelp.lab2;

import javax.persistence.Embeddable;
import java.util.Objects;

/**
 * Компонент, вмещающий в себя краткую информацию о сотруднике некой компании Panchenko
 */
@Embeddable
public class PersonCom {
    String name;
    Integer phoneNumber;
    String mainLanguage;

    public PersonCom() {
    }

    public PersonCom(String name, Integer phoneNumber, String mainLanguage) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.mainLanguage = mainLanguage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMainLanguage() {
        return mainLanguage;
    }

    public void setMainLanguage(String mainLanguage) {
        this.mainLanguage = mainLanguage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonCom that = (PersonCom) o;
        return Objects.equals(name, that.name) && Objects.equals(phoneNumber, that.phoneNumber) && Objects.equals(mainLanguage, that.mainLanguage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phoneNumber, mainLanguage);
    }

    @Override
    public String toString() {
        return "PersonCom{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", mainLanguage='" + mainLanguage + '\'' +
                '}';
    }

}
