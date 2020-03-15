package de.cosh.azure.rest;

import de.cosh.azure.model.Person;
import de.cosh.azure.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by cosh on 06.12.2016.
 */
@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(method = RequestMethod.POST)
    ResponseEntity<Person> add(@RequestBody Person input) {

        Person person = this.personService.create(input);

        return new ResponseEntity<Person>(person, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET)
    ResponseEntity<Collection<Person>> getAll() {

        Collection<Person> personCollection = this.personService.findAll();

        return new ResponseEntity<Collection<Person>>(personCollection, HttpStatus.OK);
    }
}
