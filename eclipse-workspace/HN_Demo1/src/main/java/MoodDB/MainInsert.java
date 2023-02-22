package MoodDB;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainInsert {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Insert insert=new Insert();
		insert.setId(1);
		insert.setName("kishan");
		insert.setAge(22);
		
		entityTransaction.begin();
		entityManager.persist(insert);
		entityTransaction.commit();
	}
}
