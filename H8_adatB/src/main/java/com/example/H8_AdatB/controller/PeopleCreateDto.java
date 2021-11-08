package com.example.H8_AdatB.controller;

import com.example.H8_AdatB.repository.People;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class PeopleCreateDto {


    public PeopleCreateDto(com.example.H8_AdatB.service.People people){

    }

    public PeopleCreateDto(People people){

        this.age = people.getAge();
        this.name = people.getName();
    }


    @NotEmpty
    private String name;
    @Size(min=18)
    private int age;


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

    public People toPeople(){
        return new People(null, age, name);
    }


}
