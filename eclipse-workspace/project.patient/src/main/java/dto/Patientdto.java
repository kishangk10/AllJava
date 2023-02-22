package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patientdto {
	@Id
	private int Id;
	private String Name;
	private String Bood_Group;
	private long PH_Number;
	private int Age;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	@Override
	public String toString() {
		return "Patientdto [Id=" + Id + ", Name=" + Name + ", Bood_Group=" + Bood_Group + ", PH_Number=" + PH_Number
				+ ", Age=" + Age + "]";
	}

	public void setName(String name) {
		Name = name;
	}

	public String getBood_Group() {
		return Bood_Group;
	}

	public void setBood_Group(String bood_Group) {
		Bood_Group = bood_Group;
	}

	public long getPH_Number() {
		return PH_Number;
	}

	public void setPH_Number(long pH_Number) {
		PH_Number = pH_Number;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

}
