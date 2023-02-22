package OneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class InstaAccount {
	@Id
	String instaName;

	public String getInstaName() {
		return instaName;
	}

	public void setInstaName(String instaName) {
		this.instaName = instaName;
	}
	
}
