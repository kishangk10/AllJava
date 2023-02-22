package OneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Student student=new Student();
		student.setName("pramod");
		
		InstaAccount instaAccount=new InstaAccount();
		instaAccount.setInstaName("Ramesh");
		
		InstaAccount instaAccount2=new InstaAccount();
		instaAccount2.setInstaName("suresh");
		
		InstaAccount instaAccount3=new InstaAccount();
		instaAccount3.setInstaName("Lokesh");
		
		List<InstaAccount> l=new ArrayList<InstaAccount>();
		l.add(instaAccount);
		l.add(instaAccount2);
		l.add(instaAccount3);
		
		student.setI(l);
		
		entityTransaction.begin();
		entityManager.persist(instaAccount);
		entityManager.persist(instaAccount2);
		entityManager.persist(instaAccount3);
		entityTransaction.commit();
	}
}
