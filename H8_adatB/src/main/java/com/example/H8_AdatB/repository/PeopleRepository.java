package com.example.H8_AdatB.repository;
//Normal CRUD cuccolkat beimplemnetálja
import com.example.H8_AdatB.repository.People;
import org.springframework.data.repository.PagingAndSortingRepository;

// Entitáns, majd a kulcs érték típusa

public interface PeopleRepository extends PagingAndSortingRepository<People, Long> {


}
