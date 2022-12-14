package com.boot.crud.controller;

import com.boot.crud.entity.Address;
import com.boot.crud.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/address")
@RequiredArgsConstructor
public class AddressController {

    private final AddressService addressService;

    @GetMapping("/{id}")
    public ResponseEntity<Address> findById(@PathVariable Long id) {
        Optional<Address> address = addressService.findById(id);
        Address addressEntity = address.get();
        return ResponseEntity.status(HttpStatus.OK).body(addressEntity);
    }

    @GetMapping
    public ResponseEntity<List<Address>> findAll() {
        Optional<List<Address>> all = addressService.findAll();
        List<Address> addressList = all.get();
        return ResponseEntity.status(HttpStatus.OK).body(addressList);
    }

    @PostMapping
    public ResponseEntity<Address> saveOrUpdate(@RequestBody Address entity) {
        Optional<Address> address = addressService.saveOrUpdate(entity);
        Address addressEntity = address.get();
        return ResponseEntity.status(HttpStatus.OK).body(addressEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        addressService.deleteById(id);
    }
}
