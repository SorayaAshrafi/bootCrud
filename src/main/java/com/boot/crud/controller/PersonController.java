package com.boot.crud.controller;

import com.boot.crud.entity.Person;
import com.boot.crud.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;


    @GetMapping("/{id}")
    public ResponseEntity<Person> findById(@PathVariable Long id) {
        Optional<Person> person = personService.findById(id);
        Person personEntity = person.get();
        return ResponseEntity.status(HttpStatus.OK).body(personEntity);
    }

    @GetMapping
    public ResponseEntity<List<Person>> findAll() {
        Optional<List<Person>> all = personService.findAll();
        List<Person> personList = all.get();
        return ResponseEntity.status(HttpStatus.OK).body(personList);
    }

    @PostMapping
    public ResponseEntity<Person> saveOrUpdate(@RequestBody Person entity) {
        Optional<Person> person = personService.saveOrUpdate(entity);
        Person personEntity = person.get();
        return ResponseEntity.status(HttpStatus.OK).body(personEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        personService.deleteById(id);
    }
}
