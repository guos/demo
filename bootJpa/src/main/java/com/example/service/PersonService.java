package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.PersonDao;
import com.example.dao.pojo.Person;

@Service
public class PersonService {

	@Autowired
	PersonDao personDao;

	public List<Person> queryAll() {
		return personDao.findAll();
	}

	public Person queryPerson(Integer id) {
		// Optional<Person> result=personDao.findById(id);

		return personDao.findById(id).get();

	}

	public boolean insert(Person person) {
		Person sPerson = personDao.save(person);
		if (sPerson.getId() != null) {
			return true;
		}
		return false;
	}

	public Person queryBySex(String sex) {
		return personDao.findBySex(sex);
	}

}
