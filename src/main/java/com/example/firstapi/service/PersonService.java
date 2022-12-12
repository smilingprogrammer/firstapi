package com.example.firstapi.service;

import com.example.firstapi.dao.PersonDao;
import com.example.firstapi.model.Person;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private final PersonDao personDao;

    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person){
        return personDao.insertPerson(person);
    }
}
