package com.example.service;

import java.util.List;

import com.example.model.Person;

public interface PersonService {
	void save(Person person);

	List<Person> list();
}
