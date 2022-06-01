package com.ty.composit;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetUserByEmailId {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Query query=entityManager.createQuery("select u from User u where u.userId.email=?1");
		query.setParameter(1," shilpa@gmail.com");
		
		List<User> users=query.getResultList();
		
		if(users.size()>0) {
			for(User user:users)
			{
			System.out.println("name is"+user.getName());
			System.out.println("age is"+user.getAge());
			System.out.println("email is");
			System.out.println("phone is");
		}
	}else {
		System.out.println("sorry no data for given email");
	}
	}
}
		

		
		


