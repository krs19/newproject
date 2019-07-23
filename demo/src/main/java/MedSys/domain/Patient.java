package MedSys.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity 

public class Patient {
	
	@Id
	@GeneratedValue  (strategy = GenerationType.TABLE)
	public int patientID;
	
	

	
	@Column 
	
	public String firstname;
	
	@Column
	
	public String lastname;
	
	@Column
	
	public Date dob;
	
	@Column
	
	public String address;
	
	@Column
	
	public String sex;
	
	@Column
	
	public String bloodtype;
	
	

	public Patient() {
		super();
	}

	public int getPatientID() {
		return patientID;
	}

	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}

	public String getFirstName() {
		return firstname;
	}

	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastname;
	}

	public void setLastName(String lastname ){
		this.lastname = lastname;
	}

	public Date getDob() {
		return dob;
	}

	public void SetDOB (Date dob) {
		this.dob = dob;
	}
	
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
	public String getBloodType() {
		return firstname;
	}

	public void setBloodType(String bloodtype) {
		this.bloodtype = bloodtype;
	}
	
	
	
}
	