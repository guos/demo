package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dao.pojo.Person;

public interface PersonDao  extends JpaRepository<Person, Integer>{

	Person findBySex(String sex);
}
