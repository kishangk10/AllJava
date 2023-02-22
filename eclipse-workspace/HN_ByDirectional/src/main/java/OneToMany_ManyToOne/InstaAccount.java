package OneToMany_ManyToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class InstaAccount {
	@Id
	String iAccName;
	@ManyToOne
	Student s;

	public String getiAccName() {
		return iAccName;
	}

	public void setiAccName(String iAccName) {
		this.iAccName = iAccName;
	}

	public Student getS() {
		return s;
	}

	public void setS(Student s) {
		this.s = s;
	}
}
