package com.example.idGenerator.dao;

import com.example.idGenerator.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fake")
public class FakeDataAccessService implements GenerateIdDao{
    public List<Person> DB = new ArrayList<>();

@Override
    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id, person.getName()));
        return 1;
    }

    @Override
    public List<Person> selectAllPeople() {
        return DB;
    }
}
