package com.matondo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

@Repository
public class ObjectRepositoryImp implements IObjejctRepository {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public Object save(Object object) {
	    if(object!=null)
	    	em.persist(object);
	        em.flush();
	        return object;				
	}

	@Override
	public Object update(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteObject(Long idObject) {
      
	  Object ob = getObjectById(idObject);      
	  em.remove(ob);
	  em.flush();
	}

	@Override
	public List<Object> getListBytype(String type) {
        Query query = em.createNativeQuery("select o from Object where o.type ='"+type, Object.class);
        List<Object> listObjectBytype = (List<Object>)query.getResultList();		
		return listObjectBytype;
	}

	@Override
	public List<Object> getAllObject() {
		Query query = em.createQuery("select o from Object", Object.class);
		List<Object> listObjects = (List<Object>)query.getResultList();
		return listObjects;
	}

	@Override
	public Object findObjectByUnumber(String Unumber) {
	
		return null;
	}

	@Override
	public Object getObjectById(Long idObject) {
		Query query = em.createNativeQuery("select o from Object where o.idObject ='"+idObject, Object.class);
        Object object = query.getSingleResult();		
		return object;				
	}

}
