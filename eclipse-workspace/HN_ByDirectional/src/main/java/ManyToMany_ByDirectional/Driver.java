package ManyToMany_ByDirectional;

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
		
		TouristPlace touristPlace=new TouristPlace();
		touristPlace.setPalce("tumkuru");
		
		TouristPlace touristPlace1=new TouristPlace();
		touristPlace1.setPalce("mysuru");
		
		TouristPlace touristPlace2=new TouristPlace();
		touristPlace2.setPalce("agumbe");
		
		List<TouristPlace> places=new ArrayList<TouristPlace>();
		places.add(touristPlace2);
		places.add(touristPlace1);
		places.add(touristPlace);
		
		Traveller traveller=new Traveller();
		traveller.setTra_Name("Muddu");
		
		Traveller traveller1=new Traveller();
		traveller1.setTra_Name("kaddu");
		
		Traveller traveller2=new Traveller();
		traveller2.setTra_Name("guddu");
		
		List<Traveller> t=new ArrayList<Traveller>();
		t.add(traveller2);
		t.add(traveller1);
		t.add(traveller);
		
		touristPlace.setTrave(t);
		touristPlace1.setTrave(t);
		touristPlace2.setTrave(t);
		
		traveller.settP(places);
		traveller1.settP(places);
		traveller2.settP(places);
		
		entityTransaction.begin();
		entityManager.persist(touristPlace);
		entityManager.persist(touristPlace1);
		entityManager.persist(touristPlace2);
		entityManager.persist(traveller);
		entityManager.persist(traveller1);
		entityManager.persist(traveller2);
		entityTransaction.commit();
		
	}

}
