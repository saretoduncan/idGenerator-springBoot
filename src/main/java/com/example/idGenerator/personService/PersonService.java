package com.example.idGenerator.personService;

import com.example.idGenerator.dao.GenerateIdDao;
import com.example.idGenerator.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonService {
    private final GenerateIdDao generateIdDao;
@Autowired
    public PersonService(@Qualifier("fakeDao") GenerateIdDao generateIdDao) {
        this.generateIdDao = generateIdDao;
    }
    public int addPerson(Person person){
        return generateIdDao.generatePersonId(person);
    }
    public List<Person> getAllPeople(){
        return generateIdDao.selectAllPeople();
    }
}
