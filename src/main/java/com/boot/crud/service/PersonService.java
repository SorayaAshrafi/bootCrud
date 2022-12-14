package com.boot.crud.service;

import com.boot.crud.entity.Person;
import com.boot.crud.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonService implements BaseService<Person> {

    private final PersonRepository personRepository;
    @Override
    public Optional<Person> findById(Long id) {
        Optional<Person> person = personRepository.findById(id);
        return person;
    }

    @Override
    public Optional<List<Person>> findAll() {
        List<Person> personList = personRepository.findAll();
        return Optional.of(personList);
    }

    @Override
    public Optional<Person> saveOrUpdate(Person entity) {
        Person person = personRepository.save(entity);
        return Optional.of(person);
    }

    @Override
    public void deleteById(Long id) {
        personRepository.deleteById(id);
    }
}
