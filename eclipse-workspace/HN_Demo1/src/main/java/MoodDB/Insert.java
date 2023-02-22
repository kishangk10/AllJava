package MoodDB;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Insert {
	@Id
	static int id;
	static String name;
	static int age;

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Insert.id = id;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Insert.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		Insert.age = age;
	}
}
