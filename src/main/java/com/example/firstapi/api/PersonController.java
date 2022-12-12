package com.example.firstapi.api;

import com.example.firstapi.model.Person;
import com.example.firstapi.service.PersonService;

public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    public void addPerson(Person person){
        personService.addPerson(person);
    }
}
