package Mad_DB;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainDetails1 {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Details1 details1=new Details1();  
		details1.setId(4);
		details1.setName("kiii");
		details1.setAge(3);
		
		entityTransaction.begin();
		entityManager.persist(details1);
		entityTransaction.commit();
	}
}
