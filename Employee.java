package org.main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity

@Table(name = "Emp_Details")
public class Employee {

	@Id
	@GeneratedValue
	@Column(name = "Emp_Id")
	private int id;
	@Column(name = "E_NAME", length = 150, nullable = false)
	private String name;
	@Column(name = "EMAIL", length = 100, nullable = false, unique = true)
	private String emailId;
	@Column(name = "PH_NO", length = 10, nullable = false, unique = true)
	private long phone;
	@Column(name = "HRA", length = 100, nullable = true)
	private float houseRentAllowance;
	@Column(name = "PF", length = 100, nullable = true)
	private float providentFund;
	@Column(name = "Basic_salary")
	private double basicSalary;
	@Column(name = "TA")
	private float travelAllowance;
	@Column(name = "DA")
	private float dearnessAllowance;
	@Transient
	private float netSalary;

	public Employee(String name, String emailId, long phone) {
	
		this.name = name;
		this.emailId = emailId;
		this.phone = phone;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

}
