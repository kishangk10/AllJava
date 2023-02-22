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
			
			PanCard panCard=new PanCard();
			panCard.setpNumber("786453was");
			panCard.setAddress("goa");
			
			Person person=new Person();
			person.setName("mod");
			person.setP(panCard);
			
			entityTransaction.begin();
			entityManager.persist(panCard);
			entityManager.persist(person);
			entityTransaction.commit();


	}
}
