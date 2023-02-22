package OneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Person person=new Person();
		person.setName("Kishan");
		
		Pancard pancard=new Pancard();
		pancard.setPanNumber("47d546c");
		
		person.setpC(pancard);
		pancard.setPer(person);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pancard);
		entityTransaction.commit();
	}
}
