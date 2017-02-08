package com.matondo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matondo.repository.IObjejctRepository;

@Service
public class IObjectServiceImp implements IObjectService {

	@Autowired
	IObjejctRepository repository;

	@Override
	public void deleteObject(Long idObject) {
		repository.deleteObject(idObject);
	}

	@Override
	public Object findObjectByUnumber(String Unumber) {

		return repository.findObjectByUnumber(Unumber);
	}

	@Override
	public List<Object> getAllObject() {

		return repository.getAllObject();
	}

	@Override
	public List<Object> getListBytype(String type) {

		return repository.getListBytype(type);
	}

	@Override
	public Object getObjectById(Long idObject) {
		// TODO Auto-generated method stub
		return repository.getObjectById(idObject);
	}

	@Override
	public Object save(Object object) {
		return repository.save(object);
	}

	@Override
	public Object update(Object object) {

		return repository.update(object);
	}

}
