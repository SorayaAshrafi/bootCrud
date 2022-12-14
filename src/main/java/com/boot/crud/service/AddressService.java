package com.boot.crud.service;

import com.boot.crud.entity.Address;
import com.boot.crud.repository.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AddressService implements BaseService<Address> {

    private final AddressRepository addressRepository;

    @Override
    public Optional<Address> findById(Long id) {
        Optional<Address> address = addressRepository.findById(id);
        return address;
    }

    @Override
    public Optional<List<Address>> findAll() {
        List<Address> addressList = addressRepository.findAll();
        return Optional.of(addressList);
    }

    @Override
    public Optional<Address> saveOrUpdate(Address entity) {
        Address address = addressRepository.save(entity);
        return Optional.of(address);
    }

    @Override
    public void deleteById(Long id) {
        addressRepository.deleteById(id);
    }
}
