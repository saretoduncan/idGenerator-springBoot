package com.example.idGenerator.dao;

import com.example.idGenerator.model.Person;

import java.util.List;
import java.util.UUID;

public interface GenerateIdDao {
    int insertPerson(UUID id, Person person);
  default int generatePersonId(Person person){
      UUID id = UUID.randomUUID();
      return insertPerson(id, person);
  }
  List<Person> selectAllPeople();

}
