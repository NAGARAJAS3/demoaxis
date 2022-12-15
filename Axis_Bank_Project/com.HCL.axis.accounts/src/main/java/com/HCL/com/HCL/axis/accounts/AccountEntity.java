package com.HCL.com.HCL.axis.accounts;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Axis_accounts")
public class AccountEntity {
	@Id
	@Column(name="Ac_No")
	private int account_number;
	
	
	@Column(name="Ac_Type")
	private String account_type;
	
	// constructor
	public AccountEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// parameter constructor
	public AccountEntity(int account_number, String account_type) {
		this.account_number = account_number;
		this.account_type = account_type;
	}
	
	//getter setter
	public int getAccount_number() {
		return account_number;
	}
	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	
	@Override
	public String toString() {
		return "AccountEntity [account_number=" + account_number + ", account_type=" + account_type + "]";
	}
	

}
