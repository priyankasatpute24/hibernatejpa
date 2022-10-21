package com.maven.junit.hibernatejpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserMain1 {
	
		  private static EntityManagerFactory entityManagerFactory =
		          Persistence.createEntityManagerFactory("example-unit");

		  public static void main(String[] args) {
		      try {
		          persistEntity();
		      } finally {
		          entityManagerFactory.close();
		      }
		  }

		  public static void persistEntity() {
		      User user = new User();
		      user.setName("Adam");
		      user.setPhone("111-111-111");

		      EntityManager em = entityManagerFactory.createEntityManager();
		      em.getTransaction().begin();
		      em.persist(user);
		      em.getTransaction().commit();
		      em.close();
		  }
}
