package com.example.H8_AdatB.service;


import com.example.H8_AdatB.repository.PeopleRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PeopleServiceImpl implements PeopleService {
    private final PeopleRepository peopleRepository;

    public PeopleServiceImpl(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    @Override
    //Az Iteriblenben a Service van
    public Iterable<People> getAllPeople() {
        List<People> rv = new ArrayList<>();
        for(com.example.H8_AdatB.repository.People people :peopleRepository.findAll()){
            rv.add(new People(people));
        }
        return rv;
    }


    @Override
    public People create(People toPeople){
        retun peopleRepository.save(new com.example.H8_AdatB.repository.People())
        peopleDto.setAge(people.getAge());
        peopleDto.setName(people.getName());
        peopleRepository
    }

    /*
    //Fullos megoldás
    public Iterable<People> getAllPeople2() {
        return StreanSupport.stream(peopleRepository.findAll().spliterator(), false)
                .map(People::new)
                .collect(Collectors.toList());
    }
     */

}
