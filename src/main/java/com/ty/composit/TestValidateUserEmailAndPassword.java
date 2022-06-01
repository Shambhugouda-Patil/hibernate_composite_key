package com.ty.composit;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestValidateUserEmailAndPassword {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Query query=entityManager.createQuery("SELECT u FROM User u WHERE u.userId.email=?1 AND u.password=?2");
		query.setParameter(1, " shilpa@gmail.com");
		query.setParameter(2,56780);
		
		List<User> users=query.getResultList();
		
		if(users.size()>0) {
			System.out.println("==========User is Valid============");
		for(User user:users) {
			System.out.println("name is"+user.getName());
			System.out.println("age is:"+user.getAge());
			System.out.println("email is");
			System.out.println("phone is");
		}
	}
	else
	{
		System.out.println("user is invalid....");
	}
}

}
