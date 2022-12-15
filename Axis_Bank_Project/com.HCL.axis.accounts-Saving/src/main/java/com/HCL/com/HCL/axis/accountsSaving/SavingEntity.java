package com.HCL.com.HCL.axis.accountsSaving;

import javax.persistence.Column;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Axis_Saving_Table")
public class SavingEntity {
	@Id
	@Column(name="Axis_Save_Acno")
	private int account_number;




	@Column(name="Axis_Save_Acname")
	private String company_name;

	@Column(name="Axis_Save_email")
	private String email;

	@Column(name="Axis_Save_Pass")
	private String password;

	@Column(name="Axis_Save_pan")
	private String pancard;

	public SavingEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingEntity(int account_number, String company_name, String email, String password, String pancard) {
		this.account_number = account_number;
		this.company_name = company_name;
		this.email = email;
		this.password = password;
		this.pancard = pancard;
	}

	public int getAccount_number() {
		return account_number;
	}

	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
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
	@Override
	public String toString() {
		return "SavingEntity [account_number=" + account_number + ", company_name=" + company_name + ", email=" + email
				+ ", password=" + password + ", pancard=" + pancard + "]";
	}

}
