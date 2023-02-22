package ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Traveiler {
	@Id
	String tName;
	@ManyToMany
	List<TouristPlace> p;

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public List<TouristPlace> getP() {
		return p;
	}

	public void setP(List<TouristPlace> p) {
		this.p = p;
	}

}
