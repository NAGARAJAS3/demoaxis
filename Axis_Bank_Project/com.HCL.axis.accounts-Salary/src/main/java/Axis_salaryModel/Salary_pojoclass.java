package Axis_salaryModel;

public class Salary_pojoclass {

	private int account_number;
	private String  emplyoee_name;
	private String email;
	private String password;
	private String pancard;

	// constructor
	public Salary_pojoclass() {
		super();
		// TODO Auto-generated constructor stub
	}

	//constructor params
	public Salary_pojoclass(int account_number, String emplyoee_name, String email, String password, String pancard) {
		this.account_number = account_number;
		this.emplyoee_name = emplyoee_name;
		this.email = email;
		this.password = password;
		this.pancard = pancard;
	}


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

	@Override
	public String toString() {
		return "Salary_pojoclass [account_number=" + account_number + ", emplyoee_name=" + emplyoee_name + ", email="
				+ email + ", password=" + password + ", pancard=" + pancard + "]";
	}

}
