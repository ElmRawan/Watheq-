package de.cosh.azure.model;

import java.util.Date;

/**
 * Created by cosh on 06.12.2016.
 */
public class PersonBuilder {
    private String name;
    private Long salary;
    private Date birthday;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSalary(Long salary) {
        this.salary = salary;
        return this;
    }

    public PersonBuilder setBirthday(Date birthday) {
        this.birthday = birthday;
        return this;
    }

    public Person createPerson() {
        return new Person(name, salary, birthday);
    }
}