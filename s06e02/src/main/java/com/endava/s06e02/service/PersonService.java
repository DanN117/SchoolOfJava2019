package com.endava.s06e02.service;

import com.endava.s06e02.entities.Person;
import com.endava.s06e02.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getPeople() {
        return personRepository.
    }

    public Person getPersonById(int id) {
        if (personRepository.findById(id).isPresent()) {
            return personRepository.findById(id);
        }

        return null;
    }
}
