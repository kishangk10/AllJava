package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Patientdto;

public class Patientdao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void insert(Patientdto patientdto) {
		entityTransaction.begin();
		entityManager.persist(patientdto);
		entityTransaction.commit();
	}
	
	public void update(int id,long ph) {
		Patientdto patientdto=entityManager.find(Patientdto.class, id);
		patientdto.setPH_Number(ph);
		
		if(patientdto != null) {
		entityTransaction.begin();
		entityManager.merge(patientdto);
		entityTransaction.commit();
		}else {
			System.out.println("No data found with id "+ id);
		}
	}
	
	public void remove(int id) {
		Patientdto patientdto=entityManager.find(Patientdto.class, id);
		System.out.println(patientdto);
		
		if (patientdto != null) {
			entityTransaction.begin();
			entityManager.remove(patientdto);
			entityTransaction.commit();
		}else {
			System.out.println("no data found with this id "+ id);
		}
	}
}
