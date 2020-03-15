package de.cosh.azure.rest;

import de.cosh.azure.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cosh on 06.12.2016.
 */
@RestController
@RequestMapping("/statistics")
public class PersonStatisticsController {

    @Autowired
    private PersonService personService;

    @RequestMapping(method = RequestMethod.GET, path = "/salary")
    double getAverageSalary() {
        return personService.getAverageSalary();
    }
}
