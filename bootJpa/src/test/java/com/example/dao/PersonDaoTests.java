package com.example.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.dao.PersonDao;
import com.example.dao.pojo.Person;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class PersonDaoTests {

	@Autowired
	PersonDao personDao;

	@Test
	void testInsert() {
		Person person = new Person();
		person.setName("wang xxx");
		person.setSex("M");
		personDao.save(person);
		log.info("-----------finished -------");
	}

}
