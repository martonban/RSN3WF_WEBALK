package com.example.H8_AdatB.controller;

import com.example.H8_AdatB.repository.People;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class PeopleDto {

    public PeopleDto(com.example.H8_AdatB.service.People people){

    }

    public PeopleDto(People people){
        this.id = people.getId();
        this.age = people.getAge();
        this.name = people.getName();
    }

    private Long id;
    @NotEmpty
    private String name;
    @Min(18)
    private int age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
