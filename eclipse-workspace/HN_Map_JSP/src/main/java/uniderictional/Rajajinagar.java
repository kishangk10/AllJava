package uniderictional;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Rajajinagar {
	@Id
	private int pin_code;
	private String address;
	private int branches;
	
//	Get the relationship from Branches class by creating reference variable
//	and using List from java.util.packege.
	@OneToMany
	List<BranchesofRajajinagar> lst_br;
//	after establishing the relationship then Only we should provide
//	Getters and Setters Method.
	
	public int getPin_code() {
		return pin_code;
	}

	public List<BranchesofRajajinagar> getLst_br() {
		return lst_br;
	}

	public void setLst_br(List<BranchesofRajajinagar> lst_br) {
		this.lst_br = lst_br;
	}

	public void setPin_code(int pin_code) {
		this.pin_code = pin_code;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getBranches() {
		return branches;
	}

	public void setBranches(int branches) {
		this.branches = branches;
	}
}
