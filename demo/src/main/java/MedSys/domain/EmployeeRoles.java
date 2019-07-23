package MedSys.domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity 

public class EmployeeRoles {
	
	@Id
	@GeneratedValue  (strategy = GenerationType.TABLE)
	
	public int roleID;
	

	@Column 
	
	public String job_role;
	
	@Column
	
	public String first_name;
	
	@Column
	
	public String last_name;
	
	@Column
	
	public String expertise;
	
	@Column
	
	public String addressofwork;   
	
	
	

	public EmployeeRoles() {
		super();
	}




	public int getRoleID() {
		return roleID;
	}




	public void setRoleID(int roleID) {
		this.roleID = roleID;
	}




	public String getJob_role() {
		return job_role;
	}




	public void setJob_role(String job_role) {
		this.job_role = job_role;
	}




	public String getFirst_name() {
		return first_name;
	}




	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}




	public String getLast_name() {
		return last_name;
	}




	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}




	public String getExpertise() {
		return expertise;
	}




	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}




	public String getAddressofwork() {
		return addressofwork;
	}




	public void setAddressofwork(String addressofwork) {
		this.addressofwork = addressofwork;
	}
	
	
	
	
	
	
	
}

	