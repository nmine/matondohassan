package com.matondo.repository;

import java.util.List;

import com.matondo.entities.Person;


public interface IPersonRepository {

	Person savePerson(Person person);
	Person udpatePerson(Person person);
	void deletePerson(Long  idPerson);
	List<Person> getListPerson();
    List<Person> getPersonByCity(String city);//pour le coté admin  
    Person getPersonById(Long idPerson);
    Person getPersonByUniNumber(String number);
    boolean checkIfExist(String login,String password);
    boolean chekIfEmailExist(String email);
}
