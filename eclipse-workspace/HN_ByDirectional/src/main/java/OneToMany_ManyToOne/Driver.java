package OneToMany_ManyToOne;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Student student=new Student();
		student.setName("kishan");
		
		InstaAccount instaAccount=new InstaAccount();
		instaAccount.setiAccName("The God");
		instaAccount.setS(student);
		
		InstaAccount instaAccount1=new InstaAccount();
		instaAccount1.setiAccName("The Mass");
		instaAccount1.setS(student);
		
		InstaAccount instaAccount2=new InstaAccount();
		instaAccount2.setiAccName("The Boss");
		instaAccount2.setS(student);
		
		List<InstaAccount> accounts=new ArrayList<InstaAccount>();
		accounts.add(instaAccount2);
		accounts.add(instaAccount1);
		accounts.add(instaAccount);
		
		student.setiA(accounts);
		
		entityTransaction.begin();
		entityManager.persist(student);
		entityManager.persist(instaAccount);
		entityManager.persist(instaAccount1);
		entityManager.persist(instaAccount2);
		entityTransaction.commit();
		
	}
}
