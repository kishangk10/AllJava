package OneToMany_ManyToOne;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {
	@Id
	String name;
	@OneToMany
	List<InstaAccount> iA;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<InstaAccount> getiA() {
		return iA;
	}

	public void setiA(List<InstaAccount> iA) {
		this.iA = iA;
	}

}
