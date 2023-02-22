package ManyToOne1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Train {
	@Id
	String t_name;

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String t_name) {
		this.t_name = t_name;
	}

}
