package com.example.H8_AdatB.service;

import com.example.H8_AdatB.service.People;

public interface PeopleService {

    Iterable<People> getAllPeople();

    People create(People toPeople);

    void delete(Long id) throws NoSuchEntityException;

    People getById(Long id) throws NoSuchEntityException;

    void save(People people) throws NoSuchEntityException;

    Iterable<? extends People> findByAgeGreatherThan(int age);


}