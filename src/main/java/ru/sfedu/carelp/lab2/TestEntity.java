package ru.sfedu.carelp.lab2;

import ru.sfedu.carelp.ConstantsValues;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity(name = ConstantsValues.TEST_ENTITY)
public class TestEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = ConstantsValues.COLUMN_TEST_ENTITY_ID)
    private Long id;
    @Column(name = ConstantsValues.COLUMN_TEST_ENTITY_NAME)
    private String name;
    private String description;
    private Date dateCreated;
    @Column(name = ConstantsValues.COLUMN_TEST_ENTITY_CHECK)
    private Boolean check;
    @Embedded
    private PersonCom personCom;

    public TestEntity() {
    }

    public TestEntity(Long id) {
        this.id = id;
    }

    public TestEntity(String name, String description, Date dateCreated, Boolean check, PersonCom personCom) {
        this.name = name;
        this.description = description;
        this.dateCreated = dateCreated;
        this.check = check;
        this.personCom = personCom;
    }

    public TestEntity(Long id, String name, String description, Date dateCreated, Boolean check, PersonCom personCom) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.dateCreated = dateCreated;
        this.check = check;
        this.personCom = personCom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Boolean getCheck() {
        return check;
    }

    public void setCheck(Boolean check) {
        this.check = check;
    }

    public PersonCom getPanchenkoComponent() {
        return personCom;
    }

    public void setPanchenkoComponent(PersonCom personCom) {
        this.personCom = personCom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestEntity that = (TestEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(description, that.description) && Objects.equals(dateCreated, that.dateCreated) && Objects.equals(check, that.check) && Objects.equals(personCom, that.personCom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, dateCreated, check, personCom);
    }

    @Override
    public String toString() {
        return "TestEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", dateCreated=" + dateCreated +
                ", check=" + check +
                ", personCom=" + personCom +
                '}';
    }

}
