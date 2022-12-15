package com.HCL.com.HCL.axis.accountsSalary;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Salary_Account")

public class Salary_Entity {
	@Id
	@Column(name="SAc_No")
	private int account_number;
	
	@Column(name="SAc_EmpName")
	private String  emplyoee_name;
	
	@Column(name="SAc_Email")
	private String email;
	
	@Column(name="SAc_Password")
	private String password;
	
	@Column(name="SAc_PanCard")
	private String pancard;
	
	
	

	
	
	// getter and setter
	public int getAccount_number() {
		return account_number;
	}

	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}

	public String getEmplyoee_name() {
		return emplyoee_name;
	}

	public void setEmplyoee_name(String emplyoee_name) {
		this.emplyoee_name = emplyoee_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPancard() {
		return pancard;
	}

	public void setPancard(String pancard) {
		this.pancard = pancard;
	}

	
	
	// constructor
	public Salary_Entity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//constructor with params
	public Salary_Entity(int account_number, String emplyoee_name, String email, String password, String pancard) {
		this.account_number = account_number;
		this.emplyoee_name = emplyoee_name;
		this.email = email;
		this.password = password;
		this.pancard = pancard;
	}
	
	
	@Override
	public String toString() {
		return "Salary_Entity [account_number=" + account_number + ", emplyoee_name=" + emplyoee_name + ", email="
				+ email + ", password=" + password + ", pancard=" + pancard + "]";
	}

}
