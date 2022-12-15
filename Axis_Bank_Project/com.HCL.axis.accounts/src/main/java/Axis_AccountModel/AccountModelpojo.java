package Axis_AccountModel;

public class AccountModelpojo {
	
	private int account_number;
	private String account_type;
	
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
		return "AccountModelpojo [account_number=" + account_number + ", account_type=" + account_type + "]";
	}
	
}
