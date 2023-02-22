package ManyToOne1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Train train=new Train();
		train.setT_name("Mysuru Express");
		
		Passanger passanger=new Passanger();
		passanger.setName("Mahesh");
		passanger.setT(train);
		
		Passanger passanger1=new Passanger();
		passanger1.setName("Suresh");
		passanger1.setT(train);
		
		Passanger passanger2=new Passanger();
		passanger2.setName("Rakesh");
		passanger2.setT(train);
		
		
		entityTransaction.begin();
		entityManager.persist(train);
		entityManager.persist(passanger);
		entityManager.persist(passanger1);
		entityManager.persist(passanger2);
		entityTransaction.commit();
	}
}
