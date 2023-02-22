package OneToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Student {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	int id;
	String name;
	List<InstaAccount> i;

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

	public List<InstaAccount> getI() {
		return i;
	}

	public void setI(List<InstaAccount> i) {
		this.i = i;
	}

}
