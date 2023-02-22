package uniderictional;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BranchesofRajajinagar {
	@Id
	private String branch_land_mark;
	private String branch_name;
	private String branche_course;

//	because of we doing unidirectional here don't establish the relationship
//	with other class. directly give the getters and setters method for the Variables.
	public String getBranch_land_mark() {
		return branch_land_mark;
	}

	public void setBranch_land_mark(String branch_land_mark) {
		this.branch_land_mark = branch_land_mark;
	}

	public String getBranch_name() {
		return branch_name;
	}

	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}

	public String getBranche_course() {
		return branche_course;
	}

	public void setBranche_course(String branche_course) {
		this.branche_course = branche_course;
	}

}
