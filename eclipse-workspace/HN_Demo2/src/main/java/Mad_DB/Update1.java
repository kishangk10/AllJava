package Mad_DB;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update1 {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
//		Details1 e=entityManager.find(Details1.class, 1);
//		e.setName("moon");
//		
//		entityTransaction.begin();
//		entityManager.persist(e);
//		entityTransaction.commit();
		
		Details1 d=entityManager.find(Details1.class, 2);
		d.setAge(150);
		
		entityTransaction.begin();
		entityManager.merge(d);
		entityTransaction.commit();
	}
}
