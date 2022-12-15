package Axis_SavingModel;

public class AxisSavingModel {

	private int account_number;
	

	private String Holdername;
	 private String email;
	 private String password;
	 private String pancard;
	 
		public AxisSavingModel(int account_number, String holdername, String email, String password, String pancard) {
			this.account_number = account_number;
			Holdername = holdername;
			this.email = email;
			this.password = password;
			this.pancard = pancard;
		}
	 
	 public AxisSavingModel() {
			super();
			// TODO Auto-generated constructor stub
		}
	 public int getAccount_number() {
		return account_number;
	}
	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}
	public String getHoldername() {
		return Holdername;
	}
	public void setHoldername(String Holdername) {
		this.Holdername = Holdername;
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
			return "CurrentModelpojo [account_number=" + account_number + ", company_name=" + Holdername + ", email="
					+ email + ", password=" + password + ", pancard=" + pancard + "]";
		}
}
