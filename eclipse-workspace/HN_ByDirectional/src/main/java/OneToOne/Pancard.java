package OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pancard {
	@Id
	String panNumber;
	@OneToOne
	Person per;

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public Person getPer() {
		return per;
	}

	public void setPer(Person per) {
		this.per = per;
	}
	

}
