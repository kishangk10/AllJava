package OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	String name;
	@OneToOne
	Pancard pC;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Pancard getpC() {
		return pC;
	}

	public void setpC(Pancard pC) {
		this.pC = pC;
	}
}
