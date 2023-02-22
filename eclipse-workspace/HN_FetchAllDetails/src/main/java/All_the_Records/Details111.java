package All_the_Records;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Details111 {
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
		return "Details111 [id=" + id + ", name=" + name + ", city=" + city + ", number=" + number + "]";
	}
	
}

