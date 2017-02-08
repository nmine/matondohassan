package com.matondo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.matondo.entities.Person;
import com.matondo.repository.IPersonRepository;
public class IPersonServiceImp implements IPersonService {
	
	
	@Autowired
    private IPersonRepository repository;
	@Override
	public Person savePerson(Person person) {
		return repository.savePerson(person);
	}

	@Override
	public Person udpatePerson(Person person) {
     return repository.udpatePerson(person);    
	}

	@Override
	public void deletePerson(Long idPerson) {
repository.deletePerson(idPerson);
	}

	@Override
	public List<Person> getListPerson() {		
		return repository.getListPerson();
	}

	@Override
	public List<Person> getPersonByCity(String city) {
		return repository.getPersonByCity(city);
	}

	@Override
	public Person getPersonById(Long idPerson) {
       
		return repository.getPersonById(idPerson);
	}

	@Override
	public Person getPersonByUniNumber(String number) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkIfExist(String login, String password) {
		return repository.checkIfExist(login, password);
	}

	@Override
	public boolean chekIfEmailExist(String email) {

		return repository.chekIfEmailExist(email);
	}

}
