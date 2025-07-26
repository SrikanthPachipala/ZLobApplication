package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.PersonDao;
import com.example.model.Person;

@Service
public class PersonServiceImpli implements PersonService {

	@Autowired
	private PersonDao personDAO;

	public void save(Person person) {
		((PersonService) personDAO).save(person);
	}

	public List<Person> list() {
		return ((PersonService) personDAO).list();
	}
}
