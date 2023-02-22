package OneToOne;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Person {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	int id;
	String name;
	@OneToOne
	PanCard p;

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

	public PanCard getP() {
		return p;
	}

	public void setP(PanCard p) {
		this.p = p;
	}

}
