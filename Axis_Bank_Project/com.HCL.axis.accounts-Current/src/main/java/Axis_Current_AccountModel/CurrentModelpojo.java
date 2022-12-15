package Axis_Current_AccountModel;

public class CurrentModelpojo {

private int account_number;
 private String company_name;
 private String email;
 private String password;
 private String pancard;
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
		return "CurrentModelpojo [account_number=" + account_number + ", company_name=" + company_name + ", email="
				+ email + ", password=" + password + ", pancard=" + pancard + "]";
	}

}
