package MoodDB;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainInsert1 {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Insert1 insert1=new Insert1();
		insert1.setId(1);
		insert1.setName("kis");
		insert1.setAge(24);
		
		entityTransaction.begin();
		entityManager.persist(insert1);
		entityTransaction.commit();
	}
	
}
