package com.example.H8_AdatB;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    Iterable<PeopleDto> getAllPeople(){
        List<PeopleDto> peopleDtoList = new ArrayList<>();
        for( People people : peopleService.getAllPeople()){
            peopleDtoList.add(new PeopleDto(people));
        }
        return peopleDtoList;
    }


}
