package com.example.dao;

import java.util.List;

import com.example.model.Person;

public interface PersonDao {
	void save(Person person);

	List<Person> list();
}
