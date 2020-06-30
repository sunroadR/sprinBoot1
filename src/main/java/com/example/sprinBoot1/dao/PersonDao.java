package com.example.sprinBoot1.dao;
import com.example.sprinBoot1.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {

    int insertPerson(UUID id, Person person);

    default  int insertPerson(Person person){
        UUID id  = UUID.randomUUID();
        return insertPerson(id,person);
    }

    List<Person> selectAllPeople();

    Optional<Person> selectPersonById(UUID id);

    int deletPersonById(UUID id);
    int updatePersonByID(UUID id, Person person);

}
