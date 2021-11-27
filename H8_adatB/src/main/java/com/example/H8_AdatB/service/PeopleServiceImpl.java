package com.example.H8_AdatB.service;
import com.example.H8_AdatB.repository.PeopleRepository;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;


@Service
public class PeopleServiceImpl implements PeopleService {


    private final PeopleRepository peopleRepository;

    public PeopleServiceImpl(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    @Override
    public Iterable<People> getAllPeople() {
        List<People> rv =new ArrayList<>();
        for(com.example.H8_AdatB.repository.People people : peopleRepository.findAll()){
            rv.add(new People(people));
        }
        return rv;
    }

    @Override
    public People create(People people) {
        return new People(peopleRepository.save(people.toEntity()));
    }

    @Override
    public void delete(Long id) throws NoSuchEntityException {
        try{
            peopleRepository.deleteById(id);
        }catch(EmptyResultDataAccessException ex){
            throw new NoSuchEntityException(id);
        }
    }

    @Override
    public People getById(Long id) throws NoSuchEntityException {
        Optional<com.example.H8_AdatB.repository.People> optionalPeople =
            peopleRepository.findById(id);
        if(optionalPeople.isEmpty()){
            throw  new NoSuchEntityException(id);
        }
        return new People(optionalPeople.get());
    }

    @Override
    public void save(People people) throws NoSuchEntityException {
        Optional<com.example.H8_AdatB.repository.People> optionalPeople =
                peopleRepository.findById(people.getId());
        if(optionalPeople.isEmpty()){
            throw  new NoSuchEntityException(people.getId());
        }
        peopleRepository.save(people.toEntity());
    }

    @Override
    public Iterable<? extends People> findByAgeGreatherThan(int age) {
        return StreamSupport.stream(peopleRepository.findAllByAgeGreaterThanEqual(age).spliterator(), false)
                .map(People::new)
                .collect(Collectors.toList());
    }

    public Iterable<People> getAllPeople2() {
        return StreamSupport.stream(peopleRepository.findAll().spliterator(), false)
                .map(People::new)
                .collect(Collectors.toList());
    }

}
