package ManyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		TouristPlace touristPlace = new TouristPlace();
		touristPlace.setName("Tumakur");

		TouristPlace touristPlace1 = new TouristPlace();
		touristPlace1.setName("Mysuru");

		TouristPlace touristPlace2 = new TouristPlace();
		touristPlace2.setName("Agumbe");

		List<TouristPlace> l = new ArrayList<TouristPlace>();
		l.add(touristPlace);
		l.add(touristPlace1);
		l.add(touristPlace2);

		Traveiler traveiler = new Traveiler();
		traveiler.settName("Ramesh");
		traveiler.setP(l);

		Traveiler traveiler1 = new Traveiler();
		traveiler1.settName("Suresh");
		traveiler1.setP(l);

		Traveiler traveiler2 = new Traveiler();
		traveiler2.settName("Mahesh");
		traveiler2.setP(l);
		
		entityTransaction.begin();
		entityManager.persist(touristPlace);
		entityManager.persist(touristPlace1);
		entityManager.persist(touristPlace2);
		entityManager.persist(traveiler);
		entityManager.persist(traveiler1);
		entityManager.persist(traveiler2);
		entityTransaction.commit();
	}
}
