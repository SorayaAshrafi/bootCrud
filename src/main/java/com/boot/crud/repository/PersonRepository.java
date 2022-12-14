package com.boot.crud.repository;

import com.boot.crud.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long>{
    Optional<Person> findById(Person id);

    void deleteById(Person id);
}
