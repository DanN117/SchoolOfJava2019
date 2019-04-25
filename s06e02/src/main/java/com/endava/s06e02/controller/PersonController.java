package com.endava.s06e02.controller;

import com.endava.s06e02.entities.Person;
import com.endava.s06e02.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    final PersonService personService;

    @Autowired
    PersonController (PersonService personService) {
        this.personService = personService;
    }

    @RequestMapping(path = "/getPeople", method = RequestMethod.GET?)
    public List<Person> getPeople() {

    }

    @RequestMapping(path = "/getPersonById/{personId}",  method = RequestMethod.GET)
    public  Person getPersonById(@PathVariable int personId) {

    }

}
