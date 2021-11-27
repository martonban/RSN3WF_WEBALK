package com.example.H8_AdatB.controller;

import com.example.H8_AdatB.service.NoSuchEntityException;
import com.example.H8_AdatB.service.PeopleService;
import com.example.H8_AdatB.service.People;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/people")
public class PeopleController {

    private final PeopleService peopleService;

    public PeopleController(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    @GetMapping
    public Iterable<PeopleDto> getAllPeople(){
        List<PeopleDto> peopleDtoList = new ArrayList<>();
        for (People people : peopleService.getAllPeople()){
            peopleDtoList.add(new PeopleDto(people));
        }
        return peopleDtoList;
    }

    @PostMapping(consumes = "application/json")
    public PeopleDto save(@RequestBody @Valid PeopleCreateDto peopleCreateDto){
       return new PeopleDto(peopleService.create(peopleCreateDto.toPeople()));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) throws NoSuchEntityException {
        peopleService.delete(id);
    }

    @GetMapping("/{id}")
    public PeopleDto getById(@PathVariable("id") Long id) throws NoSuchEntityException {
        return new PeopleDto(peopleService.getById(id));
    }


    @PutMapping
    void save(@RequestBody @Valid PeopleDto peopleDto) throws NoSuchEntityException {
        peopleService.save(peopleDto.toPeople());
    }


    @GetMapping("/findByAgeGt")
    Iterable<PeopleDto> findAdultPeople(@RequestParam("age") int age){
        List<PeopleDto> peopleDtoList = new ArrayList<>();
        for(People people : peopleService.findByAgeGreatherThan(age)){
            peopleDtoList.add(new PeopleDto(people));
        }
        return peopleDtoList;
    }




}