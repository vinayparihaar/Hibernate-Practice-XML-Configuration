/**
 * 
 */
package com.vinayparihar.hibernatexmlconfig.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author VinayParihar
 * @date May 13, 2020 @time 3:51:46 PM
 */
@Entity
@Table(name = "EMPLOYEE")
public class Employee {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int employeeId;
	@Column(name = "FIRST_NAME")
	private String employeeFirstName;
	@Column(name = "LAST_NAME")
	private String employeeLastName;
	@Column(name = "EMAIL")
	private String employeeEmail;
	@Column(name = "PHONE")
	private String employeePhone;

	public Employee() {

	}

	public Employee(int employeeId, String employeeFirstName, String employeeLastName, String employeeEmail,
			String employeePhone) {
		super();
		this.employeeId = employeeId;
		this.employeeFirstName = employeeFirstName;
		this.employeeLastName = employeeLastName;
		this.employeeEmail = employeeEmail;
		this.employeePhone = employeePhone;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeFirstName() {
		return employeeFirstName;
	}

	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}

	public String getEmployeeLastName() {
		return employeeLastName;
	}

	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public String getEmployeePhone() {
		return employeePhone;
	}

	public void setEmployeePhone(String employeePhone) {
		this.employeePhone = employeePhone;
	}

	
}
