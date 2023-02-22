package All_records;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Id;
import javax.persistence.Persistence;
import javax.persistence.Query;

@Entity
class DataCollection {
	@Id
	private int id;
	private String name;
	private String city;
	private long number;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "DataCollection [id=" + id + ", name=" + name + ", city=" + city + ", number=" + number + "]";
	}
	
}



public class MainDetails {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
//		Insert
		
//		DataCollection dataCollection =new DataCollection();
//		dataCollection.setId(4);
//		dataCollection.setName("essdqwe");
//		dataCollection.setCity("rdccddtt");
//		dataCollection.setNumber(425862l);
//		
//		entityTransaction.begin();
//		entityManager.persist(dataCollection);
//		entityTransaction.commit();
		
//		Update
		
//		DataCollection r=entityManager.find(DataCollection.class, 1);
//		r.setName("abcd");
//		
//		entityTransaction.begin();
//		entityManager.merge(r);
//		entityTransaction.commit();
		
//		select single record
		
//		DataCollection r=entityManager.find(DataCollection.class, 1);
//		System.out.println(r);
		
//		Delete a single record
		
//		DataCollection r=entityManager.find(DataCollection.class, 3);
//		
//		entityTransaction.begin();
//		entityManager.remove(r);
//		entityTransaction.commit();
	
//		select all the records
		
//		Query q=entityManager.createQuery("select g from DataCollection g");
//		List<DataCollection> l=q.getResultList();
//		for(DataCollection d:l)
//			System.out.println(d);
		
//		Delete all the Records
		
		Query r=entityManager.createQuery("delete from DataCollection");
		
		entityTransaction.begin();
		r.executeUpdate();
		entityTransaction.commit();
	}
}
