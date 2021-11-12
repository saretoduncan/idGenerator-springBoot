package com.example.idGenerator.api;

import com.example.idGenerator.model.Person;
import com.example.idGenerator.personService.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/person")
@RestController
public class IdGeneratorController {
 private final PersonService personService;
    @Autowired
    public IdGeneratorController(PersonService personService) {
        this.personService = personService;
    }
    @PostMapping
    public void addPerson(@RequestBody Person person){
        personService.addPerson(person);
    }
    @GetMapping
    public List<Person> getAllPeople(){
        return personService.getAllPeople();
    }




}
