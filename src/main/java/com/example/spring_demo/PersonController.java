package com.example.spring_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class PersonController {

    private final PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/people")
    public List<Person> getPeople() {
        return personRepository.findAll();
    }

    @PostMapping("/people")
    public Person createPerson(@RequestBody Person person) {
        return personRepository.save(person);
    }
}

