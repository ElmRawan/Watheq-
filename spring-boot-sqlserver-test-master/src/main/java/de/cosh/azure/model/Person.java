package de.cosh.azure.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by cosh on 06.12.2016.
 */
@Entity
@Table(name = "Person")
public class Person implements Serializable {

    private static final long serialVersionUID = -7010393690008725370L;

    @Id
    @GeneratedValue
    Long id;

    @Column(name = "name")
    String name;


    @Column(name = "salary")
    Long salary;


    @Column(name = "birthday")
    Date birthday;

    public Person(String name, Long salary, Date birthday) {
        this.name = name;
        this.salary = salary;
        this.birthday = birthday;
    }

    public Person() {
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

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;

        System.out.print(birthday.toString());
    }
}