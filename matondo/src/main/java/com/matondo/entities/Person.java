package com.matondo.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Person {

	@Id
	@Column(name="ID_Person")
	@GeneratedValue
	private Long idPerson;
	private String firstName;
	private String lastName;
	private String Email;
	private String sex;
	private String Adresse;
	private String zip;
	private String phone;
	private String country;
	private String city;
	private String UserName;
	private String password;	
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="UNumber_ID")	
	private Unumber uniqueNumber;	
	
	@OneToMany(mappedBy="person" ,cascade=CascadeType.ALL)
	private List<Object> listObject;

	public List<Object> getListObject() {
		return listObject;
	}

	public void setListObject(List<Object> listObject) {
		this.listObject = listObject;
	}

	public Person() {
		super();
	}

	public Person(Long idPerson, String firstName, String lastName, String email, String sex, String adresse,
			String zip, String phone, String country, String city, String userName, String password,
			Unumber uniqueNumber) {
		super();
		this.idPerson = idPerson;
		this.firstName = firstName;
		this.lastName = lastName;
		Email = email;
		this.sex = sex;
		Adresse = adresse;
		this.zip = zip;
		this.phone = phone;
		this.country = country;
		this.city = city;
		UserName = userName;
		this.password = password;
		this.uniqueNumber = uniqueNumber;
	}

	public Person(String firstName, String lastName, String email, String sex, String adresse, String zip, String phone,
			String country, String city, String userName, String password, Unumber uniqueNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		Email = email;
		this.sex = sex;
		Adresse = adresse;
		this.zip = zip;
		this.phone = phone;
		this.country = country;
		this.city = city;
		UserName = userName;
		this.password = password;
		this.uniqueNumber = uniqueNumber;
	}

	public String getAdresse() {
		return Adresse;
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}

	public String getEmail() {
		return Email;
	}

	public String getFirstName() {
		return firstName;
	}

	public Long getIdPerson() {
		return idPerson;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPassword() {
		return password;
	}

	public String getPhone() {
		return phone;
	}

	public String getSex() {
		return sex;
	}

	public Unumber getUniqueNumber() {
		return uniqueNumber;
	}

	public String getUserName() {
		return UserName;
	}

	public String getZip() {
		return zip;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setIdPerson(Long idPerson) {
		this.idPerson = idPerson;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setUniqueNumber(Unumber uniqueNumber) {
		this.uniqueNumber = uniqueNumber;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

}
