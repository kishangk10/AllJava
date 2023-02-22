package ManyToMany_ByDirectional;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class TouristPlace {
	@Id
	String palce;
	@ManyToMany
	List<Traveller> trave;

	public String getPalce() {
		return palce;
	}

	public void setPalce(String palce) {
		this.palce = palce;
	}

	public List<Traveller> getTrave() {
		return trave;
	}

	public void setTrave(List<Traveller> trave) {
		this.trave = trave;
	}
}
