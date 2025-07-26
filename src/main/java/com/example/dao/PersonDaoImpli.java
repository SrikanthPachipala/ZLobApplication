package com.example.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.model.Person;

@Repository
@Transactional
public class PersonDaoImpli implements PersonDao {
	@Autowired
	private SessionFactory sessionFactory;

	public void save(Person person) {
		sessionFactory.getCurrentSession().save(person);
	}

	public List<Person> list() {
		return sessionFactory.getCurrentSession().createQuery("from Person", Person.class).list();
	}
}
