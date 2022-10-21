package com.maven.junit.hibernatejpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserMain {

	private static EntityManagerFactory entityManagerFactory =
	          Persistence.createEntityManagerFactory("jpaDemodb");

	  public static void main(String[] args) {
	      try {
	          persistEntity();
	      } finally {
	          entityManagerFactory.close();
	      }
	  }

	  public static void persistEntity() {
	      User user = new User();
	      EntityManager em = entityManagerFactory.createEntityManager();
	      em.getTransaction().begin();
	      em.persist(user);
	      em.getTransaction().commit();
	      em.close();
	  }
}
