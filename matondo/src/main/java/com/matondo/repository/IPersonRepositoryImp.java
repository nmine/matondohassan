package com.matondo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.matondo.entities.Person;

public class IPersonRepositoryImp implements IPersonRepository {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public Person savePerson(Person person) {
		em.persist(person);
		em.flush();
		return person;
	}

	@Override
	public Person udpatePerson(Person person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletePerson(Long idPerson) {
       Person p =getPersonById(idPerson);
       em.remove(p);
       em.flush();
	}

	@Override
	public List<Person> getListPerson() {
		Query query = em.createQuery("select p from person", Person.class);
		List<Person> listPersons = (List<Person>)query.getResultList();
		return listPersons;
	}

	@Override
	public List<Person> getPersonByCity(String city) {	 
		Query query = em.createQuery("select p from Person where p.city ='"+city, Person.class);
		List<Person> listPersons = (List<Person>)query.getResultList();
		return listPersons;
		
	}

	@Override
	public Person getPersonById(Long idPerson) {
		Query query = em.createQuery("select p from Person where p.idPerson ='"+idPerson, Person.class);
		Person Person = (Person)query.getResultList();
		return Person;
	}

	@Override
	public Person getPersonByUniNumber(String number) {
		
		return null;
	}

	@Override
	public boolean checkIfExist(String login, String password) {
		Query query = em.createQuery("select p from Person where p.login = '"+login +"' AND p.password ='"+password, Person.class);
		if(!query.getResultList().isEmpty())
		     return true;
		else
			return false;		
	}

	@Override
	public boolean chekIfEmailExist(String email) {
		Query query = em.createQuery("select p from Person where p.email = '"+email, Person.class);
		if(!query.getResultList().isEmpty())
		     return true;
		else
			return false;
	}

}
