package All_the_Records;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

class MainClassFetch {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

//		Details111 details111=new Details111();
//		details111.setId(4);
//		details111.setName("jhxh");
//		details111.setCity("gahzdg");
//		details111.setNumber(754585257846l);
//		
//		entityTransaction.begin();
//		entityManager.persist(details111);
//		entityTransaction.commit();

//		Query q=entityManager.createQuery("select r from Details111 r");
//	List<Details111>	l=q.getResultList();
//		for(Details111 s:l)
//			System.out.println(s);

		Query l= entityManager.createQuery("delete from Details111");

		entityTransaction.begin();
		l.executeUpdate();
		entityTransaction.commit();

	}
}