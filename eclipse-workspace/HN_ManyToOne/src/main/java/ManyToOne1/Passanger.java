package ManyToOne1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Passanger {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	int id;
	String name;
	@ManyToOne
	Train t;

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

	public Train getT() {
		return t;
	}

	public void setT(Train t) {
		this.t = t;
	}
}
