package Mad_DB;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Details1 {
	@Id
	private int id;
	private String name;
	private int age;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Details1 [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	

}
