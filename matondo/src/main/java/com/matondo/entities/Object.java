package com.matondo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Object {

	@Id
	@Column(name = "Object-ID")
	@GeneratedValue
	private Long idObject;
	private String description;
	private String message;
	private String type; // trouvé / perdu
	private String urlImage;
	private String assureur;
	private String numAssurence;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_Person")
	private Person person;

	public Object() {
		super();
	}

	public Object(String description, String message, String type, String urlImage, String assureur,
			String numAssurence, Person person) {
		super();
		this.description = description;
		this.message = message;
		this.type = type;
		this.urlImage = urlImage;
		this.assureur = assureur;
		this.numAssurence = numAssurence;
		this.person = person;
	}

	public Object(Long idObject, String description, String message, String type, String urlImage, String assureur,
			String numAssurence, Person person) {
		super();
		this.idObject = idObject;
		this.description = description;
		this.message = message;
		this.type = type;
		this.urlImage = urlImage;
		this.assureur = assureur;
		this.numAssurence = numAssurence;
		this.person = person;
	}

	public String getAssureur() {
		return assureur;
	}

	public String getDescription() {
		return description;
	}

	public Long getIdObject() {
		return idObject;
	}

	public String getMessage() {
		return message;
	}

	public String getNumAssurence() {
		return numAssurence;
	}

	public String getType() {
		return type;
	}

	public String getUrlImage() {
		return urlImage;
	}

	public void setAssureur(String assureur) {
		this.assureur = assureur;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setIdObject(Long idObject) {
		this.idObject = idObject;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setNumAssurence(String numAssurence) {
		this.numAssurence = numAssurence;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

}
