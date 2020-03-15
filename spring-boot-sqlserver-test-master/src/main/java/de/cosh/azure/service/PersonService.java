package de.cosh.azure.service;

import de.cosh.azure.model.Person;

import java.util.Collection;

/**
 * Created by cosh on 06.12.2016.
 */
public interface PersonService {
    Collection<Person> findAll();

    Person findOne(Long id);

    Person create(Person person);

    Person update(Person person);

    void delete(long id);

    void tabulaRasa();

    double getAverageSalary();
}