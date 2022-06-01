package com.ty.composit;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveUser {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		User user=new User();
		user.setName("shilpa");
		user.setAge(24);
		user.setGender("female");
		user.setPassword(56780);
		
		UserId userId=new UserId();
		userId.setEmail("shilpa@gmail.com");
		userId.setPhone(546586878);
		
		user.setUserId(userId);
		
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		
	
	}

}
