package com.matondo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Unumber {

	@Id
	@Column(name="UNumber_ID")
	@GeneratedValue
	private Long idUnumber;
	private String number;		
		
	public Unumber() {
		super();
	}

	public Unumber(Long idUnumber, String number) {
		super();
		this.idUnumber = idUnumber;
		this.number = number;
	}

	public Unumber(String number) {
		super();
		this.number = number;
	}

	public Long getIdUnumber() {
		return idUnumber;
	}

	public String getNumber() {
		return number;
	}
	

	public void setIdUnumber(Long idUnumber) {
		this.idUnumber = idUnumber;
	}

	public void setNumber(String number) {
		this.number = number;
	}


	
	
}
