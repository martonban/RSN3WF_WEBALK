package com.example.H8_AdatB;
//Normal CRUD cuccolkat beimplemnetálja
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

// Entitáns, majd a kulcs érték típusa

public interface PeopleRepository extends PagingAndSortingRepository<People, Long> {


}
