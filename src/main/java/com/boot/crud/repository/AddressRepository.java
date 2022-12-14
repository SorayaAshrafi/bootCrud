package com.boot.crud.repository;

import com.boot.crud.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {
    void deleteById(Address id);

    Optional<Address> findById(Address id);
}
