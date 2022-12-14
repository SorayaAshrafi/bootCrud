package com.boot.crud.service;

import java.util.List;
import java.util.Optional;

public interface BaseService<T> {
    Optional<T> findById(Long id);
    Optional<List<T>> findAll();
    Optional<T> saveOrUpdate(T entity);
    void deleteById(Long id);
}
