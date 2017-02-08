package com.matondo.repository;

import java.util.List;

public interface IObjejctRepository {

	Object save(Object object);
	Object update(Object object);
	void deleteObject(Long idObject);
	List<Object> getListBytype(String type); // lost/found
	List<Object> getAllObject();
	Object findObjectByUnumber(String Unumber);
	Object getObjectById(Long idObject);
}
