package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Booking_dto;

public class Booking_dao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("abc");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void insert(Booking_dto dto) {
		entityTransaction.begin();
		entityManager.persist(dto);
		entityTransaction.commit();
	}
	
}
