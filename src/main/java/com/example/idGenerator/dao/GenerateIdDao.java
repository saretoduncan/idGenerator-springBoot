package com.example.idGenerator.dao;

import com.example.idGenerator.model.Person;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.UUID;

public interface GenerateIdDao {
    int insertPerson(UUID id, Person person, String date);
  default int generatePersonId(Person person){
      UUID id = UUID.randomUUID();
      LocalDateTime localDateTime= LocalDateTime.now();
      DateTimeFormatter dft = DateTimeFormatter.ofPattern("MMM dd, YYY h:mm a");
      String datedft= dft.format(localDateTime);
      return insertPerson(id, person,datedft);
  }
  List<Person> selectAllPeople();

}
