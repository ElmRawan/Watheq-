package de.cosh.azure.service;

import de.cosh.azure.model.Person;
import de.cosh.azure.repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

/**
 * Created by cosh on 06.12.2016.
 */
@Service
public class PersonServiceImpl implements PersonService {

    private final static  Logger LOGGER = LoggerFactory.getLogger(PersonServiceImpl.class);


    @Autowired
    private PersonRepository personRepository;

    @Override
    public double getAverageSalary() {

        double salarySum = 0;
        List<Person> personList = personRepository.findAll();

        for (Person person : personList) {

            salarySum = salarySum + person.getSalary();

            if (person.getBirthday() != null) {
                LOGGER.debug("The birthday of the person : {}", person.getBirthday());
            }
        }

        return salarySum / personList.size();
    }

    public Person addPerson(Person person) {
        return personRepository.save(person);
    }

    @Override
    public Collection<Person> findAll() {
        return personRepository.findAll();
    }

    @Override
    public Person findOne(Long id) {
        return personRepository.findOne(id);
    }

    @Override
    public Person create(Person person) {

        if (person.getId() != null) {
            return null;
        }
        return personRepository.save(person);
    }

    @Override
    public Person update(Person person) {
        Person persistedPerson = personRepository.findOne(person.getId());

        if (persistedPerson == null) {
            return null;
        }

        return personRepository.save(person);
    }

    @Override
    public void delete(long id) {
        personRepository.delete(id);
    }

    @Override
    public void tabulaRasa() {
        personRepository.deleteAll();
    }
}
