package ManyToMany_ByDirectional;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Traveller {
	@Id
	String tra_Name;
	@ManyToMany
	List<TouristPlace> tP;

	public String getTra_Name() {
		return tra_Name;
	}

	public void setTra_Name(String tra_Name) {
		this.tra_Name = tra_Name;
	}

	public List<TouristPlace> gettP() {
		return tP;
	}

	public void settP(List<TouristPlace> tP) {
		this.tP = tP;
	}
}
