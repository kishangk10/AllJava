package ManyToMany;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TouristPlace {
	@Id
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
