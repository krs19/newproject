package MedSys.domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import MedSys.domain.EmployeeRoles;


@Entity 

public class Employee {
	
	@Id
	@GeneratedValue  (strategy = GenerationType.TABLE)
	public int employeeID;
	
	
	
	
	
	
	@OneToOne (fetch = FetchType.LAZY )
	   
	@JoinColumn(name = "roleID")
	
	public EmployeeRoles roleID;
	
	@Column 
	
	public String username;
	
	@Column
	
	public String password;

	public Employee() {
		super();
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public int getRoleID() {
		return roleID.getRoleID();
	}



	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
